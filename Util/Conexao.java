package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
     public Connection con;
     public Statement stmt;

    public Conexao() {

    try {
    
     Class.forName("com.mysql.jdbc.Driver");
        
     String url="jdbc:mysql://localhost/NomeDB";
     String user="root";
     String password="123";

            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();


        } catch (SQLException ex) {
            System.out.print("Erro"+ ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.print("Erro"+ ex.getMessage());
        }
}
      
    
}