package view;

import Controle.UsuarioControle;
import Modelo.UsuarioModelo;

/**
 *
 * @author Andre
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    public TelaCadastroUsuario() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNovoUsuario = new javax.swing.JButton();
        botaoPesquisarUsuario = new javax.swing.JButton();
        botaoEditarUsuario = new javax.swing.JButton();
        botaoExcluirUsuario = new javax.swing.JButton();
        botaoSalvarUsuario = new javax.swing.JButton();
        botaoSairUsuario = new javax.swing.JButton();
        textoLogin = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textoPermissao = new javax.swing.JTextField();
        labelPremissao = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();

        botaoNovoUsuario.setBackground(new java.awt.Color(204, 204, 204));
        botaoNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Add.png"))); // NOI18N
        botaoNovoUsuario.setBorderPainted(false);
        botaoNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoUsuarioActionPerformed(evt);
            }
        });

        botaoPesquisarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        botaoPesquisarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Search_find_locate_1542.png"))); // NOI18N
        botaoPesquisarUsuario.setBorderPainted(false);
        botaoPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarUsuarioActionPerformed(evt);
            }
        });

        botaoEditarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        botaoEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/edit-validated_40458.png"))); // NOI18N
        botaoEditarUsuario.setBorderPainted(false);

        botaoExcluirUsuario.setBackground(new java.awt.Color(204, 204, 204));
        botaoExcluirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/delete_4219.png"))); // NOI18N
        botaoExcluirUsuario.setBorderPainted(false);

        botaoSalvarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        botaoSalvarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/save-icon.png"))); // NOI18N
        botaoSalvarUsuario.setBorderPainted(false);
        botaoSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarUsuarioActionPerformed(evt);
            }
        });

        botaoSairUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/log_logout_door_1563.png"))); // NOI18N
        botaoSairUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairUsuarioActionPerformed(evt);
            }
        });

        textoLogin.setEnabled(false);

        labelLogin.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelLogin.setText("Login");

        labelSenha.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelSenha.setText("Senha");

        textoPermissao.setEnabled(false);

        labelPremissao.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelPremissao.setText("Nivel de Permissão");

        textoSenha.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelPremissao)
                            .addComponent(labelLogin))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(textoPermissao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSairUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSairUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPremissao))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoUsuarioActionPerformed
        
        textoLogin.setEnabled(true);
        textoSenha.setEnabled(true);
        textoPermissao.setEnabled(true);
        
    }//GEN-LAST:event_botaoNovoUsuarioActionPerformed

    private void botaoPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarUsuarioActionPerformed
        TelaPesquisarViagens tela = new TelaPesquisarViagens();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarUsuarioActionPerformed

    private void botaoSairUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairUsuarioActionPerformed
        this.dispose();

    }//GEN-LAST:event_botaoSairUsuarioActionPerformed

    private void botaoSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarUsuarioActionPerformed
        
        UsuarioModelo p=new UsuarioModelo(); 
         
        p.setLogin(textoLogin.getText());
        p.setSenha(textoSenha.getText());
        p.setNivelPermissao(Integer.parseInt(textoPermissao.getText()));
       
        UsuarioControle usuario = new UsuarioControle(); 
         
        usuario.inserir(p);
        
        textoLogin.setEnabled(false);
        textoSenha.setEnabled(false);
        textoPermissao.setEnabled(false);
        
    }//GEN-LAST:event_botaoSalvarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarUsuario;
    private javax.swing.JButton botaoExcluirUsuario;
    private javax.swing.JButton botaoNovoUsuario;
    private javax.swing.JButton botaoPesquisarUsuario;
    private javax.swing.JButton botaoSairUsuario;
    private javax.swing.JButton botaoSalvarUsuario;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPremissao;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTextField textoLogin;
    private javax.swing.JTextField textoPermissao;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
