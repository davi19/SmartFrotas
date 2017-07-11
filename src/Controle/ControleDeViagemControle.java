/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.ControleDeViagemModelo;
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
public class ControleDeViagemControle {
    
    Conexao c = new Conexao();
    
     public void inserir(ControleDeViagemModelo p){    
       	
         
        String sentenca = "INSERT INTO controle (nomeMotorista, placaVeiculo, KmEntrada, KmSaida, dataSaida, dataEntrada) VALUES('"+p.getNomeMotorista()+"','"+p.getPlacaVeiculo()+"','"+p.getKmEntrada()+"','"+p.getKmSaida()+"','"+p.getDataSaida()+"','"+p.getDataEntrada()+"')";
        
        try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< \n");
             JOptionPane.showMessageDialog(null, "Viagem cadastrada com Sucesso!","CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex){
        
             System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< \n");
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Viagem!", "ERRO", JOptionPane.ERROR_MESSAGE);
             
            }
    }
     
     public void excluir(int codControle){
         
      
    	String sentenca = "DELETE FROM controle WHERE codControle="+codControle;
        
    	try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< \n");
                JOptionPane.showMessageDialog(null, "Viagem excluida com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
		
              } catch (SQLException ex){
                 System.out.print(ex.getMessage()); 
                 System.out.print(" >>>> ERRO AO DELETAR  <<<< \n");
                 JOptionPane.showMessageDialog(null, "Erro ao excluir Viagem!", "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }
    }
     
     public void editar(ControleDeViagemModelo p){
    
        String sentenca = "UPDATE controle set nomeMotorista = '"+p.getNomeMotorista()+"', placaVeiculo = '"+p.getPlacaVeiculo()+"', KmSaida = '"+p.getKmSaida()+"', KmEntrada = '"+p.getKmEntrada()+"', dataSaida = '"+p.getDataSaida()+"', dataEntrada = '"+p.getDataEntrada()+"' WHERE codControle="+p.getCodControle();
    	
        try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< \n");
                JOptionPane.showMessageDialog(null, "Dados da Viagem atualizados com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                 
		} catch (SQLException ex){
                System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO ALTERAR  <<<< \n");
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados da Viagem!", "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }
    }
     
     public Vector Pesquisar(String pesq) throws Exception {

        Vector tb = new Vector(); // Instanciando um objeto Vector que tem a mesma função que um vetor
        String sentenca = "select * from controle where nomeMotorista like'" + pesq + "%'"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery(); // comando que executa a busca

        while (rs.next()) { // caminha sobre o vetor
            Vector nl = new Vector();
            nl.add(rs.getInt("codControle")); // adiciona a variavel no vetor
            nl.add(rs.getString("nomeMotorista"));
            nl.add(rs.getString("placaVeiculo"));
            nl.add(rs.getInt("kmSaida"));
            nl.add(rs.getInt("kmEntrada"));
            nl.add(rs.getDate("dataSaida"));
            nl.add(rs.getDate("dataEntrada"));
            tb.add(nl); // adiciona o vetor com as variaveis em um outro vetor vazio
        }
        return tb; // retorna o vetor
    }
    
    
}
