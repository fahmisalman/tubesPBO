/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import View.caridokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlCariDokter implements ActionListener {

    private caridokter cariDokter;
    private Dokter d;

    public ControlCariDokter() {
        cariDokter = new caridokter();
        cariDokter.setVisible(true);
        cariDokter.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariDokter.getCari()) {
            try {
                int id = Integer.parseInt(cariDokter.getId().getText());
                d = new Dokter(id, null);
                if (d.getDokter(id) != null) {
                    JOptionPane.showConfirmDialog(null, "Nama dokter : " + d.getDokter(id).getNama(), "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    new ControlMenu();
                    cariDokter.dispose();
                } else {
                    JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    cariDokter.dispose();
                    new ControlCariDokter();
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Inputan salah", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                cariDokter.dispose();
                new ControlCariDokter();
            }
        } else if (event == cariDokter.getKembali()) {
            new ControlCariData();
            cariDokter.dispose();
        }
    }

}
