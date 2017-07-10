/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.AbastecimentoModelo;
import java.sql.SQLException;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author edevaldo
 */
public class AbastecimentoControle {
    
    Conexao c = new Conexao();
    
    public void inserir(AbastecimentoModelo p){ 
        
               
            String sentenca = "INSERT INTO abastecimento (placaVeiculo, quantidadeAbastecida, quilometroAbastecido,quilometroDeAbastecimentoAnterior, dataAbastecimento) VALUES('"+p.getplacaVeiculo()+"','"+p.getQtdAbastecida()+"','"+p.getKmDeAbastecimento()+"','"+p.getKmDeAbastecimentoAnterior()+"','"+p.getDataAbastecimento()+"')";

           try{

                 c.stmt.execute(sentenca); 
                 System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< \n");
                 JOptionPane.showMessageDialog(null, "Abastecimento inserido com Sucesso!","CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);


            } catch (SQLException ex){

                 //System.out.print(ex.getMessage());  
                 System.out.print(" >>>> ERRO AO INSERIR  <<<< \n");
                 JOptionPane.showMessageDialog(null, "Erro ao inserir Abastecimento!", "ERRO", JOptionPane.ERROR_MESSAGE);


                }
    }
    
        public void excluir(int codAbastecimento){
            
    	String sentenca = "DELETE FROM Abastecimento WHERE codAbastecimento="+codAbastecimento;
    	
         try {
            c.stmt.execute(sentenca);
            System.out.print(" >>>> DELETADO COM SUCESSO  <<<< \n");
            JOptionPane.showMessageDialog(null, "Abastecimento excluido com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {

            System.out.print(" >>>> ERRO AO DELETAR  <<<< \n");
            JOptionPane.showMessageDialog(null, "Erro ao excluir Abastecimento!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }
        
        public void editar(AbastecimentoModelo p){
    
        String sentenca = "UPDATE abastecimento set placaVeiculo = '"+p.getplacaVeiculo()+"', quantidadeAbastecida = '"+p.getQtdAbastecida()+"', quilometroAbastecido = '"+p.getKmDeAbastecimento()+"', quilometroDeAbastecimentoAnterior = '"+p.getKmDeAbastecimentoAnterior()+"', dataAbastecimento = '"+p.getDataAbastecimento()+"' WHERE codAbastecimento="+p.getCodAbastecimento();
    	
          try {
                c.stmt.execute(sentenca);
                System.out.print(" >>>> EDITADO COM SUCESSO  <<<< \n");
                JOptionPane.showMessageDialog(null, "Dados do Abastecimento atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {

                System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO editar  <<<< \n");
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Abastecimento!", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
    }
        
        public Vector Pesquisar(String pesq) throws Exception {

        Vector tb = new Vector(); // Instanciando um objeto Vector que tem a mesma funÃ§Ã£o que um vetor
        String sentenca = "select * from abastecimento where placaVeiculo like'" + pesq + "%'"; //funÃ§Ã£o que pesquisa os NOMES dos motorista que estÃ£o no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentenÃ§a

        ResultSet rs = ps.executeQuery(); // comando que executa a busca

        while (rs.next()) { // caminha sobre o vetor
            Vector nl = new Vector();
            nl.add(rs.getInt("codAbastecimento")); // adiciona a variavel no vetor
            nl.add(rs.getString("placaVeiculo"));
            nl.add(rs.getFloat("quantidadeAbastecida"));
            nl.add(rs.getInt("quilometroAbastecido"));
            nl.add(rs.getInt("quilometroDeAbastecimentoAnterior"));
            nl.add(rs.getDate("dataAbastecimento"));
            tb.add(nl); // adiciona o vetor com as variaveis em um outro vetor vazio
        }
        return tb; // retorna o vetor
    }  
}
