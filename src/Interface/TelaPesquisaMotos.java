/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.moto;
import model.bean.motoClub;
import model.bean.pessoa;
import model.bean.usuario;
import model.dao.mcDAO;
import model.dao.pessoaDAO;
import model.dao.usuarioDAO;

/**
 *
 * @author papiro
 */
public class TelaPesquisaMotos extends javax.swing.JFrame {

    private List<usuario> usuarios;
    private List<motoClub> MCs;
    private List<pessoa> pessoas;
    private List<moto> motos1;
    private List<moto> motosPesq;
    private usuarioDAO form;
    private pessoaDAO form1;
    private mcDAO form2;
    private moto moto;
    private pessoa pessoa;
    private usuario usuario;
    private motoClub mc;
    private int aux;
    private String pesquisa;
    /**
     * Creates new form telaPesquisa
     */
    public TelaPesquisaMotos() {
        initComponents();
        aux = 0;
        pesquisa = "";
        motosPesq = new ArrayList<>();
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
        btnProx = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblInserirNome = new javax.swing.JLabel();
        lblInserirCate = new javax.swing.JLabel();
        lblInserirMarca = new javax.swing.JLabel();
        lblInserirValor = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemHome4 = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        editarMC = new javax.swing.JMenuItem();
        editarUsuario = new javax.swing.JMenuItem();
        excluirUsuario = new javax.swing.JMenuItem();
        excluirMC = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenu();
        motos = new javax.swing.JMenuItem();
        motoclubs = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 128, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(555, 475));

        btnProx.setBackground(new java.awt.Color(254, 254, 254));
        btnProx.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnProx.setForeground(new java.awt.Color(8, 1, 1));
        btnProx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnProx.setText("Próximo");
        btnProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxActionPerformed(evt);
            }
        });

        btnAnt.setBackground(new java.awt.Color(254, 254, 254));
        btnAnt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAnt.setForeground(new java.awt.Color(8, 1, 1));
        btnAnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnAnt.setText("Anterior");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNome.setText("Modelo:");

        lblCategoria.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCategoria.setText("Categoria:");

        lblMarca.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblMarca.setText("Marca:");

        lblValor.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblValor.setText("Valor de mercado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValor)
                            .addComponent(lblNome)
                            .addComponent(lblCategoria)
                            .addComponent(lblMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInserirValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblInserirNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblInserirCate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblInserirMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProx)
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblInserirNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(lblInserirCate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(lblInserirMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblInserirValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnt)
                    .addComponent(btnProx))
                .addContainerGap())
        );

        menuBar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuBar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        itemHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        itemHome4.setText("Home");
        itemHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHome4ActionPerformed(evt);
            }
        });
        menuArquivo.add(itemHome4);

        itemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSair);

        menuBar.add(menuArquivo);

        menuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        menuEditar.setText("Editar");

        editarMC.setBackground(new java.awt.Color(1, 1, 1));
        editarMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMoto.png"))); // NOI18N
        editarMC.setText("MotoClub");
        editarMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMCActionPerformed(evt);
            }
        });
        menuEditar.add(editarMC);

        editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_edit.png"))); // NOI18N
        editarUsuario.setText("Info. Pessoais");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });
        menuEditar.add(editarUsuario);

        excluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.png"))); // NOI18N
        excluirUsuario.setText("Excluir Usuário");
        excluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuarioActionPerformed(evt);
            }
        });
        menuEditar.add(excluirUsuario);

        excluirMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_delete.png"))); // NOI18N
        excluirMC.setText("ExcluirMC");
        excluirMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirMCActionPerformed(evt);
            }
        });
        menuEditar.add(excluirMC);

        menuBar.add(menuEditar);

        menuListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/printer.png"))); // NOI18N
        menuListar.setText("Listar");

        motos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/moto.png"))); // NOI18N
        motos.setText("Motos");
        motos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motosActionPerformed(evt);
            }
        });
        menuListar.add(motos);

        motoclubs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        motoclubs.setText("MotoClubs");
        motoclubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoclubsActionPerformed(evt);
            }
        });
        menuListar.add(motoclubs);

        menuBar.add(menuListar);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        menuBar.add(menuSobre);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHome4ActionPerformed
        // TODO add your handling code here:
        TelaMenuInicial tela = new TelaMenuInicial();
        tela.getObjetos(usuarios, pessoas, MCs, motos1);
        tela.getMc(mc);
        tela.getPessoa(pessoa);
        tela.getUsuario(usuario);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemHome4ActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        // TODO add your handling code here:
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemSairActionPerformed

    private void editarMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMCActionPerformed
        // TODO add your handling code here:
        TelaEditarMC tela = new TelaEditarMC();
        tela.getObjetos(usuarios, pessoas, MCs, motos1);
        tela.getMc(mc);
        tela.getPessoa(pessoa);
        tela.getUsuario(usuario);
        tela.inserir();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_editarMCActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed
        // TODO add your handling code here:
        TelaEditarPessoa tela = new TelaEditarPessoa();
        tela.getObjetos(usuarios, pessoas, MCs, motos1);
        tela.getMc(mc);
        tela.getPessoa(pessoa);
        tela.getUsuario(usuario);  
        tela.inserir();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void excluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuarioActionPerformed
        // TODO add your handling code here:
        PopUpConfirmar conf = new PopUpConfirmar();
        conf.confirmar("usuario",usuario,mc,pessoa,MCs); //FALTA CRIAR UMA RELACAO ENTRE USUARIO, PESSOA LA NO BD COM A FOREIGN KEY
        conf.setVisible(true);
    }//GEN-LAST:event_excluirUsuarioActionPerformed

    private void excluirMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirMCActionPerformed
        // TODO add your handling code here:
        PopUpConfirmar conf = new PopUpConfirmar();
        conf.confirmar("mc",usuario,mc,pessoa,MCs); //FALTA CRIAR UMA RELACAO ENTRE USUARIO E MC LA NO BD COM A FOREIGN KEY
        conf.setVisible(true);
    }//GEN-LAST:event_excluirMCActionPerformed

    private void motosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motosActionPerformed
        // TODO add your handling code here:
        TelaMotos tela1 = new TelaMotos();
        tela1.setVisible(true);
        tela1.getObjetos(usuarios, pessoas, MCs, motos1);
        tela1.getMc(mc);
        tela1.getPessoa(pessoa);
        tela1.getUsuario(usuario);
        tela1.inserir();
        dispose();
    }//GEN-LAST:event_motosActionPerformed

    private void motoclubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoclubsActionPerformed
        // TODO add your handling code here:
        TelaMCs tela1 = new TelaMCs();
        tela1.getObjetos(usuarios, pessoas, MCs, motos1);
        tela1.getMc(mc);
        tela1.getPessoa(pessoa);
        tela1.getUsuario(usuario);
        tela1.setVisible(true);
        dispose();
    }//GEN-LAST:event_motoclubsActionPerformed

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Sistema de gerenciamento de MotorClubs\nVersão 1.0");
    }//GEN-LAST:event_menuSobreMouseClicked

    private void btnProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxActionPerformed
        // TODO add your handling code here:
        if(aux == motosPesq.size()-1){
            btnProx.setEnabled(false);
        }else{
            aux+=1;
            btnAnt.setEnabled(true);
            btnProx.setEnabled(true);
            moto = motosPesq.get(aux);
            lblImagem.setIcon(moto.getImagemPesquisa(aux,pesquisa));
            lblInserirNome.setText(moto.getNome());
            lblInserirCate.setText(moto.getCategoria());
            lblInserirMarca.setText(moto.getMarca());
            lblInserirValor.setText(Double.toString(moto.getValor()));
        }

    }//GEN-LAST:event_btnProxActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        // TODO add your handling code here:
        if(aux <= 0){
            btnAnt.setEnabled(false);
            inserir(pesquisa);
        }else{
            btnAnt.setEnabled(true);
            btnProx.setEnabled(true);
            aux-=1;          
            moto = motosPesq.get(aux);
            lblImagem.setIcon(moto.getImagemPesquisa(aux,pesquisa));
            lblInserirNome.setText(moto.getNome());
            lblInserirCate.setText(moto.getCategoria());
            lblInserirMarca.setText(moto.getMarca());
            lblInserirValor.setText(Double.toString(moto.getValor()));
        }

    }//GEN-LAST:event_btnAntActionPerformed

    public void inserir(String pesquisa){
        this.pesquisa = pesquisa;
        btnAnt.setEnabled(false);
        int i = motos1.size()-1;
        int j = 0;
        if(motosPesq.isEmpty()){
            do{
                moto m = new moto();
                m = motos1.get(i);
                if(m.getCategoria().compareToIgnoreCase(this.pesquisa) == 0){
                    motosPesq.add(j, m);
                    m = motosPesq.get(j);
                    j++;                
                }
                i--;
            }while(i != 0);
        }
        moto = motosPesq.get(aux);
        lblImagem.setIcon(moto.getImagemPesquisa(aux,this.pesquisa));
        lblInserirNome.setText(moto.getNome());
        lblInserirCate.setText(moto.getCategoria());
        lblInserirMarca.setText(moto.getMarca());
        lblInserirValor.setText(Double.toString(moto.getValor()));
    }
    
    public void getObjetos(List<usuario> u, List<pessoa> p, List<motoClub> mc, List<moto> m){
        usuarios = u;
        MCs = mc; 
        pessoas = p;
        motos1 = m;
    }
    public void getMc(motoClub mc){this.mc = mc;}
    public void getPessoa(pessoa p){pessoa = p;}
    public void getUsuario(usuario u){usuario = u;}
    public void getMotos (List<moto> motos){ motos1 = motos;}
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
            java.util.logging.Logger.getLogger(TelaPesquisaMotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaMotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaMotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaMotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaMotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnProx;
    private javax.swing.JMenuItem editarMC;
    private javax.swing.JMenuItem editarUsuario;
    private javax.swing.JMenuItem excluirMC;
    private javax.swing.JMenuItem excluirUsuario;
    private javax.swing.JMenuItem itemHome4;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblInserirCate;
    private javax.swing.JLabel lblInserirMarca;
    private javax.swing.JLabel lblInserirNome;
    private javax.swing.JLabel lblInserirValor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValor;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuListar;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem motoclubs;
    private javax.swing.JMenuItem motos;
    // End of variables declaration//GEN-END:variables
}
