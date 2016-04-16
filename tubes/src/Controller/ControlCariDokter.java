/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.caridokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlCariDokter implements ActionListener {
    private caridokter cariDokter;
    
    public ControlCariDokter() {
        cariDokter = new caridokter();
        cariDokter.setVisible(true);
        cariDokter.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariDokter.getCari()) {
            int id = Integer.parseInt(cariDokter.getId().getText());
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            cariDokter.dispose();
        } else if (event == cariDokter.getKembali()) {
            new ControlCariData();
            cariDokter.dispose();
        }
    }

}
