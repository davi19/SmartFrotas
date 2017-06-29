/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.ControleDeViagemModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class ControleDeViagemControle {
    
    Conexao c = new Conexao();
    
     public void inserir(ControleDeViagemModelo p){    

              
        String sentenca = "INSERT INTO Controle VALUES('"+p.getCodControle()+"','"+p.getCodMotorista()+"','"+p.getCodVeiculo()+"','"+p.getKmSaida()+"','"+p.getKmEntrada()+"','"+p.getDataSaida()+"','"+p.getDataEntrada()+"')";
        
        try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
            
        } catch (SQLException ex){
        
            //System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
             
            }
    }
     
     public void excluir(int codControle){
         
    	String sentenca = "DELETE FROM Controle WHERE codControle="+codControle;
        
    	try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		
              } catch (SQLException ex){
 
                System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
        
        }
    }
     
     public void editar(ControleDeViagemModelo p){
    
        String sentenca = "UPDATE Controle set codMotorista = '"+p.getCodMotorista()+"', placaVeiculo = '"+p.getCodVeiculo()+"', KmSaida = '"+p.getKmSaida()+"', KmEntrada = '"+p.getKmEntrada()+"', dataSaida = '"+p.getDataSaida()+"', dataEntrada = '"+p.getDataEntrada()+"' WHERE codControle="+p.getCodControle();
    	
        try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                 
		} catch (SQLException ex){
        
                //System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
        
        }
    }
    
    
}
