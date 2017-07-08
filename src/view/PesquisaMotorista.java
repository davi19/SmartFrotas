// JDialog

package view;

import Controle.MotoristaControle;
import java.sql.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PesquisaMotorista extends javax.swing.JDialog {

    private String codMotorista;
    private String nomeMotorista;
    private String categoriaCNH;
    private String numeroCNH;
    private Date dataDeVencimentoCNH;  
    
    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }
    
    public Date getDataDeVencimentoCNH() {
        return dataDeVencimentoCNH;
    }
    
    public String getCodMotorista() {
        return codMotorista;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }
    
    MotoristaControle motorista;
    TelaCadastroMotorista telaCadastroMotorista;
    
    public PesquisaMotorista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        motorista = new  MotoristaControle();
        telaCadastroMotorista = new TelaCadastroMotorista();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMotorista = new javax.swing.JTable();
        textoPesquisaMotorista = new javax.swing.JTextField();
        labelPesquisarMotorista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Categoria da CNH", "Numero CNH", "Data do Vencimento CNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMotoristaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMotorista);

        textoPesquisaMotorista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoPesquisaMotoristaKeyReleased(evt);
            }
        });

        labelPesquisarMotorista.setText("Digite o nome do Motorista");

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
                        .addGap(0, 538, Short.MAX_VALUE))
                    .addComponent(textoPesquisaMotorista))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelPesquisarMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPesquisaMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMotoristaMouseClicked
  
        int indiceLinha = tabelaMotorista.getSelectedRow();
        //jTextField1.setText(tabelaMotorista.getValueAt(indiceLinha, 1).toString());
        
        codMotorista = tabelaMotorista.getValueAt(indiceLinha, 0).toString();
        nomeMotorista = tabelaMotorista.getValueAt(indiceLinha, 1).toString();
        categoriaCNH = tabelaMotorista.getValueAt(indiceLinha, 2).toString();
        numeroCNH = tabelaMotorista.getValueAt(indiceLinha, 3).toString();
        dataDeVencimentoCNH = Date.valueOf(tabelaMotorista.getValueAt(indiceLinha, 4).toString());
        //vencimento.setDate(Integer.parseInt(tabelaMotorista.getValueAt(indiceLinha, 3).toString())); // ERRO AQUI
        
        //telaCadastroMotorista.textoNome.setText(String.valueOf(tabelaMotorista.getValueAt(indiceLinha, 1).toString()));
        //telaCadastroMotorista.textoNumeroCNH.setText(tabelaMotorista.getValueAt(indiceLinha, 2).toString());
        //telaCadastroMotorista.calendarioVencimento.setDateFormatString((tabelaMotorista.getValueAt(indiceLinha, 3).toString()));
        //TelaCadastroMotorista.textoCodigoMotorista.setText(tabelaMotorista.getValueAt(indiceLinha, 1).toString());
        //String auxData = tabelaMotorista.getValueAt(indiceLinha, 4).toString(); FUNCIONANDO
        //JOptionPane.showMessageDialog(null, auxData);
        //java.sql.Date javaSqlDate = java.sql.Date.valueOf(auxData); FUNCIONANDO
        //dataDeEmissaoCNH = javaSqlDate; FUNCIONANDO
        
        dispose();
    }//GEN-LAST:event_tabelaMotoristaMouseClicked

    private void textoPesquisaMotoristaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPesquisaMotoristaKeyReleased
        try{

            Vector cabecalho = new Vector();
            cabecalho.add("codMotorista");
            cabecalho.add("nomeMotorista");
            cabecalho.add("categoriaCNH");
            cabecalho.add("numeroCNH");
            cabecalho.add("dataDeVencimentoCNH");

            if(!textoPesquisaMotorista.getText().equals("")){
                DefaultTableModel nv = new DefaultTableModel(motorista.Pesquisar(textoPesquisaMotorista.getText()),cabecalho);
                tabelaMotorista.setModel(nv);
            }else{
                DefaultTableModel nv = new DefaultTableModel(new Vector(),cabecalho);
                tabelaMotorista.setModel(nv);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "ERRO AO PESQUISAR" + ex.getMessage());
        }
    }//GEN-LAST:event_textoPesquisaMotoristaKeyReleased

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
            java.util.logging.Logger.getLogger(PesquisaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesquisaMotorista dialog = new PesquisaMotorista(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable tabelaMotorista;
    private javax.swing.JTextField textoPesquisaMotorista;
    // End of variables declaration//GEN-END:variables
}
