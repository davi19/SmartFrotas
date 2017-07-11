package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
     public Connection con;
     public Statement stmt;

    public Conexao() {

    try {
    
     Class.forName("com.mysql.jdbc.Driver");
        
     String url="jdbc:mysql://localhost/frotas";
     String user="root";
     String password="";

            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            
            System.out.print(" >>>> DB CONECTADO COM SUCESSO  <<<< ");

        } catch (SQLException | ClassNotFoundException ex) {
            
            System.out.print("Problemas na conexao com o banco de dados | Erro >"+ ex.getMessage());
            
        }
}

    public PreparedStatement stmt(String sentenca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection getConexao(){
        return con;
    }

    
}