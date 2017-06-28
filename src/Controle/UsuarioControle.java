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
    
   public void inserir(UsuarioModelo p){    

    
        try{
        
        Conexao c = new Conexao();
        
        String sentenca = "INSERT INTO UsuarioSistema VALUES("+p.getLogin()+",'"+p.getSenha()+"','"+p.getNivelPermissao()+"')";
        
        c.stmt.execute(sentenca);
        
            } catch (SQLException ex){
        
            System.out.print(ex.getMessage());  
        
        }
    } 
   
   public void excluir(UsuarioModelo p){
    	String sentenca = "DELETE FROM UsuarioSistema WHERE codigo="+p.getLogin();
    	try {
		new Conexao().stmt.execute(sentenca);
		
              } catch (SQLException e) {
			e.printStackTrace();
		}
    }
   
    public void editar(UsuarioModelo p){
    
        String sentenca = "UPDATE UsuarioSistema set senha = '"+p.getSenha()+"', nivelPermissao = '"+p.getNivelPermissao()+"' WHERE login="+p.getLogin();
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
     
}
