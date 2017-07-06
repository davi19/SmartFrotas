package view;

import Controle.AbastecimentoControle;
import Modelo.AbastecimentoModelo;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class TelaCadastroAbastecimento extends javax.swing.JFrame {
    
    public TelaCadastroAbastecimento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNovoCadastro = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        textoCodigoAbastecimento = new javax.swing.JTextField();
        textoPlacaVeiculo = new javax.swing.JTextField();
        textoKmAbastecido = new javax.swing.JTextField();
        calendarioAbastecimento = new com.toedter.calendar.JDateChooser();
        labelEmissaoDaCNH = new javax.swing.JLabel();
        labelNumeroDaCnh = new javax.swing.JLabel();
        labelCategoriaDaCnh = new javax.swing.JLabel();
        labelPlacaVeiculo = new javax.swing.JLabel();
        labelCodigoDoAbastecimento = new javax.swing.JLabel();
        textoQuantidadeAbastecida = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoNovoCadastro.setBackground(new java.awt.Color(204, 204, 204));
        botaoNovoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoNovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Add.png"))); // NOI18N
        botaoNovoCadastro.setBorderPainted(false);
        botaoNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoCadastroActionPerformed(evt);
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

        botaoExcluir.setBackground(new java.awt.Color(204, 204, 204));
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/delete_4219.png"))); // NOI18N
        botaoExcluir.setBorderPainted(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
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

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/log_logout_door_1563.png"))); // NOI18N
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        textoCodigoAbastecimento.setEnabled(false);

        textoPlacaVeiculo.setEnabled(false);

        textoKmAbastecido.setEnabled(false);
        textoKmAbastecido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoKmAbastecidoActionPerformed(evt);
            }
        });

        calendarioAbastecimento.setEnabled(false);

        labelEmissaoDaCNH.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelEmissaoDaCNH.setText("Data do Abastecimento");

        labelNumeroDaCnh.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelNumeroDaCnh.setText("KM Abastecido");

        labelCategoriaDaCnh.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCategoriaDaCnh.setText("Quantidade Abastecida");

        labelPlacaVeiculo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelPlacaVeiculo.setText("Placa Veículo");

        labelCodigoDoAbastecimento.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCodigoDoAbastecimento.setText("Código do Abastecimento:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/pesquisar pequeno.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCodigoDoAbastecimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(textoCodigoAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPlacaVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmissaoDaCNH)
                                    .addComponent(labelCategoriaDaCnh)
                                    .addComponent(labelNumeroDaCnh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoKmAbastecido)
                                    .addComponent(calendarioAbastecimento, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(textoQuantidadeAbastecida))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoDoAbastecimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlacaVeiculo)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoriaDaCnh)
                    .addComponent(textoQuantidadeAbastecida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoKmAbastecido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroDaCnh))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calendarioAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmissaoDaCNH))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCadastroActionPerformed

        textoPlacaVeiculo.setEnabled(true);
        textoQuantidadeAbastecida.setEnabled(true);
        textoKmAbastecido.setEnabled(true);
        calendarioAbastecimento.setEnabled(true);
    }//GEN-LAST:event_botaoNovoCadastroActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        PesquisaAbastecimento tela = new PesquisaAbastecimento(this, true);
        tela.setVisible(true);
        
        //Date vencimento = tela.getCalendarioVencimento();
        textoCodigoAbastecimento.setText(tela.getCodAbastecimento());
        textoPlacaVeiculo.setText(tela.getPlacaVeiculo());
        textoQuantidadeAbastecida.setText(tela.getQuantidadeAbastecida());
        textoKmAbastecido.setText(tela.getQuilometroAbastecido());
        calendarioAbastecimento.setDate(tela.getDataAbastecimento());

        //calendarioVencimento.setDate(vencimento);
        //textoCodigoMotorista.setEnabled(true);
        textoPlacaVeiculo.setEnabled(true);
        textoQuantidadeAbastecida.setEnabled(true);
        textoKmAbastecido.setEnabled(true);
        calendarioAbastecimento.setEnabled(true);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        textoPlacaVeiculo.setEnabled(true);
        textoQuantidadeAbastecida.setEnabled(true);
        textoKmAbastecido.setEnabled(true);
        calendarioAbastecimento.setEnabled(true);

        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dFormat.format(calendarioAbastecimento.getDate());
        AbastecimentoModelo p = new AbastecimentoModelo(Integer.parseInt(textoCodigoAbastecimento.getText()), Integer.parseInt(textoKmAbastecido.getText()), Float.parseFloat(textoQuantidadeAbastecida.getText()), textoPlacaVeiculo.getText(), Date.valueOf(data));

        textoCodigoAbastecimento.setText("");
        textoQuantidadeAbastecida.setText("");
        textoKmAbastecido.setText("");
        textoPlacaVeiculo.setText("");
        calendarioAbastecimento.setDate(null);
        

        AbastecimentoControle abastecimento = new AbastecimentoControle();

        abastecimento.editar(p);

    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dFormat.format(calendarioAbastecimento.getDate());
        AbastecimentoModelo p = new AbastecimentoModelo(Integer.parseInt(textoCodigoAbastecimento.getText()), Integer.parseInt(textoKmAbastecido.getText()), Float.parseFloat(textoQuantidadeAbastecida.getText()), textoPlacaVeiculo.getText(), Date.valueOf(data));

        textoCodigoAbastecimento.setText("");
        textoQuantidadeAbastecida.setText("");
        textoKmAbastecido.setText("");
        textoPlacaVeiculo.setText("");
        calendarioAbastecimento.setDate(null);
       
        //p.setCodMotorista(Integer.parseInt(textoCodigoMotorista.getText()));

        AbastecimentoControle abastecimento = new AbastecimentoControle();

        abastecimento.excluir(p.getCodAbastecimento());
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // Usado para formatar o padrão da data dd/MM/yyyy para yyyy/MM/dd
        String data = dFormat.format(calendarioAbastecimento.getDate()); // converte a data ja formatada para String
        AbastecimentoModelo p = new AbastecimentoModelo(Integer.parseInt(textoCodigoAbastecimento.getText()), Integer.parseInt(textoKmAbastecido.getText()), Float.parseFloat(textoQuantidadeAbastecida.getText()), textoPlacaVeiculo.getText(), Date.valueOf(data));

        textoCodigoAbastecimento.setText("");
        textoQuantidadeAbastecida.setText("");
        textoKmAbastecido.setText("");
        textoPlacaVeiculo.setText("");
        calendarioAbastecimento.setDate(null);
        
        /*
        p.setCodMotorista(Integer.parseInt(textoCodigoMotorista.getText()));
        p.setNome(textoNome.getText());
        p.setCategoriaCNH((String) comboBoxCategoriaCNH.getSelectedItem());
        p.setNumeroCNH(textoNumeroCNH.getText());
        p.setDataDeEmissaoCNH(Date.valueOf(data));
        */
        AbastecimentoControle abastecimento = new AbastecimentoControle();

        abastecimento.inserir(p);

        textoPlacaVeiculo.setEnabled(false);
        textoQuantidadeAbastecida.setEnabled(false);
        textoKmAbastecido.setEnabled(false);
        calendarioAbastecimento.setEnabled(false);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void textoKmAbastecidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoKmAbastecidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoKmAbastecidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAbastecimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovoCadastro;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private com.toedter.calendar.JDateChooser calendarioAbastecimento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelCategoriaDaCnh;
    private javax.swing.JLabel labelCodigoDoAbastecimento;
    private javax.swing.JLabel labelEmissaoDaCNH;
    private javax.swing.JLabel labelNumeroDaCnh;
    private javax.swing.JLabel labelPlacaVeiculo;
    public javax.swing.JTextField textoCodigoAbastecimento;
    public javax.swing.JTextField textoKmAbastecido;
    public javax.swing.JTextField textoPlacaVeiculo;
    private javax.swing.JTextField textoQuantidadeAbastecida;
    // End of variables declaration//GEN-END:variables
}
