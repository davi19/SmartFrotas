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
import java.util.Vector;
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
   
   public void excluir(int codUsuario){
       
    	String sentenca = "DELETE FROM usuarioSistema WHERE codUsuario="+codUsuario;
        
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
            
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario!", "ERRO", JOptionPane.ERROR_MESSAGE); // Necessita desse erro para o usuario

            }else{ 

                String sentenca = "UPDATE usuarioSistema set login = '"+p.getLogin()+"', senha = '"+p.getSenha()+"', nivelPermissao = '"+p.getNivelPermissao()+"' WHERE codUsuario="+p.getCodUsuario();

                try {
                        c.stmt.execute(sentenca);
                        //System.out.print(" >>>> ALTERADO COM SUCESSO  <<<< ");
                        JOptionPane.showMessageDialog(null, "Dados do Usuário atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                        
                        } catch (SQLException ex){
                        
                        //System.out.print(ex.getMessage());
                        System.out.print(" >>>> ERRO AO ALTERAR  <<<< ");
                        //JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Usuário!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            
    }
            
    }
    
    public Vector Pesquisar(String pesq) throws Exception {

        Vector tb = new Vector(); // Instanciando um objeto Vector que tem a mesma funÃ§Ã£o que um vetor
        String sentenca = "select * from usuariosistema where login like'" + pesq + "%'"; //funÃ§Ã£o que pesquisa os NOMES dos motorista que estÃ£o no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentenÃ§a

        ResultSet rs = ps.executeQuery(); // comando que executa a busca

        while (rs.next()) { // caminha sobre o vetor
            Vector nl = new Vector();
            nl.add(rs.getInt("codUsuario"));
            nl.add(rs.getString("login")); // adiciona a variavel no vetor
            nl.add(rs.getString("senha"));
            nl.add(rs.getString("nivelPermissao"));
            tb.add(nl); // adiciona o vetor com as variaveis em um outro vetor vazio
        }
        return tb; // retorna o vetor
    }
     
}
