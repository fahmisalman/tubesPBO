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
public class Utama extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public Utama() {
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
        input = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        lihat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Main Menu");

        input.setText("Input Data");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        hapus.setText("Hapus Data");

        cari.setText("Cari Data");

        lihat.setText("Lihat Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lihat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(input)
                .addGap(18, 18, 18)
                .addComponent(hapus)
                .addGap(18, 18, 18)
                .addComponent(cari)
                .addGap(18, 18, 18)
                .addComponent(lihat)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JButton input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lihat;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cari
     */
    public javax.swing.JButton getCari() {
        return cari;
    }

    /**
     * @param cari the cari to set
     */
    public void setCari(javax.swing.JButton cari) {
        this.cari = cari;
    }

    /**
     * @return the hapus
     */
    public javax.swing.JButton getHapus() {
        return hapus;
    }

    /**
     * @param hapus the hapus to set
     */
    public void setHapus(javax.swing.JButton hapus) {
        this.hapus = hapus;
    }

    /**
     * @return the input
     */
    public javax.swing.JButton getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(javax.swing.JButton input) {
        this.input = input;
    }

    /**
     * @return the lihat
     */
    public javax.swing.JButton getLihat() {
        return lihat;
    }

    /**
     * @param lihat the lihat to set
     */
    public void setLihat(javax.swing.JButton lihat) {
        this.lihat = lihat;
    }
    
    public void addListener(ActionListener al) {
        input.addActionListener(al);
        hapus.addActionListener(al);
        cari.addActionListener(al);
        lihat.addActionListener(al);
    }
}