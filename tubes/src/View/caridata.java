/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class caridata extends javax.swing.JFrame {

    /**
     * Creates new form caridata
     */
    public caridata() {
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
        cariDokter = new javax.swing.JButton();
        cariPasien = new javax.swing.JButton();
        cariRuangan = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        inap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cari Data");

        cariDokter.setText("Cari Data Dokter");

        cariPasien.setText("Cari Data Pasien");

        cariRuangan.setText("Cari Data Ruangan");

        kembali.setText("Kembali");

        inap.setText("Cari Data Pasien Inap");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cariRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cariPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cariDokter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(cariDokter)
                .addGap(18, 18, 18)
                .addComponent(cariPasien)
                .addGap(18, 18, 18)
                .addComponent(cariRuangan)
                .addGap(18, 18, 18)
                .addComponent(inap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(kembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariDokter;
    private javax.swing.JButton cariPasien;
    private javax.swing.JButton cariRuangan;
    private javax.swing.JButton inap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kembali;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cariDokter
     */
    public javax.swing.JButton getCariDokter() {
        return cariDokter;
    }

    /**
     * @param cariDokter the cariDokter to set
     */
    public void setCariDokter(javax.swing.JButton cariDokter) {
        this.cariDokter = cariDokter;
    }

    /**
     * @return the cariPasien
     */
    public javax.swing.JButton getCariPasien() {
        return cariPasien;
    }

    /**
     * @param cariPasien the cariPasien to set
     */
    public void setCariPasien(javax.swing.JButton cariPasien) {
        this.cariPasien = cariPasien;
    }

    /**
     * @return the cariRuangan
     */
    public javax.swing.JButton getCariRuangan() {
        return cariRuangan;
    }

    /**
     * @param cariRuangan the cariRuangan to set
     */
    public void setCariRuangan(javax.swing.JButton cariRuangan) {
        this.cariRuangan = cariRuangan;
    }

    /**
     * @return the kembali
     */
    public javax.swing.JButton getKembali() {
        return kembali;
    }

    /**
     * @param kembali the kembali to set
     */
    public void setKembali(javax.swing.JButton kembali) {
        this.kembali = kembali;
    }
    
    public void addListener(ActionListener al) {
        cariDokter.addActionListener(al);
        cariPasien.addActionListener(al);
        cariRuangan.addActionListener(al);
        kembali.addActionListener(al);
        inap.addActionListener(al);
    }

    /**
     * @return the inap
     */
    public javax.swing.JButton getInap() {
        return inap;
    }
    
}
