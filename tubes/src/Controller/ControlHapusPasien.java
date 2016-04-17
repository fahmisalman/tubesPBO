/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pasien;
import View.hapuspasien;
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
public class ControlHapusPasien implements ActionListener{
    private hapuspasien hapusPasien;
    private Pasien p;
    
    public ControlHapusPasien() {
        hapusPasien = new hapuspasien();
        hapusPasien.setVisible(true);
        hapusPasien.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusPasien.getHapus()) {
            int id = Integer.parseInt(hapusPasien.getId().getText());
            try {
                p = new Pasien(id, null);
                p.deletePasien(id);
                JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new ControlMenu();
                hapusPasien.dispose();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                hapusPasien.dispose();
                new ControlHapusPasien();
            }
            
        }
    }
}
