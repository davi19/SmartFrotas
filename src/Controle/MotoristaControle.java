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
    
    public void inserir(MotoristaModelo p){    

    
        try{
        
        Conexao c = new Conexao();
        
        String sentenca = "INSERT INTO Motorista VALUES("+p.getCodMotorista()+",'"+p.getNome()+"','"+p.getCategoriaCNH()+"','"+p.getNumeroCNH()+"','"+p.getDataDeEmissaoCNH()+"')";
        
        c.stmt.execute(sentenca);
        
            } catch (SQLException ex){
        
            System.out.print(ex.getMessage());  
        
        }
    } 
    
    public void excluir(MotoristaModelo p){
    	String sentenca = "DELETE FROM Motorista WHERE codMotorista="+p.getCodMotorista();
    	try {
		new Conexao().stmt.execute(sentenca);
		
              } catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public void editar(MotoristaModelo p){
    
        String sentenca = "UPDATE Motorista set nomeMotorista = '"+p.getNome()+"', categoriaCNH = '"+p.getCategoriaCNH()+"', numeroCNH = '"+p.getNumeroCNH()+"', dataDeEmissaoCNH = '"+p.getDataDeEmissaoCNH()+"' WHERE codMotorista="+p.getCodMotorista();
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
}
