/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.MotoristaModelo;
import java.sql.SQLException;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author edevaldo
 */
public class MotoristaControle {

    Conexao c = new Conexao();

    public void inserir(MotoristaModelo p) throws SQLException {
        
        String sentenca_consulta = "SELECT * FROM motorista WHERE numeroCNH = '" + p.getNumeroCNH()+ "'";
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca_consulta); // executa a sentença
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){ //existe 
            
        JOptionPane.showMessageDialog(null, "Erro ao inserir Motorista!\nEssa CNH já está cadastrada no sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }else{
            
        
                String sentenca = "INSERT INTO motorista (nomeMotorista, categoriaCNH, numeroCNH, dataDeVencimentoCNH) VALUES('" + p.getNome() + "','" + p.getCategoriaCNH() + "','" + p.getNumeroCNH() + "','" + p.getDataDeVencimentoCNH() + "')";

                try {

                    c.stmt.execute(sentenca);
                    //System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
                    JOptionPane.showMessageDialog(null, "Motorista inserido com Sucesso!","CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {

                    System.out.print(ex.getMessage());
                    System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
                    JOptionPane.showMessageDialog(null, "Erro ao inserir Motorista!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
        
        }
        
    }

    public void excluir(int codMotorista) {

        String sentenca = "DELETE FROM motorista WHERE codMotorista=" + codMotorista;

        try {
            c.stmt.execute(sentenca);
            //System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
            JOptionPane.showMessageDialog(null, "Motorista excluido com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {

            //System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
            JOptionPane.showMessageDialog(null, "Erro ao excluir Motorista!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void editar(MotoristaModelo p) throws SQLException {
        
        String sentenca_consulta = "SELECT * FROM motorista WHERE numeroCNH = '" + p.getNumeroCNH()+ "' AND codMotorista != '" + p.getCodMotorista()+ "'";
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca_consulta); // executa a sentença
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){ //existe 
            
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Motorista!\nEssa CNH já está cadastrada no sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }else{
        
            String sentenca = "UPDATE motorista set nomeMotorista = '" + p.getNome() + "', categoriaCNH = '" + p.getCategoriaCNH() + "', numeroCNH = '" + p.getNumeroCNH() + "', dataDeVencimentoCNH = '" + p.getDataDeVencimentoCNH() + "' WHERE codMotorista=" + p.getCodMotorista();

            try {
                c.stmt.execute(sentenca);
                JOptionPane.showMessageDialog(null, "Dados do Motorista atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {

                System.out.print(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Motorista!", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
        
        }

   }

    public Vector Pesquisar(String pesq) throws Exception {

        Vector tb = new Vector(); // Instanciando um objeto Vector que tem a mesma função que um vetor
        String sentenca = "select * from motorista where nomeMotorista like'" + pesq + "%'"; //função que pesquisa os NOMES dos motorista que estão no banco que comecem com a letra digitada
        PreparedStatement ps = c.getConexao().prepareStatement(sentenca); // executa a sentença

        ResultSet rs = ps.executeQuery(); // comando que executa a busca

        while (rs.next()) { // caminha sobre o vetor
            Vector nl = new Vector();
            nl.add(rs.getInt("codMotorista")); // adiciona a variavel no vetor
            nl.add(rs.getString("nomeMotorista"));
            nl.add(rs.getString("categoriaCNH"));
            nl.add(rs.getString("numeroCNH"));
            nl.add(rs.getDate("dataDeVencimentoCNH"));
            tb.add(nl); // adiciona o vetor com as variaveis em um outro vetor vazio
        }
        return tb; // retorna o vetor
    }
}
