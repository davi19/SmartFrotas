package view;

import Controle.UsuarioControle;
import Modelo.UsuarioModelo;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Andre
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    public TelaCadastroUsuario() {
       
       initComponents();
        
       botaoEditarUsuario.setEnabled(false);
       botaoExcluirUsuario.setEnabled(false);
       botaoSalvarUsuario.setEnabled(false);
       
       labelCodigoUsuario.setVisible(false);
       textoCodigoUsuario.setVisible(false);
       
       setLocationRelativeTo(null);
       
       this.comboBoxPermissao.addItem("PARCIAL"); // Preenchimento das ComboBox
       this.comboBoxPermissao.addItem("TOTAL"); // Preenchimento das ComboBox
 
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        botaoNovoUsuario = new javax.swing.JButton();
        botaoPesquisarUsuario = new javax.swing.JButton();
        botaoEditarUsuario = new javax.swing.JButton();
        botaoExcluirUsuario = new javax.swing.JButton();
        botaoSalvarUsuario = new javax.swing.JButton();
        botaoSairUsuario = new javax.swing.JButton();
        textoLogin = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelPremissao = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        comboBoxPermissao = new javax.swing.JComboBox<>();
        textoCodigoUsuario = new javax.swing.JTextField();
        labelCodigoUsuario = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Usuário");
        setSize(new java.awt.Dimension(660, 281));

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
        botaoEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarUsuarioActionPerformed(evt);
            }
        });

        botaoExcluirUsuario.setBackground(new java.awt.Color(204, 204, 204));
        botaoExcluirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/delete_4219.png"))); // NOI18N
        botaoExcluirUsuario.setBorderPainted(false);
        botaoExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirUsuarioActionPerformed(evt);
            }
        });

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
        textoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoLoginActionPerformed(evt);
            }
        });
        textoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoLoginKeyTyped(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelLogin.setText("Login");

        labelSenha.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelSenha.setText("Senha");

        labelPremissao.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelPremissao.setText("Nivel de Permissão");

        textoSenha.setEnabled(false);
        textoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoSenhaKeyTyped(evt);
            }
        });

        comboBoxPermissao.setEnabled(false);

        textoCodigoUsuario.setEnabled(false);
        textoCodigoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCodigoUsuarioActionPerformed(evt);
            }
        });

        labelCodigoUsuario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelCodigoUsuario.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelPremissao)
                            .addComponent(labelLogin)
                            .addComponent(labelCodigoUsuario))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(textoSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(comboBoxPermissao, 0, 234, Short.MAX_VALUE)
                            .addComponent(textoCodigoUsuario))))
                .addGap(18, 18, 18)
                .addComponent(botaoSairUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSairUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPremissao)
                    .addComponent(comboBoxPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoUsuarioActionPerformed
        
        textoLogin.setEnabled(true);
        textoSenha.setEnabled(true);
        comboBoxPermissao.setEnabled(true);
        
        textoLogin.setText("");
        textoSenha.setText("");
        
        botaoSalvarUsuario.setEnabled(true);
        botaoEditarUsuario.setEnabled(false);
        botaoExcluirUsuario.setEnabled(false);
    }//GEN-LAST:event_botaoNovoUsuarioActionPerformed

    private void botaoPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarUsuarioActionPerformed
        PesquisaUsuario tela = new PesquisaUsuario(this,true);
        tela.setVisible(true);
        
        textoCodigoUsuario.setText(tela.getCodUsuario());
        textoLogin.setText(tela.getLogin());
        textoSenha.setText(tela.getSenha());
        comboBoxPermissao.setSelectedItem(tela.getNivelPermissao());
        
        textoLogin.setEnabled(true);
        textoSenha.setEnabled(true);
        comboBoxPermissao.setEnabled(true);
        
        botaoSalvarUsuario.setEnabled(false);
        botaoExcluirUsuario.setEnabled(true);
        botaoEditarUsuario.setEnabled(true);
        
        
    }//GEN-LAST:event_botaoPesquisarUsuarioActionPerformed

    private void botaoSairUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairUsuarioActionPerformed
        this.dispose();

    }//GEN-LAST:event_botaoSairUsuarioActionPerformed

    private void botaoSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarUsuarioActionPerformed

           char[] password = textoSenha.getPassword();  
           String senha = new String(password);  
                     
       if(textoLogin.getText().equals("") || senha.equals("")) {
          
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
        
       } else { 
    
            UsuarioModelo p = new UsuarioModelo(0,String.valueOf(textoSenha.getPassword()), textoLogin.getText(), (String) comboBoxPermissao.getSelectedItem());     

            UsuarioControle usuario = new UsuarioControle();
              
           try {
               usuario.inserir(p);
           } catch (SQLException ex) {
               Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }

            textoLogin.setText("");
            textoSenha.setText("");
            comboBoxPermissao.setSelectedIndex(0);

            textoLogin.setEnabled(false);
            textoSenha.setEnabled(false);
            comboBoxPermissao.setEnabled(false);
            
            botaoSalvarUsuario.setEnabled(false);
            botaoEditarUsuario.setEnabled(false);
            botaoExcluirUsuario.setEnabled(false);
                    
      }
       
    }//GEN-LAST:event_botaoSalvarUsuarioActionPerformed

    private void botaoExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirUsuarioActionPerformed
       
        UsuarioModelo p = new UsuarioModelo(Integer.parseInt(textoCodigoUsuario.getText()),String.valueOf(textoSenha.getPassword()), textoLogin.getText(), (String) comboBoxPermissao.getSelectedItem());     
        
        textoCodigoUsuario.setText("");
        textoLogin.setText("");
        textoSenha.setText("");
        comboBoxPermissao.setSelectedIndex(0);
        
        textoLogin.setEnabled(false);
        textoSenha.setEnabled(false);
        comboBoxPermissao.setEnabled(false);
        
        botaoExcluirUsuario.setEnabled(false);
        botaoEditarUsuario.setEnabled(false);
        botaoSalvarUsuario.setEnabled(false);
        
        

        UsuarioControle usuario = new UsuarioControle();

        usuario.excluir(p.getCodUsuario());
        
        
    }//GEN-LAST:event_botaoExcluirUsuarioActionPerformed

    private void textoSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoSenhaKeyTyped
             
            boolean teclaCerta = true;
       
            char c = evt.getKeyChar();
            
             char[] password = textoSenha.getPassword();  
           String senha = new String(password); 
            
            int comprimentoDeCampo = senha.length();
            
             if (comprimentoDeCampo == 10) { evt.consume(); }
    }//GEN-LAST:event_textoSenhaKeyTyped

    private void textoLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoLoginKeyTyped
            
           boolean teclaCerta = true;
       
            char c = evt.getKeyChar();
            
           if((c<'a' || c>'z') && (c<'A' || c>'Z')){
                
                teclaCerta = false;
            
            }
                        
            int comprimentoDeCampo = textoLogin.getText().length();
            
             if (!teclaCerta || comprimentoDeCampo == 20) { evt.consume(); }
    }//GEN-LAST:event_textoLoginKeyTyped

    private void botaoEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarUsuarioActionPerformed

        UsuarioModelo p = new UsuarioModelo(Integer.parseInt(textoCodigoUsuario.getText()),String.valueOf(textoSenha.getPassword()), textoLogin.getText(), (String) comboBoxPermissao.getSelectedItem());     

        textoCodigoUsuario.setText("");
        textoLogin.setText("");
        textoSenha.setText("");
        comboBoxPermissao.setSelectedIndex(0);
        
        UsuarioControle usuario = new UsuarioControle();
        
        try {
            usuario.editar(p);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroMotorista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        textoLogin.setEnabled(false);
        textoSenha.setEnabled(false);
        comboBoxPermissao.setEnabled(false);
        
        botaoSalvarUsuario.setEnabled(false);
        botaoExcluirUsuario.setEnabled(false);
        botaoEditarUsuario.setEnabled(false);
        
        
    }//GEN-LAST:event_botaoEditarUsuarioActionPerformed

    private void textoCodigoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCodigoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCodigoUsuarioActionPerformed

    private void textoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoLoginActionPerformed

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
    public javax.swing.JComboBox<String> comboBoxPermissao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labelCodigoUsuario;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPremissao;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTextField textoCodigoUsuario;
    private javax.swing.JTextField textoLogin;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
