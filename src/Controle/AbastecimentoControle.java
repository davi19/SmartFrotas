/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.AbastecimentoModelo;
import java.sql.SQLException;
import Util.Conexao;
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
                 //System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
                 JOptionPane.showMessageDialog(null, "Abastecimento inserido com Sucesso!","CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);


            } catch (SQLException ex){

                 //System.out.print(ex.getMessage());  
                 //System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
                 JOptionPane.showMessageDialog(null, "Erro ao inserir Abastecimento!", "ERRO", JOptionPane.ERROR_MESSAGE);


                }
    }
    
        public void excluir(int codAbastecimento){
            
    	String sentenca = "DELETE FROM Abastecimento WHERE codAbastecimento="+codAbastecimento;
    	
         try {
            c.stmt.execute(sentenca);
            //System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
            JOptionPane.showMessageDialog(null, "Abastecimento excluido com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {

            //System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
            JOptionPane.showMessageDialog(null, "Erro ao excluir Abastecimento!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }
        
        public void editar(AbastecimentoModelo p){
    
        String sentenca = "UPDATE abastecimento set placaVeiculo = '"+p.getplacaVeiculo()+"', quantidadeAbastecida = '"+p.getQtdAbastecida()+"', quilometroAbastecido = '"+p.getKmDeAbastecimento()+"', quilometroDeAbastecimentoAnterior = '"+p.getKmDeAbastecimentoAnterior()+"', dataAbastecimento = '"+p.getDataAbastecimento()+"' WHERE codAbastecimento="+p.getCodAbastecimento();
    	
          try {
                c.stmt.execute(sentenca);
                JOptionPane.showMessageDialog(null, "Dados do Abastecimento atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {

                System.out.print(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Abastecimento!", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
    }
        
    
}
