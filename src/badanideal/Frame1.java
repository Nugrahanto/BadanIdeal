/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badanideal;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Frame1 extends javax.swing.JFrame {

    String temp = "";
    Double ti, bt, hl;
    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etTinggi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etBerat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btHitung = new javax.swing.JButton();
        btCoba = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        beratIdeal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        saran = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 190, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 65, 100, 14);

        etNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNamaActionPerformed(evt);
            }
        });
        getContentPane().add(etNama);
        etNama.setBounds(210, 50, 160, 30);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 100, 90, 14);

        etTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTinggiActionPerformed(evt);
            }
        });
        getContentPane().add(etTinggi);
        etTinggi.setBounds(210, 90, 110, 30);

        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 140, 120, 14);
        getContentPane().add(etBerat);
        etBerat.setBounds(210, 130, 110, 30);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 170, 110, 20);

        btHitung.setBackground(new java.awt.Color(255, 204, 204));
        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btHitung);
        btHitung.setBounds(60, 230, 70, 23);

        btCoba.setBackground(new java.awt.Color(255, 204, 204));
        btCoba.setText("Coba Lagi");
        btCoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCobaActionPerformed(evt);
            }
        });
        getContentPane().add(btCoba);
        btCoba.setBounds(150, 230, 90, 23);

        btKeluar.setBackground(new java.awt.Color(255, 204, 204));
        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btKeluar);
        btKeluar.setBounds(260, 230, 70, 23);

        jLabel6.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 200, 14);
        getContentPane().add(beratIdeal);
        beratIdeal.setBounds(240, 270, 70, 30);

        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 280, 40, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Hasil Diagnosi Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 330, 200, 17);
        getContentPane().add(hasil);
        hasil.setBounds(50, 370, 320, 30);

        saran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saranActionPerformed(evt);
            }
        });
        getContentPane().add(saran);
        saran.setBounds(50, 410, 320, 30);

        jRadioButton1.setText("Perempuan");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(210, 170, 100, 23);

        jRadioButton2.setText("Laki - Laki");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(210, 190, 120, 23);

        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 100, 40, 14);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 140, 50, 14);

        setBounds(0, 0, 476, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void etNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNamaActionPerformed

    private void etTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTinggiActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        // TODO add your handling code here:
        if (etBerat.getText().equals("")||etTinggi.getText().equals("")
            ||etNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak Isian belum diisi");
        }
        else if(jRadioButton1.isSelected()||jRadioButton2.isSelected()){
            try{
                Proses();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Inputan ada yang salah");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Jenis Kelamin Harus Diisi");
        }
    }//GEN-LAST:event_btHitungActionPerformed

    private void btCobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCobaActionPerformed
        // TODO add your handling code here:
        etNama.setText("");
        etTinggi.setText("");
        etBerat.setText("");
        buttonGroup1.clearSelection();
        beratIdeal.setText("");
        hasil.setText("");
        saran.setText("");
    }//GEN-LAST:event_btCobaActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

    private void saranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saranActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratIdeal;
    private javax.swing.JButton btCoba;
    private javax.swing.JButton btHitung;
    private javax.swing.JButton btKeluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField etBerat;
    private javax.swing.JTextField etNama;
    private javax.swing.JTextField etTinggi;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField saran;
    // End of variables declaration//GEN-END:variables

    private void Proses() 
    {
        ti = Double.valueOf(etTinggi.getText());
        bt = Double.valueOf(etBerat.getText());
        
        if(jRadioButton1.isSelected()){
            hl = (ti - 100) * 1;
        }
        else if(jRadioButton2.isSelected()){
            hl = (ti - 104) * 1;
        }
        temp = Double.toString(hl.intValue());
        
        if(hl < bt){
            beratIdeal.setText(temp);
            hasil.setText("Maaf " + etNama.getText() + " , Sepertinya anda Overweight :( ");
            saran.setText("Banyaklah berolahraga dan hindari makanan berkolestelor");
        }else if (hl > bt){
            beratIdeal.setText(temp);
            hasil.setText("Maaf " + etNama.getText() + " , Sepertinya anda Underweight :( ");
            saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        }else{
            beratIdeal.setText(temp);
            hasil.setText("Hallo " + etNama.getText() + " , Berat badan anda sdah ideal :) ");
            saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat :)");
        }        
    }
}
