/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import View.hapusdokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusDokter implements ActionListener{
    private hapusdokter hapusDokter;
    private Dokter d;
    
    public ControlHapusDokter() {
        hapusDokter = new hapusdokter();
        hapusDokter.setVisible(true);
        hapusDokter.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusDokter.getHapus()) {
            int id = Integer.parseInt(hapusDokter.getId().getText());
            try {
                d = new Dokter(id, null);
                d.deleteDokter(id);
                JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new ControlMenu();
                hapusDokter.dispose();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                hapusDokter.dispose();
                new ControlHapusDokter();
            }
        } else if (event == hapusDokter.getKembali()) {
            hapusDokter.dispose();
            new ControlHapusData();
        }
    }
}
