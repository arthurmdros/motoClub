/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.bean.pessoa;
import model.bean.usuario;
import model.dao.pessoaDAO;
import model.dao.usuarioDAO;

/**
 *
 * @author papiro
 */

public class AlterarUsuario extends javax.swing.JFrame {

    private List<usuario> usuarios;
    private List<pessoa> pessoas;
    private usuarioDAO form;
    private pessoaDAO form1;
    private pessoa pessoa;
    private usuario usuario;
    /**
     * Creates new form AlterarUsuario
     */
    public AlterarUsuario() {
        initComponents();
        grupoBotoes();
        form = new usuarioDAO();
        form1 = new pessoaDAO();
        pessoa = new pessoa();
        usuario = new usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkNome = new javax.swing.JRadioButton();
        checkSenha = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAnterior = new javax.swing.JPasswordField();
        txtNovo = new javax.swing.JPasswordField();
        checkMostrar = new javax.swing.JCheckBox();
        checkMostrarN = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 128, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        checkNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        checkNome.setText("Nome");
        checkNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNomeActionPerformed(evt);
            }
        });

        checkSenha.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        checkSenha.setText("Senha");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Selecione qual informação deseja alterar:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Informe novo:");

        btnConfirmar.setBackground(new java.awt.Color(1, 1, 1));
        btnConfirmar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(254, 254, 254));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Informe antigo:");

        txtAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnteriorActionPerformed(evt);
            }
        });

        checkMostrar.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        checkMostrar.setText("Mostrar");
        checkMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostrarActionPerformed(evt);
            }
        });

        checkMostrarN.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        checkMostrarN.setText("Mostrar");
        checkMostrarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostrarNActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(1, 1, 1));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(254, 254, 254));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtNovo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkMostrarN)
                                    .addComponent(checkMostrar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(checkNome)
                        .addGap(106, 106, 106)
                        .addComponent(checkSenha)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNome)
                    .addComponent(checkSenha))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMostrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMostrarN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void grupoBotoes(){
        ButtonGroup gB = new ButtonGroup();
        gB.add(checkNome);
        gB.add(checkSenha);
        
    }
    
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if(checkNome.isSelected() == true){
            usuario.setNome(txtNovo.getText());
            if(form.Alterar(usuario, checkNome.getText())){
                JOptionPane.showMessageDialog(null,"ALTERADO COM SUCESSO!");
                dispose();
            }else
                JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR! INFORMAÇÃO INCORRETA.");
        }else if(checkSenha.isSelected() == true){
            if(txtAnterior.getText().equals(usuario.getSenha())){
                    usuario.setSenha(txtNovo.getText());
                if(form.Alterar(usuario, checkSenha.getText())){
                   JOptionPane.showMessageDialog(null,"ALTERADO COM SUCESSO!");
                   dispose();
               }else
                   JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR! INFORMAÇÃO INCORRETA.");
            }else
                JOptionPane.showMessageDialog(null, "INFORME A INFORMAÇÃO ANTIGA.");
        }else
            JOptionPane.showMessageDialog(null,"SELECIONE UMA OPÇÃO.");
              
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void checkNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNomeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"DESCONSIDERE A INFORMAÇÃO ANTERIOR.");
        txtAnterior.setEditable(false);
        checkMostrar.setEnabled(false);
        checkMostrarN.setEnabled(false);
        txtAnterior.setEchoChar((char)0);
        txtNovo.setEchoChar((char)0);
    }//GEN-LAST:event_checkNomeActionPerformed

    private void checkMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostrarActionPerformed
        // TODO add your handling code here:
        txtAnterior.setEchoChar((char)0);
        if(checkMostrar.isSelected()==false)
            txtAnterior.setEchoChar('*');
    }//GEN-LAST:event_checkMostrarActionPerformed

    private void checkMostrarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostrarNActionPerformed
        // TODO add your handling code here:
        txtNovo.setEchoChar((char)0);
        if(checkMostrarN.isSelected()==false)
            txtNovo.setEchoChar('*');
    }//GEN-LAST:event_checkMostrarNActionPerformed

    private void txtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnteriorActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void getObjetos(List<usuario> u, List<pessoa> p){
        usuarios = u;
        pessoas = p;
    }
    public void getPessoa(pessoa p){pessoa = p;}
    public void getUsuario(usuario u){usuario = u;}
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
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox checkMostrar;
    private javax.swing.JCheckBox checkMostrarN;
    private javax.swing.JRadioButton checkNome;
    private javax.swing.JRadioButton checkSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtAnterior;
    private javax.swing.JPasswordField txtNovo;
    // End of variables declaration//GEN-END:variables
}
