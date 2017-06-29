/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.MotoristaModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class MotoristaControle {   
    
    Conexao c = new Conexao();
    
    public void inserir(MotoristaModelo p){    
       
        String sentenca = "INSERT INTO Motorista VALUES('"+p.getCodMotorista()+"','"+p.getNome()+"','"+p.getCategoriaCNH()+"','"+p.getNumeroCNH()+"','"+p.getDataDeEmissaoCNH()+"')";
        
         try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
            
        } catch (SQLException ex){
        
            //System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
             
            }
    } 
    
    public void excluir(int codMotorista){
        
    	String sentenca = "DELETE FROM Motorista WHERE codMotorista="+codMotorista;
        
    	try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		
              } catch (SQLException ex){
 
                System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
        
        }
    }
    
    public void editar(MotoristaModelo p){
    
        String sentenca = "UPDATE Motorista set nomeMotorista = '"+p.getNome()+"', categoriaCNH = '"+p.getCategoriaCNH()+"', numeroCNH = '"+p.getNumeroCNH()+"', dataDeEmissaoCNH = '"+p.getDataDeEmissaoCNH()+"' WHERE codMotorista="+p.getCodMotorista();
    	
    try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                 
		} catch (SQLException ex){
        
                //System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
        
        }
    
    }
    
}
