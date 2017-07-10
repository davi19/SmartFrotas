/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controle.ControleDeViagemControle;
import Modelo.ControleDeViagemModelo;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author otavio
 */
public class TelaAberturaViagem extends javax.swing.JFrame {

    /**
     * Creates new form TelaAberturaViagem
     */
    public TelaAberturaViagem() {
        initComponents();
        
        textoCodigo.setEnabled(false);
        textoMotorista.setEnabled(false);
        textoPlaca.setEnabled(false);
        textoKmSaida.setEnabled(false);
        textoKmEntrada.setEnabled(false);
        calendarioDataSaida.setEnabled(false);
        calendarioDataEntrada.setEnabled(false);
        
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelKmEntrada = new javax.swing.JLabel();
        textoKmSaida = new javax.swing.JTextField();
        textoKmEntrada = new javax.swing.JTextField();
        labelPlacaDoVeiculo = new javax.swing.JLabel();
        labelDataSaida = new javax.swing.JLabel();
        labelDataEntrada = new javax.swing.JLabel();
        labelKmSaida = new javax.swing.JLabel();
        botaoNovoCadastro = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        labelMotorista = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textoPlaca = new javax.swing.JTextField();
        textoCodigo = new javax.swing.JTextField();
        textoMotorista = new javax.swing.JTextField();
        PesquisaMotorista = new javax.swing.JButton();
        pesquisaVeiculo = new javax.swing.JButton();
        calendarioDataSaida = new com.toedter.calendar.JDateChooser();
        calendarioDataEntrada = new com.toedter.calendar.JDateChooser();

        setTitle("Abertura de Viagens");
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(660, 473));

        labelKmEntrada.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelKmEntrada.setText("KM Entrada:");

        textoKmSaida.setEnabled(false);

        textoKmEntrada.setEnabled(false);
        textoKmEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoKmEntradaActionPerformed(evt);
            }
        });

        labelPlacaDoVeiculo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelPlacaDoVeiculo.setText("Placa do Veículo:");

        labelDataSaida.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelDataSaida.setText("Data Saída:");

        labelDataEntrada.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelDataEntrada.setText("Data Entrada:");

        labelKmSaida.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelKmSaida.setText("KM Saída:");

        botaoNovoCadastro.setBackground(new java.awt.Color(204, 204, 204));
        botaoNovoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoNovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Add.png"))); // NOI18N
        botaoNovoCadastro.setBorderPainted(false);
        botaoNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoCadastroActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(204, 204, 204));
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/save-icon.png"))); // NOI18N
        botaoSalvar.setBorderPainted(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        botaoPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Search_find_locate_1542.png"))); // NOI18N
        botaoPesquisar.setBorderPainted(false);
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoEditar.setBackground(new java.awt.Color(204, 204, 204));
        botaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/edit-validated_40458.png"))); // NOI18N
        botaoEditar.setBorderPainted(false);
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/log_logout_door_1563.png"))); // NOI18N
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(204, 204, 204));
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/delete_4219.png"))); // NOI18N
        botaoExcluir.setBorderPainted(false);

        labelMotorista.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelMotorista.setText("Motorista");

        labelCodigo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCodigo.setText("Código ");

        textoPlaca.setEnabled(false);

        textoCodigo.setEnabled(false);

        textoMotorista.setEnabled(false);

        PesquisaMotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/pesquisar pequeno.png"))); // NOI18N
        PesquisaMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaMotoristaActionPerformed(evt);
            }
        });

        pesquisaVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/pesquisar pequeno.png"))); // NOI18N
        pesquisaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMotorista)
                                    .addComponent(labelKmSaida)
                                    .addComponent(labelKmEntrada)
                                    .addComponent(labelDataSaida)
                                    .addComponent(labelDataEntrada)
                                    .addComponent(labelPlacaDoVeiculo))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(textoKmSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(textoKmEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(textoMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(calendarioDataSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendarioDataEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PesquisaMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCodigo)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMotorista)
                        .addGap(22, 22, 22)
                        .addComponent(labelPlacaDoVeiculo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PesquisaMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoKmSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKmSaida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoKmEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKmEntrada))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDataSaida)
                    .addComponent(calendarioDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDataEntrada)
                    .addComponent(calendarioDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoKmEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoKmEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoKmEntradaActionPerformed

    private void botaoNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCadastroActionPerformed
        
        textoMotorista.setEnabled(true);
        textoPlaca.setEnabled(true);
        textoKmSaida.setEnabled(true);
        textoKmEntrada.setEnabled(true);
        calendarioDataSaida.setEnabled(true);
        calendarioDataEntrada.setEnabled(true);
        
        textoCodigo.setText("");
        textoMotorista.setText("");
        textoPlaca.setText("");
        textoKmSaida.setText("");
        textoKmEntrada.setText("");
        calendarioDataSaida.setDate(null);
        calendarioDataEntrada.setDate(null);
        
        botaoSalvar.setEnabled(true);
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        
    }//GEN-LAST:event_botaoNovoCadastroActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        
        PesquisaViagens tela = new PesquisaViagens(this,true);
        tela.setVisible(true);
         
        textoCodigo.setText(tela.getCodControle());
        textoMotorista.setText(tela.getNomeMotorista());
        textoPlaca.setText(tela.getPlacaVeiculo());
        textoKmSaida.setText(tela.getKmSaida());
        textoKmEntrada.setText(tela.getKmEntrada());
        calendarioDataSaida.setDate(tela.getDataSaida());
        calendarioDataEntrada.setDate(tela.getDataEntrada());
        
        textoCodigo.setEnabled(false);
        textoMotorista.setEnabled(true);
        textoPlaca.setEnabled(true);
        textoKmSaida.setEnabled(true);
        textoKmEntrada.setEnabled(true);
        calendarioDataSaida.setEnabled(true);
        calendarioDataEntrada.setEnabled(true);
        
        botaoSalvar.setEnabled(false);
        botaoEditar.setEnabled(true);
        botaoExcluir.setEnabled(true);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_botaoSairActionPerformed

    private void PesquisaMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaMotoristaActionPerformed
        
        PesquisaMotorista telaPesquisaMotorista = new PesquisaMotorista(this,true);
        telaPesquisaMotorista.setVisible(true);
        
        textoMotorista.setText(telaPesquisaMotorista.getNomeMotorista());
        
    }//GEN-LAST:event_PesquisaMotoristaActionPerformed

    private void pesquisaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaVeiculoActionPerformed
        
        PesquisaVeiculo telaPesquisaVeiculo = new PesquisaVeiculo(this,true);
        telaPesquisaVeiculo.setVisible(true);
        
        textoPlaca.setText(telaPesquisaVeiculo.getPlacaVeiculo());
        
    }//GEN-LAST:event_pesquisaVeiculoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        if(textoKmEntrada.getText().equals("") || textoKmSaida.getText().equals("") || textoMotorista.getText().equals("") || 
                textoPlaca.getText().equals("") || calendarioDataSaida.getDate() == null || calendarioDataEntrada.getDate() == null) {
          
         JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
         botaoSalvar.setEnabled(true);
        
       } else { 
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // Usado para formatar o padrÃ£o da data dd/MM/yyyy para yyyy/MM/dd
        String dataSaida = dFormat.format(calendarioDataSaida.getDate()); // converte a data ja formatada para String
        String dataEntrada = dFormat.format(calendarioDataEntrada.getDate());
       
        ControleDeViagemModelo p = new ControleDeViagemModelo(Integer.parseInt(textoKmEntrada.getText()),
                Integer.parseInt(textoKmSaida.getText()), textoMotorista.getText(),Date.valueOf(dataEntrada),
                Date.valueOf(dataSaida), textoPlaca.getText());
        
        ControleDeViagemControle controleDeViagemControle = new ControleDeViagemControle();

        controleDeViagemControle.inserir(p);

        textoCodigo.setEnabled(false);
        textoMotorista.setEnabled(false);
        textoPlaca.setEnabled(false);
        textoKmSaida.setEnabled(false);
        textoKmEntrada.setEnabled(false);
        calendarioDataSaida.setEnabled(false);
        calendarioDataEntrada.setEnabled(false);
        
        textoCodigo.setText("");
        textoMotorista.setText("");
        textoPlaca.setText("");
        textoKmSaida.setText("");
        textoKmEntrada.setText("");
        calendarioDataSaida.setDate(null);
        calendarioDataEntrada.setDate(null);
        
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        }
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // Usado para formatar o padrÃ£o da data dd/MM/yyyy para yyyy/MM/dd
        String dataSaida = dFormat.format(calendarioDataSaida.getDate()); // converte a data ja formatada para String
        String dataEntrada = dFormat.format(calendarioDataEntrada.getDate());
        
        ControleDeViagemModelo p = new ControleDeViagemModelo(Integer.parseInt(textoCodigo.getText()),
                Integer.parseInt(textoKmEntrada.getText()),Integer.parseInt(textoKmSaida.getText()), 
                textoMotorista.getText(),Date.valueOf(dataEntrada),Date.valueOf(dataSaida), textoPlaca.getText());
        
        
        
        ControleDeViagemControle controleDeViagem = new ControleDeViagemControle();
        
        controleDeViagem.excluir(p.getCodControle());
        
        textoCodigo.setEnabled(false);
        textoMotorista.setEnabled(false);
        textoPlaca.setEnabled(false);
        textoKmSaida.setEnabled(false);
        textoKmEntrada.setEnabled(false);
        calendarioDataSaida.setEnabled(false);
        calendarioDataEntrada.setEnabled(false);
        
        textoCodigo.setText("");
        textoMotorista.setText("");
        textoPlaca.setText("");
        textoKmSaida.setText("");
        textoKmEntrada.setText("");
        calendarioDataSaida.setDate(null);
        calendarioDataEntrada.setDate(null);
        
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        
        
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
       
         if(textoKmEntrada.getText().equals("") || textoKmSaida.getText().equals("") || textoMotorista.getText().equals("") || 
                textoPlaca.getText().equals("") || calendarioDataSaida.getDate() == null || calendarioDataEntrada.getDate() == null) {
          
         JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
         botaoSalvar.setEnabled(true);
        
       } else { 
        
        textoCodigo.setEnabled(false);
        textoMotorista.setEnabled(true);
        textoPlaca.setEnabled(true);
        textoKmSaida.setEnabled(true);
        textoKmEntrada.setEnabled(true);
        calendarioDataSaida.setEnabled(true);
        calendarioDataEntrada.setEnabled(true);
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dataSaida = dFormat.format(calendarioDataSaida.getDate()); // converte a data ja formatada para String
        String dataEntrada = dFormat.format(calendarioDataEntrada.getDate());
        
        ControleDeViagemModelo p = new ControleDeViagemModelo(Integer.parseInt(textoCodigo.getText()),
                Integer.parseInt(textoKmEntrada.getText()),Integer.parseInt(textoKmSaida.getText()), 
                textoMotorista.getText(),Date.valueOf(dataEntrada),Date.valueOf(dataSaida), textoPlaca.getText());
        
        ControleDeViagemControle controleDeViagem = new ControleDeViagemControle();
        

        controleDeViagem.editar(p);

        
        textoCodigo.setEnabled(false);
        textoMotorista.setEnabled(false);
        textoPlaca.setEnabled(false);
        textoKmSaida.setEnabled(false);
        textoKmEntrada.setEnabled(false);
        calendarioDataSaida.setEnabled(false);
        calendarioDataEntrada.setEnabled(false);
        
        textoCodigo.setText("");
        textoMotorista.setText("");
        textoPlaca.setText("");
        textoKmSaida.setText("");
        textoKmEntrada.setText("");
        calendarioDataSaida.setDate(null);
        calendarioDataEntrada.setDate(null);
        
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        
         }
        
    }//GEN-LAST:event_botaoEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAberturaViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAberturaViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAberturaViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAberturaViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAberturaViagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisaMotorista;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovoCadastro;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private com.toedter.calendar.JDateChooser calendarioDataEntrada;
    private com.toedter.calendar.JDateChooser calendarioDataSaida;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataEntrada;
    private javax.swing.JLabel labelDataSaida;
    private javax.swing.JLabel labelKmEntrada;
    private javax.swing.JLabel labelKmSaida;
    private javax.swing.JLabel labelMotorista;
    private javax.swing.JLabel labelPlacaDoVeiculo;
    private javax.swing.JButton pesquisaVeiculo;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoKmEntrada;
    private javax.swing.JTextField textoKmSaida;
    private javax.swing.JTextField textoMotorista;
    private javax.swing.JTextField textoPlaca;
    // End of variables declaration//GEN-END:variables
}
