/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.cariruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlCariRuangan implements ActionListener{
    private cariruangan cariRuangan;
    
    public ControlCariRuangan() {
        cariRuangan = new cariruangan();
        cariRuangan.setVisible(true);
        cariRuangan.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariRuangan.getCari()) {
            int id = Integer.parseInt(cariRuangan.getNo().getText());
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            cariRuangan.dispose();
        } else if (event == cariRuangan.getKembali()) {
            new ControlCariData();
            cariRuangan.dispose();
        }
    }
}
