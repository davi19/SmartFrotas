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
    
     public void inserir(ControleDeViagemModelo p){    

    
        try{
        
        Conexao c = new Conexao();
        
        String sentenca = "INSERT INTO Controle VALUES("+p.getCodControle()+",'"+p.getMotorista()+"','"+p.getVeiculo()+"','"+p.getKmSaida()+"','"+p.getKmEntrada()+"','"+p.getDataSaida()+"','"+p.getDataEntrada()+"')";
        
        c.stmt.execute(sentenca);
        
            } catch (SQLException ex){
        
            System.out.print(ex.getMessage());  
        
        }
    }
     
     public void excluir(ControleDeViagemModelo p){
    	String sentenca = "DELETE FROM Controle WHERE codControle="+p.getCodControle();
    	try {
		new Conexao().stmt.execute(sentenca);
		
              } catch (SQLException e) {
			e.printStackTrace();
		}
    }
     
     public void editar(ControleDeViagemModelo p){
    
        String sentenca = "UPDATE Controle set codMotorista = '"+p.getMotorista()+"', placaVeiculo = '"+p.getVeiculo()+"', KmSaida = '"+p.getKmSaida()+"', KmEntrada = '"+p.getKmEntrada()+"', dataSaida = '"+p.getDataSaida()+"', dataEntrada = '"+p.getDataEntrada()+"' WHERE codControle="+p.getCodControle();
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    
}
