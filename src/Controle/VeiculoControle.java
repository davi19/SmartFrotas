/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.VeiculoModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class VeiculoControle {
    
    Conexao c = new Conexao();
    
     public void inserir(VeiculoModelo p){    
      
        String sentenca = "INSERT INTO Veiculo VALUES('"+p.getPlacaVeiculo()+"','"+p.getTipoVeiculo()+"','"+p.getFabricante()+"','"+p.getModelo()+"','"+p.getCor()+"','"+p.getAnoFabricacao()+"','"+p.getNumeroChassi()+"','"+p.getCapacidadeTanque()+"','"+p.getMediaConsumo()+"')";
        
        try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
            
        } catch (SQLException ex){
        
             System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
             
            }
    }
     
     public void excluir(String placaVeiculo){
         
    	String sentenca = "DELETE FROM Veiculo WHERE placaVeiculo="+placaVeiculo;
        
    	try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		
              } catch (SQLException ex){
 
                System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
        
        }
    }
    
     public void editar(VeiculoModelo p){
    
        String sentenca = "UPDATE Veiculo set placaVeiculo = '"+p.getPlacaVeiculo()+"', tipoVeiculo = '"+p.getTipoVeiculo()+"', fabricante = '"+p.getFabricante()+"', modelo = '"+p.getModelo()+"', cor = '"+p.getCor()+"', anoFabricacao = '"+p.getAnoFabricacao()+"', numeroChassi = '"+p.getNumeroChassi()+"', capacidadeTanque = '"+p.getCapacidadeTanque()+"', mediaConsumo = '"+p.getMediaConsumo()+"' WHERE placaVeiculo="+p.getPlacaVeiculo();
    	
       try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                 
		} catch (SQLException ex){
        
                System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
        
        }
    }
    
}
