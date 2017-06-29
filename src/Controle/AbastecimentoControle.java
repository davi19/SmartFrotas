/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.AbastecimentoModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class AbastecimentoControle {
    
    Conexao c = new Conexao();
    
    public void inserir(AbastecimentoModelo p){    
               
        String sentenca = "INSERT INTO Abastecimento VALUES('"+p.getCodAbastecimento()+"','"+p.getCodVeiculo()+"','"+p.getQtdAbastecida()+"','"+p.getKmDeAbastecimento()+"','"+p.getKmDeAbastecimentoAnterior()+"','"+p.getDataAbastecimento()+"')";
        
       try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
            
        } catch (SQLException ex){
        
            //System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
             
            }
    }
    
        public void excluir(int codAbastecimento){
            
    	String sentenca = "DELETE FROM Abastecimento WHERE codAbastecimento="+codAbastecimento;
    	
          try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		
              } catch (SQLException ex){
 
                System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
        
        }
    }
        
        public void editar(AbastecimentoModelo p){
    
        String sentenca = "UPDATE Abastecimento set placaVeiculo = '"+p.getCodVeiculo()+"', quantidadeAbastecida = '"+p.getQtdAbastecida()+"', quilometroAbastecido = '"+p.getKmDeAbastecimento()+"', quilometroDeAbastecimentoAnterior = '"+p.getKmDeAbastecimentoAnterior()+"', dataAbastecimento = '"+p.getDataAbastecimento()+"' WHERE codAbastecimento="+p.getCodAbastecimento();
    	
          try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                 
		} catch (SQLException ex){
        
                //System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
        
        }
    }
        
    
}
