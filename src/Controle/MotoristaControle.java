/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.MotoristaModelo;
import java.sql.SQLException;
import Util.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.Date;
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

    public void inserir(MotoristaModelo p) {
        
       if(p.getNome().equals("") || p.getNumeroCNH().equals("")){
        
           JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o Motorista \nVerifique se todos os campos foram preenchidos!","ERRO", JOptionPane.ERROR_MESSAGE);
            
        }else{

            String sentenca = "INSERT INTO Motorista (nomeMotorista, categoriaCNH, numeroCNH, dataDeVencimento) VALUES('" + p.getNome() + "','" + p.getCategoriaCNH() + "','" + p.getNumeroCNH() + "','" + p.getDataDeVencimentoCNH() + "')";

            try {

                c.stmt.execute(sentenca);
                //System.out.print(" >>>> INSERIDO COM SUCESSO  <<<< ");
                JOptionPane.showMessageDialog(null, "Motorista inserido com Sucesso!","CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {

                System.out.print(ex.getMessage());
                //System.out.print(" >>>> ERRO AO INSERIR  <<<< ");
                JOptionPane.showMessageDialog(null, "Erro ao inserir Motorista!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    

    public void excluir(int codMotorista) {
        
        String sentenca = "DELETE FROM Motorista WHERE codMotorista=" + codMotorista;

        try {
            c.stmt.execute(sentenca);
            //System.out.print(" >>>> DELETADO COM SUCESSO  <<<< ");
            JOptionPane.showMessageDialog(null, "Motorista excluido com sucesso!", "CONFIRMAÇÃO", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {

            //System.out.print(" >>>> ERRO AO DELETAR  <<<< ");
            JOptionPane.showMessageDialog(null, "Erro ao excluir Motorista!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void editar(MotoristaModelo p) {

        
        if(p.getNome().equals("") || p.getNumeroCNH().equals("")){
        
            JOptionPane.showMessageDialog(null, "Não foi possível Alterar os dados do Motorista \nVerifique se todos os campos foram preenchidos!","ERRO", JOptionPane.ERROR_MESSAGE);
            
        }else{
                    
                
            String sentenca = "UPDATE Motorista set nomeMotorista = '" + p.getNome() + "', categoriaCNH = '" + p.getCategoriaCNH() + "', numeroCNH = '" + p.getNumeroCNH() + "', dataDeEmissaoCNH = '" + p.getDataDeVencimentoCNH() + "' WHERE codMotorista=" + p.getCodMotorista();

            try {
                c.stmt.execute(sentenca);
                JOptionPane.showMessageDialog(null, "Dados do Motorista atualizado com sucesso!", "CONFIRMAÇÃO", JOptionPane.ERROR_MESSAGE);

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
            nl.add(rs.getInt("numeroCNH"));
            nl.add(rs.getDate("dataDeEmissaoCNH"));
            tb.add(nl); // adiciona o vetor com as variaveis em um outro vetor vazio
        }
        return tb; // retorna o vetor
    }
}
