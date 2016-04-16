/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.hapuspasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusPasien implements ActionListener{
    private hapuspasien hapusPasien;
    
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
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            hapusPasien.dispose();
        }
    }
}
