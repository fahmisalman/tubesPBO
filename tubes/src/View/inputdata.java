/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
/**
 *
 * @author Meidiana Dwi P
 */
public class inputdata extends javax.swing.JFrame {

    /**
     * Creates new form inputdata
     */
    public inputdata() {
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
        inputDokter = new javax.swing.JButton();
        inputPasien = new javax.swing.JButton();
        inputRuangan = new javax.swing.JButton();
        inputPasienInap = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input Data");

        inputDokter.setText("Input data dokter");
        inputDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDokterActionPerformed(evt);
            }
        });

        inputPasien.setText("Input data pasien");

        inputRuangan.setText("Input data ruangan");

        inputPasienInap.setText("Input data pasien inap");

        kembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputPasienInap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputDokter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembali)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(inputDokter)
                .addGap(18, 18, 18)
                .addComponent(inputPasien)
                .addGap(18, 18, 18)
                .addComponent(inputRuangan)
                .addGap(18, 18, 18)
                .addComponent(inputPasienInap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(kembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDokterActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inputDokter;
    private javax.swing.JButton inputPasien;
    private javax.swing.JButton inputPasienInap;
    private javax.swing.JButton inputRuangan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kembali;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the inputDokter
     */
    public javax.swing.JButton getInputDokter() {
        return inputDokter;
    }

    /**
     * @param inputDokter the inputDokter to set
     */
    public void setInputDokter(javax.swing.JButton inputDokter) {
        this.inputDokter = inputDokter;
    }

    /**
     * @return the inputPasien
     */
    public javax.swing.JButton getInputPasien() {
        return inputPasien;
    }

    /**
     * @param inputPasien the inputPasien to set
     */
    public void setInputPasien(javax.swing.JButton inputPasien) {
        this.inputPasien = inputPasien;
    }

    /**
     * @return the inputPasienInap
     */
    public javax.swing.JButton getInputPasienInap() {
        return inputPasienInap;
    }

    /**
     * @param inputPasienInap the inputPasienInap to set
     */
    public void setInputPasienInap(javax.swing.JButton inputPasienInap) {
        this.inputPasienInap = inputPasienInap;
    }

    /**
     * @return the inputRuangan
     */
    public javax.swing.JButton getInputRuangan() {
        return inputRuangan;
    }

    /**
     * @param inputRuangan the inputRuangan to set
     */
    public void setInputRuangan(javax.swing.JButton inputRuangan) {
        this.inputRuangan = inputRuangan;
    }
    
    public void addListener(ActionListener al) {
        inputDokter.addActionListener(al);
        inputPasien.addActionListener(al);
        inputPasienInap.addActionListener(al);
        inputRuangan.addActionListener(al);
        kembali.addActionListener(al);
    }

    /**
     * @return the kembali
     */
    public javax.swing.JButton getKembali() {
        return kembali;
    }
}
