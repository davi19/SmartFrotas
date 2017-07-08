package view;

import Controle.AbastecimentoControle;
import Modelo.AbastecimentoModelo;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TelaCadastroAbastecimento extends javax.swing.JFrame {
    
    public TelaCadastroAbastecimento() {
        initComponents();
        
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        textoCodigoAbastecimento.setVisible(false);
        labelCodigoDoAbastecimento.setVisible(false);
        textoKmAbastecidoanteriormente.setEnabled(false);
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
        jButton2 = new javax.swing.JButton();
        textoQuantidadeAbastecida = new javax.swing.JTextField();
        labelNumeroDaCnh1 = new javax.swing.JLabel();
        textoKmAbastecidoanteriormente = new javax.swing.JTextField();

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
        textoPlacaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPlacaVeiculoActionPerformed(evt);
            }
        });
        textoPlacaVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoPlacaVeiculoKeyTyped(evt);
            }
        });

        textoKmAbastecido.setEnabled(false);
        textoKmAbastecido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoKmAbastecidoActionPerformed(evt);
            }
        });
        textoKmAbastecido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoKmAbastecidoKeyTyped(evt);
            }
        });

        calendarioAbastecimento.setEnabled(false);
        calendarioAbastecimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calendarioAbastecimentoKeyTyped(evt);
            }
        });

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

        textoQuantidadeAbastecida.setEnabled(false);
        textoQuantidadeAbastecida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoQuantidadeAbastecidaKeyTyped(evt);
            }
        });

        labelNumeroDaCnh1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelNumeroDaCnh1.setText("KM Abastecido Anteriormente");

        textoKmAbastecidoanteriormente.setEnabled(false);
        textoKmAbastecidoanteriormente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoKmAbastecidoanteriormenteActionPerformed(evt);
            }
        });
        textoKmAbastecidoanteriormente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoKmAbastecidoanteriormenteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEmissaoDaCNH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calendarioAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCodigoDoAbastecimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(textoCodigoAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelPlacaVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCategoriaDaCnh)
                                    .addComponent(labelNumeroDaCnh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoKmAbastecido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoQuantidadeAbastecida, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNumeroDaCnh1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoKmAbastecidoanteriormente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoDoAbastecimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPlacaVeiculo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoriaDaCnh)
                    .addComponent(textoQuantidadeAbastecida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoKmAbastecido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroDaCnh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoKmAbastecidoanteriormente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroDaCnh1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calendarioAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmissaoDaCNH))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCadastroActionPerformed

        textoPlacaVeiculo.setEnabled(true);
        textoQuantidadeAbastecida.setEnabled(true);
        textoKmAbastecido.setEnabled(true);
        calendarioAbastecimento.setEnabled(true);
        botaoSalvar.setEnabled(true);
        textoKmAbastecidoanteriormente.setEnabled(true);
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
        AbastecimentoModelo p = new AbastecimentoModelo(Integer.parseInt(textoCodigoAbastecimento.getText()), Integer.parseInt(textoKmAbastecido.getText()), Integer.parseInt(textoKmAbastecidoanteriormente.getText()),textoPlacaVeiculo.getText(), Date.valueOf(data),  Float.parseFloat(textoQuantidadeAbastecida.getText()));

        textoCodigoAbastecimento.setText("");
        textoQuantidadeAbastecida.setText("");
        textoKmAbastecidoanteriormente.setText("");
        textoKmAbastecido.setText("");
        textoPlacaVeiculo.setText("");
        calendarioAbastecimento.setDate(null);
        
        AbastecimentoControle abastecimento = new AbastecimentoControle();

        abastecimento.editar(p);

    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
      
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dFormat.format(calendarioAbastecimento.getDate());
        
        AbastecimentoModelo p = new AbastecimentoModelo(0, Integer.parseInt(textoKmAbastecido.getText()), Integer.parseInt(textoKmAbastecidoanteriormente.getText()),textoPlacaVeiculo.getText(), Date.valueOf(data),  Float.parseFloat(textoQuantidadeAbastecida.getText()));

        textoCodigoAbastecimento.setText("");
        textoQuantidadeAbastecida.setText("");
        textoKmAbastecidoanteriormente.setText("");
        textoKmAbastecido.setText("");
        textoPlacaVeiculo.setText("");
        calendarioAbastecimento.setDate(null);
       
        //p.setCodMotorista(Integer.parseInt(textoCodigoMotorista.getText()));

        AbastecimentoControle abastecimento = new AbastecimentoControle();

        abastecimento.excluir(p.getCodAbastecimento());
        
    
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
      if(textoPlacaVeiculo.getText().equals("") || textoQuantidadeAbastecida.getText().equals("") || textoKmAbastecido.getText().equals("") || textoKmAbastecidoanteriormente.getText().equals("") || calendarioAbastecimento.getDate() == null) {
          
         JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
        
       } else { 
       
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // Usado para formatar o padrão da data dd/MM/yyyy para yyyy/MM/dd 
        String data = dFormat.format(calendarioAbastecimento.getDate()); // converte a data ja formatada para String
       
        AbastecimentoModelo p = new AbastecimentoModelo(0, Integer.parseInt(textoKmAbastecido.getText()), Integer.parseInt(textoKmAbastecidoanteriormente.getText()),textoPlacaVeiculo.getText(), Date.valueOf(data),  Float.parseFloat(textoQuantidadeAbastecida.getText()));
             
        AbastecimentoControle abastecer = new AbastecimentoControle();
        
        abastecer.inserir(p);

        textoPlacaVeiculo.setText("");
        textoKmAbastecido.setText("");
        textoKmAbastecidoanteriormente.setText("");
        textoQuantidadeAbastecida.setText("");
        calendarioAbastecimento.setDate(null);
        
        botaoSalvar.setEnabled(false);
        textoPlacaVeiculo.setEnabled(false);
        textoQuantidadeAbastecida.setEnabled(false);
        textoKmAbastecidoanteriormente.setEnabled(false);
        textoKmAbastecido.setEnabled(false);
        calendarioAbastecimento.setEnabled(false);
        
    }//GEN-LAST:event_botaoSalvarActionPerformed
    
  }
    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void textoKmAbastecidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoKmAbastecidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoKmAbastecidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textoKmAbastecidoanteriormenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoKmAbastecidoanteriormenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoKmAbastecidoanteriormenteActionPerformed

    private void textoPlacaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPlacaVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPlacaVeiculoActionPerformed

    private void textoPlacaVeiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPlacaVeiculoKeyTyped
       
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoPlacaVeiculo.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 7) { evt.consume(); }
             
    }//GEN-LAST:event_textoPlacaVeiculoKeyTyped

    private void textoQuantidadeAbastecidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoQuantidadeAbastecidaKeyTyped
        
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'0' || c>'9') && c != '.'){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoQuantidadeAbastecida.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 10) { evt.consume(); }
        
        
    }//GEN-LAST:event_textoQuantidadeAbastecidaKeyTyped

    private void textoKmAbastecidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKmAbastecidoKeyTyped
        
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoKmAbastecido.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 10) { evt.consume(); }
    }//GEN-LAST:event_textoKmAbastecidoKeyTyped

    private void textoKmAbastecidoanteriormenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKmAbastecidoanteriormenteKeyTyped
       
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoKmAbastecidoanteriormente.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 10) { evt.consume(); }
    }//GEN-LAST:event_textoKmAbastecidoanteriormenteKeyTyped

    private void calendarioAbastecimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarioAbastecimentoKeyTyped
        
        
    }//GEN-LAST:event_calendarioAbastecimentoKeyTyped

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
    private javax.swing.JLabel labelNumeroDaCnh1;
    private javax.swing.JLabel labelPlacaVeiculo;
    public javax.swing.JTextField textoCodigoAbastecimento;
    public javax.swing.JTextField textoKmAbastecido;
    public javax.swing.JTextField textoKmAbastecidoanteriormente;
    public javax.swing.JTextField textoPlacaVeiculo;
    public javax.swing.JTextField textoQuantidadeAbastecida;
    // End of variables declaration//GEN-END:variables
}
