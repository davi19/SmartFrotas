
package Controle;

import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author otavio
 */
public class RelatorioControle {
    public void RMotorista() throws SQLException, JRException{
        Conexao c = new Conexao();
       // conexao
       String sentenca = "SELECT nomeMotorista,categoriaCNH,numeroCNH,dataDeVencimentoCNH, if( year(NOW())-year(dataDeVencimentoCNH) >=5,\"Vencida\",\"Em dia\") as Vencida FROM frotas.motorista;"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery();
        
        JRResultSetDataSource relata = new JRResultSetDataSource(rs);
        JasperPrint jpPrint  = JasperFillManager.fillReport("C:\\Users\\otavio\\Documents\\NetBeansProjects\\SmartFrotas\\src\\Controle\\motorista.jasper", new HashMap(), relata);
        JasperViewer jv = new JasperViewer(jpPrint,false);
        jv.setVisible(true);
        
    }
    public void RUsuario() throws SQLException, JRException{
        Conexao c = new Conexao();
       // conexao
       String sentenca = "SELECT login,nivelPermissao FROM frotas.usuariosistema;"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery();
        
        JRResultSetDataSource relata = new JRResultSetDataSource(rs);
        JasperPrint jpPrint  = JasperFillManager.fillReport("C:\\Users\\otavio\\Documents\\NetBeansProjects\\SmartFrotas-master\\src\\Controle\\usuario.jasper", new HashMap(), relata);
        JasperViewer jv = new JasperViewer(jpPrint,false);
        jv.setVisible(true);
        
    }
    public void RVeiculo() throws SQLException, JRException{
        Conexao c = new Conexao();
       // conexao
       String sentenca = "SELECT * FROM frotas.veiculo;"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery();
        
        JRResultSetDataSource relata = new JRResultSetDataSource(rs);
        JasperPrint jpPrint  = JasperFillManager.fillReport("C:\\Users\\otavio\\Documents\\NetBeansProjects\\SmartFrotas-master\\src\\Controle\\veiculo.jasper", new HashMap(), relata);
        JasperViewer jv = new JasperViewer(jpPrint,false);
        jv.setVisible(true);
        
    }
    public void RAbastecimento() throws SQLException, JRException{
        Conexao c = new Conexao();
       // conexao
       String sentenca = "SELECT * FROM frotas.abastecimento;"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery();
        
        JRResultSetDataSource relata = new JRResultSetDataSource(rs);
        JasperPrint jpPrint  = JasperFillManager.fillReport("C:\\Users\\otavio\\Documents\\NetBeansProjects\\SmartFrotas-master\\src\\Controle\\abastecimento.jasper", new HashMap(), relata);
        JasperViewer jv = new JasperViewer(jpPrint,false);
        jv.setVisible(true);
        
    }
    public void RViagem() throws SQLException, JRException{
        Conexao c = new Conexao();
       // conexao
       String sentenca = "SELECT * FROM frotas.controle;"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery();
        
        JRResultSetDataSource relata = new JRResultSetDataSource(rs);
        JasperPrint jpPrint  = JasperFillManager.fillReport("C:\\Users\\otavio\\Documents\\NetBeansProjects\\SmartFrotas-master\\src\\Controle\\controle.jasper", new HashMap(), relata);
        JasperViewer jv = new JasperViewer(jpPrint,false);
        jv.setVisible(true);
        
    }
}
