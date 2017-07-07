/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.UsuarioModelo;
import java.sql.SQLException;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.TelaInicial;

/**
 *
 * @author edevaldo
 */
public class UsuarioControle {
    
     Conexao c = new Conexao();
     
     public void login(UsuarioModelo p) throws SQLException{
     
        String sentenca_consulta = "SELECT * FROM usuariosistema WHERE login = '" + p.getLogin() + "' AND senha = '" + p.getSenha() + "'" ;
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca_consulta); // executa a sentença
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){ //existe 
            
           TelaInicial frame = new TelaInicial();
           frame.setVisible(true);
               
        }else{
            
            JOptionPane.showMessageDialog(null, "Dados inválido. Tente Novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
 
            
        }
        
        }
     
   
   public void inserir(UsuarioModelo p) throws SQLException{
            
        String sentenca_consulta = "SELECT * FROM usuariosistema WHERE login = '" + p.getLogin() + "'";
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca_consulta); // executa a sentença
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){ //existe 
            
        JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário!\nEsse usuário já está cadastrado no sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }else{
                       
                String sentenca = "INSERT INTO usuariosistema (login, senha, nivelPermissao) VALUES ('"+p.getLogin()+"','"+p.getSenha()+"','"+p.getNivelPermissao()+"')";

                  try{

                       c.stmt.execute(sentenca); 
                       //System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
                       JOptionPane.showMessageDialog(null, "Usuário inserido com Sucesso!","CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);


                  } catch (SQLException ex){

                       //System.out.print(ex.getMessage());  
                       //System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
                       JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário!", "ERRO", JOptionPane.ERROR_MESSAGE);
 
                      }
                  
        }
    } 
   
   public void excluir(String login){
       
    	String sentenca = "DELETE FROM UsuarioSistema WHERE login="+login;
        
    	try {
		c.stmt.execute(sentenca);
               //System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		 JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
               
              } catch (SQLException ex){
 
                //System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
                JOptionPane.showMessageDialog(null, "Erro ao excluir Usuário!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void editar(UsuarioModelo p) throws SQLException{
    
        String sentenca_consulta = "SELECT * FROM usuariosistema WHERE login = '" + p.getLogin() + "'";
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca_consulta); // executa a sentença
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){ //existe 
            
            JOptionPane.showMessageDialog(null, "Erro ao inserir Motorista!\nEssa CNH já está cadastrada no sistema", "ERRO", JOptionPane.ERROR_MESSAGE);

            }else{ 

                String sentenca = "UPDATE UsuarioSistema set senha = '"+p.getSenha()+"', nivelPermissao = '"+p.getNivelPermissao()+"' WHERE login="+p.getLogin();

                try {
                        c.stmt.execute(sentenca);
                        //System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                        JOptionPane.showMessageDialog(null, "Dados do Usuário atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                        
                        } catch (SQLException ex){

                        //System.out.print(ex.getMessage());
                        //System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
                        JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Usuário!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            
    }
            
            
            
    }
    
     
}
