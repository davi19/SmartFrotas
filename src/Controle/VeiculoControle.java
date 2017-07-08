package Controle;
import Modelo.VeiculoModelo;
import java.sql.SQLException;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

public class VeiculoControle {
    
    Conexao c = new Conexao();
    
     public void inserir(VeiculoModelo p){    
      
        String sentenca = "INSERT INTO Veiculo VALUES('"+p.getPlacaVeiculo()+"','"+p.getTipoVeiculo()+"','"+p.getFabricante()+"','"+p.getModelo()+"','"+p.getCor()+"','"+p.getAnoFabricacao()+"','"+p.getNumeroChassi()+"','"+p.getCapacidadeTanque()+"','"+p.getMediaConsumo()+"')";
        
        try{
             
             c.stmt.execute(sentenca); 
             System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
            
        } catch (SQLException ex){
        
             System.out.print(ex.getMessage());  
             System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
             
            }
    }
     
     public void excluir(String placaVeiculo){
         
    	String sentenca = "DELETE FROM Veiculo WHERE placaVeiculo="+placaVeiculo;
        
    	try {
		c.stmt.execute(sentenca);
                System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
		
              } catch (SQLException ex){
 
                System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
        
        }
    }
    
     public void editar(VeiculoModelo p) throws SQLException{
     
        String sentenca_consulta = "SELECT * FROM veiculo WHERE placaVeiculo = '" + p.getPlacaVeiculo()+ "'";
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca_consulta); // executa a sentença
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){ //existe 
            
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Veiculo!", "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }else{
            
            String sentenca = "UPDATE veiculo set placaVeiculo = '" + p.getPlacaVeiculo() + "', tipoVeiculo = '" + p.getTipoVeiculo() + "', fabricante = '" + p.getFabricante() + "', modelo = '" + p.getModelo() + "', cor = '" + p.getCor()+ "', anoFabricacao = '" + p.getAnoFabricacao()+ "', numeroChassi = '" + p.getNumeroChassi()+ "', capacidaddeTanque = '" + p.getCapacidadeTanque()+ "', mediaConsumo = '" + p.getMediaConsumo() + "' WHERE placaVeiculo=" + p.getPlacaVeiculo();

            try {
                c.stmt.execute(sentenca);
                JOptionPane.showMessageDialog(null, "Dados do Veiculo atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {

                System.out.print(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Veiculo!", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
        
        }

     
     }
     public Vector Pesquisar(String pesq) throws Exception {

        Vector tb = new Vector(); // Instanciando um objeto Vector que tem a mesma funÃ§Ã£o que um vetor
        String sentenca = "select * from veiculo where placaVeiculo like'" + pesq + "%'"; //funÃ§Ã£o que pesquisa os NOMES dos motorista que estÃ£o no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentenÃ§a

        ResultSet rs = ps.executeQuery(); // comando que executa a busca

        while (rs.next()) { // caminha sobre o vetor
            Vector nl = new Vector();
            nl.add(rs.getString("placaVeiculo")); // adiciona a variavel no vetor
            nl.add(rs.getString("tipoVeiculo"));
            nl.add(rs.getString("fabricante"));
            nl.add(rs.getString("modelo"));
            nl.add(rs.getString("cor"));
            nl.add(rs.getInt("anoFabricacao"));
            nl.add(rs.getInt("numeroChassi"));
            nl.add(rs.getInt("capacidadeTanque"));
            nl.add(rs.getFloat("mediaConsumo"));
            tb.add(nl); // adiciona o vetor com as variaveis em um outro vetor vazio
        }
        return tb; // retorna o vetor
    }
    
}
