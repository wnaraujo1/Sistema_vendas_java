/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.clientes;

/**
 *
 * @author w.araujo
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextLimiteCredito = new javax.swing.JTextField();
        jTextId = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextCpf = new javax.swing.JTextField();
        jTextTelefone = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 200, 22);

        jLabel2.setText("Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 61, 10, 14);

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 60, 60, 14);

        jLabel4.setText("Cpf");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 60, 14);

        jLabel5.setText("Telefone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 130, 70, 14);

        jLabel6.setText("Limite de Credito");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 190, 100, 14);

        jLabel7.setText("E-mail");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 190, 70, 14);
        getContentPane().add(jTextLimiteCredito);
        jTextLimiteCredito.setBounds(280, 210, 100, 20);

        jTextId.setEnabled(false);
        getContentPane().add(jTextId);
        jTextId.setBounds(10, 80, 50, 20);
        getContentPane().add(jTextNome);
        jTextNome.setBounds(220, 80, 250, 20);
        getContentPane().add(jTextCpf);
        jTextCpf.setBounds(10, 150, 170, 20);

        jTextTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTelefone);
        jTextTelefone.setBounds(270, 150, 140, 20);
        getContentPane().add(jTextEmail);
        jTextEmail.setBounds(10, 210, 210, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cpf", "Telefone", "E-mail", "Limite de Credito"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 610, 150);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(530, 110, 70, 30);

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInserir);
        jButtonInserir.setBounds(530, 20, 70, 30);

        jButtonAlterar.setText("Alterar");
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(530, 50, 70, 30);

        jButtonDeletar.setText("Deletar");
        getContentPane().add(jButtonDeletar);
        jButtonDeletar.setBounds(530, 80, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefoneActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        String nome = jTextNome.getText();
        String cpf = jTextCpf.getText();
        String telefone = jTextTelefone.getText();
        String email = jTextEmail.getText();
        String limite_credito = jTextLimiteCredito.getText();
        clientes c = new clientes();
        c.setNome(nome);
        c.setCpf(cpf);
        c.setTelefone(telefone);
        c.setEmail(email);
        c.setLimite_credito(TOP_ALIGNMENT);
        
        
    }//GEN-LAST:event_jButtonInserirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCpf;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextLimiteCredito;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
