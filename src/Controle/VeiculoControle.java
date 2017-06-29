/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.VeiculoModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class VeiculoControle {
    
     public void inserir(VeiculoModelo p){    

    
        try{
        
        Conexao c = new Conexao();
        
        String sentenca = "INSERT INTO Veiculo VALUES("+p.getPlacaVeiculo()+",'"+p.getTipoVeiculo()
        		+"','"+p.getFabricante()+"','"+p.getModelo()+"','"+p.getAnoFabricacao()+"','"
        		+p.getMediaConsumo()+"','"+p.getCapacidadeTanque()+"','"+p.getCor()+"','"+p.getNumeroChassi()+"')";
        
        c.stmt.execute(sentenca);
        
            } catch (SQLException ex){
        
            System.out.print(ex.getMessage());  
        
        }
    }
     
     public void excluir(VeiculoModelo p){
    	String sentenca = "DELETE FROM Veiculo WHERE placaVeiculo="+p.getPlacaVeiculo();
    	try {
		new Conexao().stmt.execute(sentenca);
		
              } catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
     public void editar(VeiculoModelo p){
    
        String sentenca = "UPDATE Veiculo set placaVeiculo = '"+p.getPlacaVeiculo()+"', tipoVeiculo = '"+
        p.getTipoVeiculo()+"', fabricante = '"+p.getFabricante()+"', modelo = '"+p.getModelo()+"', anoFabricacao = '"+
        		p.getAnoFabricacao()+"', mediaConsumo = '"+p.getMediaConsumo()+"', capacidadeTanque = '"+
        p.getCapacidadeTanque()+"', cor = '"+p.getCor()+"', numeroChassi = '"+p.getNumeroChassi()+"' WHERE placaVeiculo="+
        		p.getPlacaVeiculo();
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
}
