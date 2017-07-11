/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controle.VeiculoControle;
import Modelo.VeiculoModelo;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadastroVeiculo extends javax.swing.JFrame {

    public TelaCadastroVeiculo() {
        initComponents();
        
       botaoEditar.setEnabled(false);
       botaoExcluir.setEnabled(false);
       botaoSalvar.setEnabled(false);
       labelCodigoVeiculo.setVisible(false);
       textoCodigoVeiculo.setVisible(false);
        
        this.comboBoxTipoVeiculo.addItem("Carro"); // Preenchimento das ComboBox 
        this.comboBoxTipoVeiculo.addItem("Caminhão"); 
        setLocationRelativeTo(null);
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
        textoChassi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoAnoFabricacao = new javax.swing.JTextField();
        textoCapacidadeTanque = new javax.swing.JTextField();
        labelAnoDeFabricacao = new javax.swing.JLabel();
        labelFabricante = new javax.swing.JLabel();
        labelConsumoMedio = new javax.swing.JLabel();
        textoConsumoMedio = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        textoCor = new javax.swing.JTextField();
        comboBoxTipoVeiculo = new javax.swing.JComboBox<>();
        textoPlaca = new javax.swing.JTextField();
        textoFabricante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textoModelo = new javax.swing.JTextField();
        textoCodigoVeiculo = new javax.swing.JTextField();
        labelCodigoVeiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos");
        setSize(new java.awt.Dimension(660, 569));

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

        textoChassi.setEnabled(false);
        textoChassi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoChassiKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Placa:");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Capacidade do Tanque");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Tipo de Veículo:");

        textoAnoFabricacao.setEnabled(false);
        textoAnoFabricacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoAnoFabricacaoKeyTyped(evt);
            }
        });

        textoCapacidadeTanque.setEnabled(false);
        textoCapacidadeTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCapacidadeTanqueActionPerformed(evt);
            }
        });
        textoCapacidadeTanque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCapacidadeTanqueKeyTyped(evt);
            }
        });

        labelAnoDeFabricacao.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelAnoDeFabricacao.setText("Ano de Fabricação:");

        labelFabricante.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelFabricante.setText("Fabricante:");

        labelConsumoMedio.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelConsumoMedio.setText("Consumo Médio:");

        textoConsumoMedio.setEnabled(false);
        textoConsumoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoConsumoMedioActionPerformed(evt);
            }
        });
        textoConsumoMedio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoConsumoMedioKeyTyped(evt);
            }
        });

        labelModelo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelModelo.setText("Modelo:");

        labelCor.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCor.setText("Cor:");

        textoCor.setEnabled(false);
        textoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCorActionPerformed(evt);
            }
        });
        textoCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCorKeyTyped(evt);
            }
        });

        comboBoxTipoVeiculo.setEnabled(false);
        comboBoxTipoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoVeiculoActionPerformed(evt);
            }
        });

        textoPlaca.setEnabled(false);
        textoPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPlacaActionPerformed(evt);
            }
        });
        textoPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoPlacaKeyTyped(evt);
            }
        });

        textoFabricante.setEnabled(false);
        textoFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFabricanteActionPerformed(evt);
            }
        });
        textoFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoFabricanteKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Numero do Chassi");

        textoModelo.setEnabled(false);
        textoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoModeloKeyTyped(evt);
            }
        });

        textoCodigoVeiculo.setEnabled(false);

        labelCodigoVeiculo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCodigoVeiculo.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(labelAnoDeFabricacao)
                            .addComponent(labelFabricante)
                            .addComponent(labelModelo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(labelCor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelConsumoMedio))
                            .addComponent(labelCodigoVeiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoCapacidadeTanque, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoAnoFabricacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoChassi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoFabricante, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxTipoVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE)
                            .addComponent(textoPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCodigoVeiculo)
                            .addComponent(textoConsumoMedio)))
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
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoVeiculo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFabricante)
                    .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(textoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnoDeFabricacao)
                    .addComponent(textoAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoConsumoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelConsumoMedio))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCadastroActionPerformed
        
        textoPlaca.setEnabled(true); 
        comboBoxTipoVeiculo.setEnabled(true);
        textoFabricante.setEnabled(true);
        textoChassi.setEnabled(true); 
        textoModelo.setEnabled(true);
        textoCor.setEnabled(true);
        textoAnoFabricacao.setEnabled(true);
        textoCapacidadeTanque.setEnabled(true); 
        textoConsumoMedio.setEnabled(true);
        
        textoPlaca.setText("");
        comboBoxTipoVeiculo.setSelectedIndex(0);
        textoFabricante.setText("");
        textoChassi.setText("");
        textoModelo.setText("");
        textoCor.setText("");
        textoAnoFabricacao.setText("");
        textoCapacidadeTanque.setText("");
        textoConsumoMedio.setText("");
        
        botaoSalvar.setEnabled(true);
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        
    }//GEN-LAST:event_botaoNovoCadastroActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        
        PesquisaVeiculo tela = new PesquisaVeiculo(this,true);
        tela.setVisible(true);
        
        textoCodigoVeiculo.setText(tela.getCodVeiculo());
        textoPlaca.setText(tela.getPlacaVeiculo()); 
        comboBoxTipoVeiculo.setSelectedItem(tela.getTipoVeiculo());
        textoFabricante.setText(tela.getFabricante());
        textoChassi.setText(tela.getNumeroChassi()); 
        textoModelo.setText(tela.getModelo());
        textoCor.setText(tela.getCor());
        textoAnoFabricacao.setText(tela.getAnoFabricacao());
        textoCapacidadeTanque.setText(tela.getCapacidadeTanque()); 
        textoConsumoMedio.setText(tela.getMediaConsumo());
       
        textoPlaca.setEnabled(true); 
        comboBoxTipoVeiculo.setEnabled(true);
        textoFabricante.setEnabled(true);
        textoChassi.setEnabled(true); 
        textoModelo.setEnabled(true);
        textoCor.setEnabled(true);
        textoAnoFabricacao.setEnabled(true);
        textoCapacidadeTanque.setEnabled(true); 
        textoConsumoMedio.setEnabled(true);
        
        botaoSalvar.setEnabled(false);
        botaoExcluir.setEnabled(true);
        botaoEditar.setEnabled(true);
        
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_botaoSairActionPerformed

    private void comboBoxTipoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoVeiculoActionPerformed

    }//GEN-LAST:event_comboBoxTipoVeiculoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        if(textoPlaca.getText().equals("") || textoFabricante.getText().equals("") || textoChassi.getText().equals("") || 
                textoModelo.getText().equals("") || textoCor.getText().equals("") || textoAnoFabricacao.getText().equals("")
                || textoCapacidadeTanque.getText().equals("") || textoConsumoMedio.getText().equals("")) {
          
         JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
         botaoSalvar.setEnabled(true);
        
       } else { 
        
        VeiculoModelo p = new VeiculoModelo(textoPlaca.getText(), (String)comboBoxTipoVeiculo.getSelectedItem(), textoFabricante.getText(), textoModelo.getText(), textoCor.getText(), Integer.parseInt(textoAnoFabricacao.getText()), textoChassi.getText(), Integer.parseInt(textoCapacidadeTanque.getText()), Float.parseFloat(textoConsumoMedio.getText()));
 
        VeiculoControle veiculo = new VeiculoControle(); 
        try { 
            veiculo.inserir(p);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

        textoPlaca.setEnabled(false); 
        comboBoxTipoVeiculo.setEnabled(false);
        textoFabricante.setEnabled(false);
        textoChassi.setEnabled(false); 
        textoModelo.setEnabled(false);
        textoCor.setEnabled(false);
        textoAnoFabricacao.setEnabled(false);
        textoCapacidadeTanque.setEnabled(false); 
        textoConsumoMedio.setEnabled(false);
        }
        
        textoPlaca.setText("");
        comboBoxTipoVeiculo.setSelectedIndex(0);
        textoFabricante.setText("");
        textoChassi.setText("");
        textoModelo.setText("");
        textoCor.setText("");
        textoAnoFabricacao.setText("");
        textoCapacidadeTanque.setText("");
        textoConsumoMedio.setText("");
        
        botaoSalvar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoEditar.setEnabled(false);
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        
        VeiculoModelo p = new VeiculoModelo(Integer.parseInt(textoCodigoVeiculo.getText()),textoPlaca.getText(), (String)comboBoxTipoVeiculo.getSelectedItem(), textoFabricante.getText(), textoModelo.getText(), textoCor.getText(), Integer.parseInt(textoAnoFabricacao.getText()), textoChassi.getText(), Integer.parseInt(textoCapacidadeTanque.getText()), Float.parseFloat(textoConsumoMedio.getText())); 

        textoCodigoVeiculo.setText("");
        textoPlaca.setText("");
        comboBoxTipoVeiculo.setSelectedIndex(0);
        textoFabricante.setText("");
        textoChassi.setText("");
        textoModelo.setText("");
        textoCor.setText("");
        textoAnoFabricacao.setText("");
        textoCapacidadeTanque.setText("");
        textoConsumoMedio.setText("");
        
        textoPlaca.setEnabled(false); 
        comboBoxTipoVeiculo.setEnabled(false);
        textoFabricante.setEnabled(false);
        textoChassi.setEnabled(false); 
        textoModelo.setEnabled(false);
        textoCor.setEnabled(false);
        textoAnoFabricacao.setEnabled(false);
        textoCapacidadeTanque.setEnabled(false); 
        textoConsumoMedio.setEnabled(false);
        
        botaoSalvar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoEditar.setEnabled(false);
       
        //p.setCodMotorista(Integer.parseInt(textoCodigoMotorista.getText()));

        VeiculoControle veiculo = new VeiculoControle();


            veiculo.excluir(p.getCodVeiculo());
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        
        if(textoPlaca.getText().equals("") || textoFabricante.getText().equals("") || textoChassi.getText().equals("") || 
                textoModelo.getText().equals("") || textoCor.getText().equals("") || textoAnoFabricacao.getText().equals("")
                || textoCapacidadeTanque.getText().equals("") || textoConsumoMedio.getText().equals("")) {
          
         JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
         botaoSalvar.setEnabled(true);
        
       } else {
        
        VeiculoModelo p = new VeiculoModelo(Integer.parseInt(textoCodigoVeiculo.getText()), textoPlaca.getText(), (String)comboBoxTipoVeiculo.getSelectedItem(), textoFabricante.getText(), textoModelo.getText(), textoCor.getText(), Integer.parseInt(textoAnoFabricacao.getText()), textoChassi.getText(), Integer.parseInt(textoCapacidadeTanque.getText()), Float.parseFloat(textoConsumoMedio.getText())); 

        VeiculoControle veiculo = new VeiculoControle();

        try {
            veiculo.editar(p);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

        textoPlaca.setEnabled(false); 
        comboBoxTipoVeiculo.setEnabled(false);
        textoFabricante.setEnabled(false);
        textoChassi.setEnabled(false); 
        textoModelo.setEnabled(false);
        textoCor.setEnabled(false);
        textoAnoFabricacao.setEnabled(false);
        textoCapacidadeTanque.setEnabled(false); 
        textoConsumoMedio.setEnabled(false);
        
        textoCodigoVeiculo.setText("");
        textoPlaca.setText("");
        comboBoxTipoVeiculo.setSelectedIndex(0);
        textoFabricante.setText("");
        textoChassi.setText("");
        textoModelo.setText("");
        textoCor.setText("");
        textoAnoFabricacao.setText("");
        textoCapacidadeTanque.setText("");
        textoConsumoMedio.setText("");
        
        botaoSalvar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoEditar.setEnabled(false);
        
        }

    }//GEN-LAST:event_botaoEditarActionPerformed

    private void textoPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPlacaActionPerformed

    private void textoPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPlacaKeyTyped
       
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoPlaca.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 7) { evt.consume(); }
    }//GEN-LAST:event_textoPlacaKeyTyped

    private void textoFabricanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoFabricanteKeyTyped
       
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'a' || c>'z') && (c<'A' || c>'Z')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoFabricante.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 20) { evt.consume(); }
    }//GEN-LAST:event_textoFabricanteKeyTyped

    private void textoChassiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoChassiKeyTyped
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoChassi.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 17) { evt.consume(); }
    }//GEN-LAST:event_textoChassiKeyTyped

    private void textoModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoModeloKeyTyped
         boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoModelo.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 20) { evt.consume(); }
    }//GEN-LAST:event_textoModeloKeyTyped

    private void textoAnoFabricacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoAnoFabricacaoKeyTyped
        
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoAnoFabricacao.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 4) { evt.consume(); }
    }//GEN-LAST:event_textoAnoFabricacaoKeyTyped

    private void textoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCorActionPerformed

    private void textoCorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCorKeyTyped
        
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'a' || c>'z') && (c<'A' || c>'Z')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoCor.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 20) { evt.consume(); }
    }//GEN-LAST:event_textoCorKeyTyped

    private void textoCapacidadeTanqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCapacidadeTanqueKeyTyped
        
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'0' || c>'9')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoCapacidadeTanque.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 3) { evt.consume(); }
    }//GEN-LAST:event_textoCapacidadeTanqueKeyTyped

    private void textoConsumoMedioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoConsumoMedioKeyTyped
        
        boolean teclaCerta = true;
        
        char c = evt.getKeyChar();

            if((c<'0' || c>'9') && (c!='.')){
                
                teclaCerta = false;
            
            }
            
             int comprimentoDeCampo = textoConsumoMedio.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 3) { evt.consume(); }
    }//GEN-LAST:event_textoConsumoMedioKeyTyped

    private void textoConsumoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoConsumoMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoConsumoMedioActionPerformed

    private void textoCapacidadeTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCapacidadeTanqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCapacidadeTanqueActionPerformed

    private void textoFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFabricanteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
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
    private javax.swing.JComboBox<String> comboBoxTipoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelAnoDeFabricacao;
    private javax.swing.JLabel labelCodigoVeiculo;
    private javax.swing.JLabel labelConsumoMedio;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JTextField textoAnoFabricacao;
    private javax.swing.JTextField textoCapacidadeTanque;
    private javax.swing.JTextField textoChassi;
    private javax.swing.JTextField textoCodigoVeiculo;
    private javax.swing.JTextField textoConsumoMedio;
    private javax.swing.JTextField textoCor;
    private javax.swing.JTextField textoFabricante;
    private javax.swing.JTextField textoModelo;
    private javax.swing.JTextField textoPlaca;
    // End of variables declaration//GEN-END:variables
}
