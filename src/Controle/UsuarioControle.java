/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.UsuarioModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class UsuarioControle {
    
     Conexao c = new Conexao();
     
   public void inserir(UsuarioModelo p){
            
                       
      String sentenca = "INSERT INTO UsuarioSistema VALUES ('"+p.getLogin()+"','"+p.getSenha()+"','"+p.getNivelPermissao()+"')";
       
        try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
            
        } catch (SQLException ex){
        
            //System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
             
            }
    } 
   
   public void excluir(String login){
       
    	String sentenca = "DELETE FROM UsuarioSistema WHERE login="+login;
        
    	try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		
              } catch (SQLException ex){
 
                System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
        
        }
    }
   
    public void editar(UsuarioModelo p){
    
        String sentenca = "UPDATE UsuarioSistema set senha = '"+p.getSenha()+"', nivelPermissao = '"+p.getNivelPermissao()+"' WHERE login="+p.getLogin();
    	
        try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                 
		} catch (SQLException ex){
        
                //System.out.print(ex.getMessage());
                System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
        
        }
    }
    
     
}
