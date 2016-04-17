/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pasien;
import View.caripasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlCariPasien implements ActionListener {

    private caripasien cariPasien;
    private Pasien p;

    public ControlCariPasien() {
        cariPasien = new caripasien();
        cariPasien.setVisible(true);
        cariPasien.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariPasien.getCari()) {
            int id = Integer.parseInt(cariPasien.getId().getText());
            try {
                p = new Pasien(id, null);
                if (p.getPasien(id) != null) {
                    JOptionPane.showConfirmDialog(null, "Nama pasien : " + p.getPasien(id).getNama(), "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    new ControlMenu();
                    cariPasien.dispose();
                } else {
                    JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    cariPasien.dispose();
                    new ControlCariPasien();
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Inputan salah", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                cariPasien.dispose();
                new ControlCariPasien();
            }
        } else if (event == cariPasien.getKembali()) {
            new ControlCariData();
            cariPasien.dispose();
        }
    }

}
