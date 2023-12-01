/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mercubuanaoop;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macbookpro
 */
public class ATM extends javax.swing.JFrame {

    private String sql;
    private Connection connection;
    private Statement statement;
    private ResultSet hasil;
    private String namaNasabah;
    private Integer nomorRekening, sisaSaldo;

    /**
     * Creates new form ATM
     */
    public ATM() {
        initComponents();

        initDatabaseConnection();

        clearInputs();
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
        namaNasabahTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomorRekeningtextField = new javax.swing.JTextField();
        OkButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkSaldoButton = new javax.swing.JButton();
        checkSaldoTextField = new javax.swing.JTextField();
        setorTunaiButton = new javax.swing.JButton();
        setorTunaiTextField = new javax.swing.JTextField();
        tarikTunaiButton = new javax.swing.JButton();
        tarikTunaiTextField = new javax.swing.JTextField();
        selesaiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEM ATM");

        jLabel2.setText("Nama Nasabah");

        namaNasabahTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaNasabahTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Nomor Rekening");

        nomorRekeningtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorRekeningtextFieldActionPerformed(evt);
            }
        });

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        checkSaldoButton.setText("Check Saldo");
        checkSaldoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSaldoButtonActionPerformed(evt);
            }
        });

        setorTunaiButton.setText("Setor Tunai");
        setorTunaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorTunaiButtonActionPerformed(evt);
            }
        });

        tarikTunaiButton.setText("Tarik Tunai");
        tarikTunaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarikTunaiButtonActionPerformed(evt);
            }
        });

        selesaiButton.setText("Selesai");
        selesaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selesaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tarikTunaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(setorTunaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkSaldoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(checkSaldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(setorTunaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(tarikTunaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkSaldoButton)
                    .addComponent(checkSaldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setorTunaiButton)
                    .addComponent(setorTunaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tarikTunaiButton)
                    .addComponent(tarikTunaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(selesaiButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomorRekeningtextField)
                                    .addComponent(namaNasabahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(OkButton)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaNasabahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomorRekeningtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OkButton)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaNasabahTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaNasabahTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaNasabahTextFieldActionPerformed

    private void nomorRekeningtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorRekeningtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorRekeningtextFieldActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        // TODO add your handling code here:
        try {
            sql = "select nama, nomor_rekening, sisa_saldo from nasabah where nama ='" + namaNasabahTextField.getText().trim() + "' and nomor_rekening = '" + nomorRekeningtextField.getText().trim() + "';";
            hasil = statement.executeQuery(sql);
            System.out.println(sql);

            if (!hasil.next()) {
                throw new SQLException("Data is not exist");
            }

            namaNasabah = hasil.getString("nama");
            nomorRekening = hasil.getInt("nomor_rekening");
            sisaSaldo = hasil.getInt("sisa_saldo");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal save, " + e);
        }
    }//GEN-LAST:event_OkButtonActionPerformed

    private void tarikTunaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarikTunaiButtonActionPerformed
        try {
            sql = "select nama, nomor_rekening, sisa_saldo from nasabah where nama ='" + namaNasabahTextField.getText().trim() + "' and nomor_rekening = '" + nomorRekeningtextField.getText().trim() + "';";
            hasil = statement.executeQuery(sql);
            System.out.println(sql);

            if (!hasil.next()) {
                throw new SQLException("Data is not exist");
            }

            Integer total = sisaSaldo - Integer.valueOf(setorTunaiTextField.getText()) ;
            sql = "update nasabah set sisa_saldo = '" + total + "' where nama ='" + namaNasabah + "' and nomor_rekening = '" + nomorRekening + "';";
            statement.executeUpdate(sql);
            System.out.println(sql);
            checkSaldoTextField.setText(total.toString());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal save, " + e);
        }
    }//GEN-LAST:event_tarikTunaiButtonActionPerformed

    private void selesaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selesaiButtonActionPerformed

    private void checkSaldoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSaldoButtonActionPerformed
        checkSaldoTextField.setText(sisaSaldo.toString());
    }//GEN-LAST:event_checkSaldoButtonActionPerformed

    private void setorTunaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorTunaiButtonActionPerformed
        try {
            sql = "select nama, nomor_rekening, sisa_saldo from nasabah where nama ='" + namaNasabahTextField.getText().trim() + "' and nomor_rekening = '" + nomorRekeningtextField.getText().trim() + "';";
            hasil = statement.executeQuery(sql);
            System.out.println(sql);

            if (!hasil.next()) {
                throw new SQLException("Data is not exist");
            }

            Integer total = sisaSaldo + Integer.parseInt(setorTunaiTextField.getText()) ;
            sql = "update nasabah set sisa_saldo = '" + total + "' where nama ='" + namaNasabah + "' and nomor_rekening = '" + nomorRekening + "';";
            statement.executeUpdate(sql);
            System.out.println(sql);
            checkSaldoTextField.setText(total.toString());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal save, " + e);
        }
    }//GEN-LAST:event_setorTunaiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    private void initDatabaseConnection() {
        try {

            connection = ConnectionUtil.getDataSource().getConnection();
            statement = connection.createStatement();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void clearInputs() {
        namaNasabahTextField.setText("");
        nomorRekeningtextField.setText("");
        checkSaldoTextField.setText("");
        setorTunaiTextField.setText("");
        tarikTunaiTextField.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OkButton;
    private javax.swing.JButton checkSaldoButton;
    private javax.swing.JTextField checkSaldoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namaNasabahTextField;
    private javax.swing.JTextField nomorRekeningtextField;
    private javax.swing.JButton selesaiButton;
    private javax.swing.JButton setorTunaiButton;
    private javax.swing.JTextField setorTunaiTextField;
    private javax.swing.JButton tarikTunaiButton;
    private javax.swing.JTextField tarikTunaiTextField;
    // End of variables declaration//GEN-END:variables
}