/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.hapusdokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusDokter implements ActionListener{
    private hapusdokter hapusDokter;
    
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
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            hapusDokter.dispose();
        }
    }
}
