/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.caripasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlCariPasien implements ActionListener{
    private caripasien cariPasien;
    
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
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            cariPasien.dispose();
        } else if (event == cariPasien.getKembali()) {
            new ControlCariData();
            cariPasien.dispose();
        }
    }

}
