package view;

import Controle.AbastecimentoControle;
import java.sql.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PesquisaAbastecimento extends javax.swing.JDialog {

    private String codAbastecimento;
    private String placaVeiculo;
    private String quantidadeAbastecida;
    private String quilometroAbastecido;
    private String quilometroAbastecidoAnterior;
    private Date dataAbastecimento;
     
    public String getQuilometroAbastecidoAnterior() {
        return quilometroAbastecidoAnterior;
    }
   
    
    public String getCodAbastecimento() {
        return codAbastecimento;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public String getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public String getQuilometroAbastecido() {
        return quilometroAbastecido;
    }

    public Date getDataAbastecimento() {
        return dataAbastecimento;
    }
    
    
    AbastecimentoControle abastecimento;
    TelaCadastroAbastecimento telaCadastroAbastecimento;
    
    public PesquisaAbastecimento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
     abastecimento = new AbastecimentoControle();
     telaCadastroAbastecimento = new TelaCadastroAbastecimento();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAbastecimento = new javax.swing.JTable();
        textoPesquisaAbastecimento = new javax.swing.JTextField();
        labelPesquisarMotorista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaAbastecimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Placa Veiculo", "Quantidade Abastecida", "KM Abastecido", "KM Abastecido Anterior", "Data Abastecimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAbastecimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAbastecimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAbastecimento);

        textoPesquisaAbastecimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoPesquisaAbastecimentoKeyReleased(evt);
            }
        });

        labelPesquisarMotorista.setText("Digite a Placa do Veiculo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPesquisarMotorista)
                        .addGap(0, 630, Short.MAX_VALUE))
                    .addComponent(textoPesquisaAbastecimento))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelPesquisarMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPesquisaAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAbastecimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAbastecimentoMouseClicked

        int indiceLinha = tabelaAbastecimento.getSelectedRow();
        
        codAbastecimento = tabelaAbastecimento.getValueAt(indiceLinha, 0).toString();
        placaVeiculo = tabelaAbastecimento.getValueAt(indiceLinha, 1).toString();
        quantidadeAbastecida = tabelaAbastecimento.getValueAt(indiceLinha, 2).toString();
        quilometroAbastecido = tabelaAbastecimento.getValueAt(indiceLinha, 3).toString();
        quilometroAbastecidoAnterior = tabelaAbastecimento.getValueAt(indiceLinha, 4).toString();
        dataAbastecimento = Date.valueOf(tabelaAbastecimento.getValueAt(indiceLinha, 5).toString());
        
        dispose();
    }//GEN-LAST:event_tabelaAbastecimentoMouseClicked

    private void textoPesquisaAbastecimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPesquisaAbastecimentoKeyReleased
        try{

            Vector cabecalho = new Vector();
            cabecalho.add("codAbastecimento");
            cabecalho.add("placaVeiculo");
            cabecalho.add("quantidadeAbastecida");
            cabecalho.add("quilometroAbastecido");
            cabecalho.add("quilometroAbastecidoAnterior");
            cabecalho.add("dataAbastecimento");

            if(!textoPesquisaAbastecimento.getText().equals("")){
                DefaultTableModel nv = new DefaultTableModel(abastecimento.Pesquisar(textoPesquisaAbastecimento.getText()),cabecalho);
                tabelaAbastecimento.setModel(nv);
            }else{
                DefaultTableModel nv = new DefaultTableModel(new Vector(),cabecalho);
                tabelaAbastecimento.setModel(nv);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "ERRO AO PESQUISAR" + ex.getMessage());
        }
    }//GEN-LAST:event_textoPesquisaAbastecimentoKeyReleased

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
            java.util.logging.Logger.getLogger(PesquisaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesquisaAbastecimento dialog = new PesquisaAbastecimento(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel labelPesquisarMotorista;
    private javax.swing.JTable tabelaAbastecimento;
    private javax.swing.JTextField textoPesquisaAbastecimento;
    // End of variables declaration//GEN-END:variables
}
