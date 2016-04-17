/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ruangan;
import View.hapusruangan;
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
public class ControlHapusRuangan implements ActionListener {

    private hapusruangan hapusRuangan;
    private Ruangan r;

    public ControlHapusRuangan() {
        hapusRuangan = new hapusruangan();
        hapusRuangan.setVisible(true);
        hapusRuangan.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusRuangan.getHapus()) {
            int no = Integer.parseInt(hapusRuangan.getNo().getText());
            try {
                r = new Ruangan();
                r.deleteRuangan(no);
                JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new ControlMenu();
                hapusRuangan.dispose();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                hapusRuangan.dispose();
                new ControlHapusRuangan();
            }
        } else if (event == hapusRuangan.getKembali()) {
            new ControlHapusData();
            hapusRuangan.dispose();
        }
    }
}
