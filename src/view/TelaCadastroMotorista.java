package view;

import Controle.MotoristaControle;
import Modelo.MotoristaModelo;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class TelaCadastroMotorista extends javax.swing.JFrame {

    
    public TelaCadastroMotorista() {
        initComponents();
        labelCodigoDoMotorista.setVisible(false);
        textoCodigoMotorista.setVisible(false);
        this.comboBoxCategoriaCNH.addItem("A"); // Preenchimento das ComboBox 
        this.comboBoxCategoriaCNH.addItem("B");
        this.comboBoxCategoriaCNH.addItem("C");
        this.comboBoxCategoriaCNH.addItem("D");
        this.comboBoxCategoriaCNH.addItem("E");
        this.comboBoxCategoriaCNH.addItem("AB");
        this.comboBoxCategoriaCNH.addItem("AC");
        this.comboBoxCategoriaCNH.addItem("AD");
        this.comboBoxCategoriaCNH.addItem("AE");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNovoCadastro = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelNumeroDaCnh = new javax.swing.JLabel();
        labelCategoriaDaCnh = new javax.swing.JLabel();
        labelEmissaoDaCNH = new javax.swing.JLabel();
        textoCodigoMotorista = new javax.swing.JTextField();
        textoNumeroCNH = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        labelCodigoDoMotorista = new javax.swing.JLabel();
        comboBoxCategoriaCNH = new javax.swing.JComboBox<>();
        calendarioVencimento = new com.toedter.calendar.JDateChooser();

        setTitle("Cadastro de Motorista");
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(850, 570));
        setPreferredSize(new java.awt.Dimension(900, 600));

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

        botaoExcluir.setBackground(new java.awt.Color(204, 204, 204));
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/delete_4219.png"))); // NOI18N
        botaoExcluir.setBorderPainted(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/log_logout_door_1563.png"))); // NOI18N
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelNome.setText("Nome:");

        labelNumeroDaCnh.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelNumeroDaCnh.setText("Número da CNH:");

        labelCategoriaDaCnh.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCategoriaDaCnh.setText("Categoria da CNH:");

        labelEmissaoDaCNH.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelEmissaoDaCNH.setText("Vencimento da CNH:");

        textoCodigoMotorista.setEnabled(false);

        textoNumeroCNH.setEnabled(false);
        textoNumeroCNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNumeroCNHActionPerformed(evt);
            }
        });

        textoNome.setEnabled(false);

        labelCodigoDoMotorista.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCodigoDoMotorista.setText("Código do Motorista:");

        comboBoxCategoriaCNH.setEnabled(false);

        calendarioVencimento.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
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
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCodigoDoMotorista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(textoCodigoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmissaoDaCNH)
                                    .addComponent(labelCategoriaDaCnh)
                                    .addComponent(labelNumeroDaCnh))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoNumeroCNH)
                                    .addComponent(comboBoxCategoriaCNH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendarioVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))))
                .addContainerGap(96, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoDoMotorista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoriaDaCnh)
                    .addComponent(comboBoxCategoriaCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNumeroCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroDaCnh))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelEmissaoDaCNH))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(calendarioVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCadastroActionPerformed

        
        textoNome.setEnabled(true);
        calendarioVencimento.setEnabled(true);
        comboBoxCategoriaCNH.setEnabled(true);
        textoNumeroCNH.setEnabled(true);
        
        textoNumeroCNH.setText("");
        textoNome.setText("");
        calendarioVencimento.setDate(null);
        comboBoxCategoriaCNH.setSelectedIndex(0);
        
        botaoSalvar.setEnabled(true);

    }//GEN-LAST:event_botaoNovoCadastroActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        PesquisaMotorista tela = new PesquisaMotorista(this, true);
        tela.setVisible(true);

        //Date vencimento = tela.getCalendarioVencimento();
        textoCodigoMotorista.setText(tela.getCodMotorista());
        textoNome.setText(tela.getNomeMotorista());
        comboBoxCategoriaCNH.setSelectedItem(tela.getCategoriaCNH());
        textoNumeroCNH.setText(tela.getNumeroCNH());
        calendarioVencimento.setDate(tela.getDataDeEmissaoCNH());

        //calendarioVencimento.setDate(vencimento);
        //textoCodigoMotorista.setEnabled(true);
        textoNome.setEnabled(true);
        calendarioVencimento.setEnabled(true);
        comboBoxCategoriaCNH.setEnabled(true);
        textoNumeroCNH.setEnabled(true);
        botaoSalvar.setEnabled(false);

    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();

    }//GEN-LAST:event_botaoSairActionPerformed

    private void textoNumeroCNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNumeroCNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNumeroCNHActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // Usado para formatar o padrão da data dd/MM/yyyy para yyyy/MM/dd 
        String data = dFormat.format(calendarioVencimento.getDate()); // converte a data ja formatada para String
        MotoristaModelo p = new MotoristaModelo(0, textoNumeroCNH.getText(), (String) comboBoxCategoriaCNH.getSelectedItem(), textoNome.getText(), Date.valueOf(data));

        //textoCodigoMotorista.setText("");
        textoNumeroCNH.setText("");
        textoNome.setText("");
        calendarioVencimento.setDate(null);
        comboBoxCategoriaCNH.setSelectedIndex(0);
/*
        p.setCodMotorista(Integer.parseInt(textoCodigoMotorista.getText()));
        p.setNome(textoNome.getText());
        p.setCategoriaCNH((String) comboBoxCategoriaCNH.getSelectedItem());
        p.setNumeroCNH(textoNumeroCNH.getText());
        p.setDataDeEmissaoCNH(Date.valueOf(data));
*/
        MotoristaControle motorista = new MotoristaControle();

        motorista.inserir(p);

        textoCodigoMotorista.setEnabled(false);
        textoNome.setEnabled(false);
        calendarioVencimento.setEnabled(false);
        comboBoxCategoriaCNH.setEnabled(false);
        textoNumeroCNH.setEnabled(false);

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        textoNome.setEnabled(true);
        calendarioVencimento.setEnabled(true);
        comboBoxCategoriaCNH.setEnabled(true);
        textoNumeroCNH.setEnabled(true);
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dFormat.format(calendarioVencimento.getDate());
        MotoristaModelo p = new MotoristaModelo(Integer.parseInt(textoCodigoMotorista.getText()), textoNumeroCNH.getText(), (String) comboBoxCategoriaCNH.getSelectedItem(), textoNome.getText(), Date.valueOf(data));


        textoCodigoMotorista.setText("");
        textoNumeroCNH.setText("");
        textoNome.setText("");
        calendarioVencimento.setDate(null);
        comboBoxCategoriaCNH.setSelectedIndex(0);
        
        MotoristaControle motorista = new MotoristaControle();
        
        motorista.editar(p);
        
        textoNome.setEnabled(false);
        calendarioVencimento.setEnabled(false);
        comboBoxCategoriaCNH.setEnabled(false);
        textoNumeroCNH.setEnabled(false);
                
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dFormat.format(calendarioVencimento.getDate());
        MotoristaModelo p = new MotoristaModelo(Integer.parseInt(textoCodigoMotorista.getText()), textoNumeroCNH.getText(), (String) comboBoxCategoriaCNH.getSelectedItem(), textoNome.getText(), Date.valueOf(data));


        textoCodigoMotorista.setText("");
        textoNumeroCNH.setText("");
        textoNome.setText("");
        calendarioVencimento.setDate(null);
        comboBoxCategoriaCNH.setSelectedIndex(0);
        
        textoNome.setEnabled(false);
        calendarioVencimento.setEnabled(false);
        comboBoxCategoriaCNH.setEnabled(false);
        textoNumeroCNH.setEnabled(false);
        
        //p.setCodMotorista(Integer.parseInt(textoCodigoMotorista.getText()));

        MotoristaControle motorista = new MotoristaControle();

        motorista.excluir(p.getCodMotorista());

    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMotorista().setVisible(true);
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
    public com.toedter.calendar.JDateChooser calendarioVencimento;
    public javax.swing.JComboBox<String> comboBoxCategoriaCNH;
    private javax.swing.JLabel labelCategoriaDaCnh;
    private javax.swing.JLabel labelCodigoDoMotorista;
    private javax.swing.JLabel labelEmissaoDaCNH;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumeroDaCnh;
    public javax.swing.JTextField textoCodigoMotorista;
    public javax.swing.JTextField textoNome;
    public javax.swing.JTextField textoNumeroCNH;
    // End of variables declaration//GEN-END:variables
}
