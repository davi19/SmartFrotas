/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.AbastecimentoModelo;
import java.sql.SQLException;
import Util.Conexao;

/**
 *
 * @author edevaldo
 */
public class AbastecimentoControle {
    
    
    public void inserir(AbastecimentoModelo p){    

    
        try{
        
        Conexao c = new Conexao();
        
        String sentenca = "INSERT INTO Abastecimento VALUES("+p.getCodAbastecimento()+",'"+p.getCodVeiculo()+"','"+p.getQtdAbastecida()+"','"+p.getKmDeAbastecimento()+"','"+p.getKmDeAbastecimentoAnterior()+"','"+p.getDataAbastecimento()+"')";
        
        c.stmt.execute(sentenca);
        
            } catch (SQLException ex){
        
            System.out.print(ex.getMessage());  
        
        }
    }
    
        public void excluir(AbastecimentoModelo p){
    	String sentenca = "DELETE FROM Abastecimento WHERE codAbastecimento="+p.getCodAbastecimento();
    	try {
		new Conexao().stmt.execute(sentenca);
		
              } catch (SQLException e) {
			e.printStackTrace();
		}
    }
        
        public void editar(AbastecimentoModelo p){
    
        String sentenca = "UPDATE Abastecimento set placaVeiculo = '"+p.getCodVeiculo()+"', quantidadeAbastecida = '"+p.getQtdAbastecida()+"', quilometroAbastecido = '"+p.getKmDeAbastecimento()+"', quilometroDeAbastecimentoAnterior = '"+p.getKmDeAbastecimentoAnterior()+"', dataAbastecimento = '"+p.getDataAbastecimento()+"' WHERE codAbastecimento="+p.getCodAbastecimento();
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
        
    
}
