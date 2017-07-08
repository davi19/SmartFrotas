package view;

import Controle.ControleDeViagemControle;
import java.sql.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PesquisaViagens extends javax.swing.JDialog {

    private String codControle;
    private String nomeMotorista;
    private String placaVeiculo;
    private String kmSaida;
    private String kmEntrada;
    private Date dataSaida;
    private Date dataEntrada;

    public String getCodControle() {
        return codControle;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    
    public String getKmSaida() {
        return kmSaida;
    }
    
    public String getKmEntrada() {
        return kmEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }
    
    ControleDeViagemControle controleDeViagemControle;
    TelaAberturaViagem telaAberturaViagem;
    
    public PesquisaViagens(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        
        controleDeViagemControle = new ControleDeViagemControle();
        telaAberturaViagem = new TelaAberturaViagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPesquisarViagens = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaControle = new javax.swing.JTable();
        textoPesquisaControle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelPesquisarViagens.setText("Digite o nome do Motorista");

        tabelaControle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Motorista", "Placa Veiculo", "KM Saida", "KM Entrada", "Data Saida", "Data Entrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaControleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaControle);

        textoPesquisaControle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoPesquisaControleKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPesquisarViagens)
                        .addGap(554, 622, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(textoPesquisaControle))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelPesquisarViagens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPesquisaControle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaControleMouseClicked

        int indiceLinha = tabelaControle.getSelectedRow();

        codControle = tabelaControle.getValueAt(indiceLinha, 0).toString();
        nomeMotorista = tabelaControle.getValueAt(indiceLinha, 1).toString();    
        placaVeiculo = tabelaControle.getValueAt(indiceLinha, 2).toString();
        kmSaida = tabelaControle.getValueAt(indiceLinha, 3).toString();
        kmEntrada = tabelaControle.getValueAt(indiceLinha, 4).toString();
        dataSaida = Date.valueOf(tabelaControle.getValueAt(indiceLinha, 5).toString());
        dataEntrada = Date.valueOf(tabelaControle.getValueAt(indiceLinha, 6).toString());
        
        dispose();
    }//GEN-LAST:event_tabelaControleMouseClicked

    private void textoPesquisaControleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPesquisaControleKeyReleased
        try{

            Vector cabecalho = new Vector();
            cabecalho.add("codControle");
            cabecalho.add("nomeMotorista");
            cabecalho.add("placaVeiculo");
            cabecalho.add("kmSaida");
            cabecalho.add("kmEntrada");
            cabecalho.add("dataSaida");
            cabecalho.add("dataEntrada");
            

            if(!textoPesquisaControle.getText().equals("")){
                DefaultTableModel nv = new DefaultTableModel(controleDeViagemControle.Pesquisar(textoPesquisaControle.getText()),cabecalho);
                tabelaControle.setModel(nv);
            }else{
                DefaultTableModel nv = new DefaultTableModel(new Vector(),cabecalho);
                tabelaControle.setModel(nv);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "ERRO AO PESQUISAR" + ex.getMessage());
        }
    }//GEN-LAST:event_textoPesquisaControleKeyReleased

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
            java.util.logging.Logger.getLogger(PesquisaViagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaViagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaViagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaViagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesquisaViagens dialog = new PesquisaViagens(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel labelPesquisarViagens;
    private javax.swing.JTable tabelaControle;
    private javax.swing.JTextField textoPesquisaControle;
    // End of variables declaration//GEN-END:variables
}
