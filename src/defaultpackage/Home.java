/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Galbie
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form BankRuptHome
     */
    public Home() {
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
        jLabel5 = new javax.swing.JLabel();
        saldo = new javax.swing.JButton();
        penarikan = new javax.swing.JButton();
        setor = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        inputPenarikan = new javax.swing.JTextField();
        inputSetor = new javax.swing.JTextField();
        keterangan = new javax.swing.JLabel();
        nilai = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("SELAMAT DATANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 169, 22);

        jLabel2.setFont(new java.awt.Font("Square721 Cn BT", 0, 14)); // NOI18N
        jLabel2.setText("Anjungan Tunai Mandiri");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 40, 150, 17);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setText("BNI SYARIAH MALANG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 60, 141, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("MENU");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 100, 54, 22);

        saldo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        saldo.setText("SALDO");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(110, 140, 103, 32);

        penarikan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        penarikan.setText("PENARIKAN");
        penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikanActionPerformed(evt);
            }
        });
        getContentPane().add(penarikan);
        penarikan.setBounds(40, 200, 103, 32);

        setor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        setor.setText("SETOR");
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });
        getContentPane().add(setor);
        setor.setBounds(40, 250, 103, 32);

        logOut.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        logOut.setText("Keluar");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut);
        logOut.setBounds(120, 430, 69, 23);
        getContentPane().add(inputPenarikan);
        inputPenarikan.setBounds(160, 200, 103, 30);
        getContentPane().add(inputSetor);
        inputSetor.setBounds(160, 250, 103, 30);

        keterangan.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        getContentPane().add(keterangan);
        keterangan.setBounds(60, 390, 220, 30);

        nilai.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(nilai);
        nilai.setBounds(120, 350, 130, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("PETUNJUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 290, 110, 30);

        setBounds(0, 0, 342, 534);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
    this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        
        int saldo = 50000;
        keterangan.setText("SISA SALDO YANG ANDA MILIKI");
        nilai.setText(""+saldo);
    }//GEN-LAST:event_saldoActionPerformed

    private void penarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikanActionPerformed
        String tarikan = inputPenarikan.getText();
            int saldo = 50000;
            int jmltarik = Integer.parseInt(tarikan);
            String saldolast = nilai.getText();
            int lastsaldo = Integer.parseInt(saldolast);
            int sld = lastsaldo -jmltarik ;
          
        
        if(jmltarik < 50000){
        JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin\n Silahkan ulangi lagi","Transaksi Gagal",0);
        }else if(sld < 0)
        JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp 50000,00, Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
        
        int total = saldo-jmltarik; 
        nilai.setText(""+total);
    }//GEN-LAST:event_penarikanActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        String setor = inputSetor.getText();
        String saldolast = nilai.getText();
        nilai.setText(""+saldolast);
        int jmlsetor = Integer.parseInt(setor);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo+jmlsetor;
        nilai.setText(""+total);

         if(jmlsetor % 100 != 0){
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin\n Silahkan ulangi kembali!","Transaksi Gagal",0);
          }
         else if(jmlsetor <50000)
        JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah RP 50000,00", "ERROR", 0);
    }//GEN-LAST:event_setorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Cara Penggunaan Aplikasi \n[1] "
                                    + "Masukkan PIN dengan benar \n [2] Bertransaksilah"
                                    + "dengan benar sesuai pilihan \n[3] Gunakan Uang sesuai kebutuhan"
                                    + "dan rajinlah menabung \n","INFO",1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputPenarikan;
    private javax.swing.JTextField inputSetor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel keterangan;
    private javax.swing.JButton logOut;
    private javax.swing.JLabel nilai;
    private javax.swing.JButton penarikan;
    private javax.swing.JButton saldo;
    private javax.swing.JButton setor;
    // End of variables declaration//GEN-END:variables
}
