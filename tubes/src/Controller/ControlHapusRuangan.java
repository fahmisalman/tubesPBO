/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.hapusruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusRuangan implements ActionListener{
    private hapusruangan hapusRuangan;
    
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
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            hapusRuangan.dispose();
        } else if (event == hapusRuangan.getKembali()) {
            new ControlHapusData();
            hapusRuangan.dispose();
        }
    }
}
