/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ruangan;
import View.cariruangan;
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
public class ControlCariRuangan implements ActionListener {

    private cariruangan cariRuangan;
    private Ruangan r;

    public ControlCariRuangan() {
        cariRuangan = new cariruangan();
        cariRuangan.setVisible(true);
        cariRuangan.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariRuangan.getCari()) {
            int no = Integer.parseInt(cariRuangan.getNo().getText());
            try {
                r = new Ruangan();
                if (r.getRuangan(no) != null) {
                    JOptionPane.showConfirmDialog(null, "Nama ruangan : " + r.getRuangan(no).getNama() + "\nMaks Pasien : " + r.getRuangan(no).getMaks(), "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    new ControlMenu();
                    cariRuangan.dispose();
                } else {
                    JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    cariRuangan.dispose();
                    new ControlCariRuangan();
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Inputan salah", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                cariRuangan.dispose();
                new ControlCariRuangan();
            }
        } else if (event == cariRuangan.getKembali()) {
            new ControlCariData();
            cariRuangan.dispose();
        }
    }
}
