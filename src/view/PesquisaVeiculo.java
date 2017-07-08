/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controle.VeiculoControle;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andre
 */
public class PesquisaVeiculo extends javax.swing.JDialog {

    private String placaVeiculo;
    private String tipoVeiculo;
    private String fabricante;
    private String modelo;
    private String cor;
    private String anoFabricacao;
    private String numeroChassi;
    private String capacidadeTanque;
    private String mediaConsumo;
    
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public String getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public String getMediaConsumo() {
        return mediaConsumo;
    }
    
    VeiculoControle veiculo;
    TelaCadastroVeiculo telaCadastroVeiculo;
    
    
    public PesquisaVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        
       veiculo = new VeiculoControle() ;
       telaCadastroVeiculo = new TelaCadastroVeiculo();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVeiculo = new javax.swing.JTable();
        textoPesquisaVeiculo = new javax.swing.JTextField();
        labelPesquisarVeiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo", "Fabricante", "Modelo", "Cor", "Ano Fabricação", "Nº Chassi", "Capacidade do Tanque", "Média Consumo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVeiculo);

        textoPesquisaVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoPesquisaVeiculoKeyReleased(evt);
            }
        });

        labelPesquisarVeiculo.setText("Digite a placa do veículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoPesquisaVeiculo)
                    .addComponent(labelPesquisarVeiculo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelPesquisarVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVeiculoMouseClicked

        int indiceLinha = tabelaVeiculo.getSelectedRow();
        
        placaVeiculo = tabelaVeiculo.getValueAt(indiceLinha, 0).toString();
        tipoVeiculo = tabelaVeiculo.getValueAt(indiceLinha, 1).toString();
        fabricante = tabelaVeiculo.getValueAt(indiceLinha, 2).toString();
        modelo = tabelaVeiculo.getValueAt(indiceLinha, 3).toString();
        cor = tabelaVeiculo.getValueAt(indiceLinha, 4).toString();
        anoFabricacao = tabelaVeiculo.getValueAt(indiceLinha, 5).toString();
        numeroChassi = tabelaVeiculo.getValueAt(indiceLinha, 6).toString();
        capacidadeTanque = tabelaVeiculo.getValueAt(indiceLinha, 7).toString();
        mediaConsumo = tabelaVeiculo.getValueAt(indiceLinha, 8).toString();
        
        dispose();
    }//GEN-LAST:event_tabelaVeiculoMouseClicked

    private void textoPesquisaVeiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPesquisaVeiculoKeyReleased
        try{

            Vector cabecalho = new Vector();
            cabecalho.add("placaVeiculo");
            cabecalho.add("tipoVeiculo");
            cabecalho.add("fabricante");
            cabecalho.add("modelo");
            cabecalho.add("cor");
            cabecalho.add("anoFabricacao");
            cabecalho.add("numeroChassi");
            cabecalho.add("capacidadeTanque");
            cabecalho.add("mediaConsumo");
            
            if(!textoPesquisaVeiculo.getText().equals("")){
                DefaultTableModel nv = new DefaultTableModel(veiculo.Pesquisar(textoPesquisaVeiculo.getText()),cabecalho);
                tabelaVeiculo.setModel(nv);
            }else{
                DefaultTableModel nv = new DefaultTableModel(new Vector(),cabecalho);
                tabelaVeiculo.setModel(nv);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "ERRO AO PESQUISAR" + ex.getMessage());
        }
    }//GEN-LAST:event_textoPesquisaVeiculoKeyReleased

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
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesquisaVeiculo dialog = new PesquisaVeiculo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPesquisarVeiculo;
    private javax.swing.JTable tabelaVeiculo;
    private javax.swing.JTextField textoPesquisaVeiculo;
    // End of variables declaration//GEN-END:variables
}
