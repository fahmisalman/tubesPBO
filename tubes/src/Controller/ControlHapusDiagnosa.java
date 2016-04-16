/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.hapusdiagnosa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusDiagnosa implements ActionListener{
    private hapusdiagnosa hapusDiagnosa;
    
    public ControlHapusDiagnosa() {
        hapusDiagnosa = new hapusdiagnosa();
        hapusDiagnosa.setVisible(true);
        hapusDiagnosa.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusDiagnosa.getHapus()) {
            int no = Integer.parseInt(hapusDiagnosa.getNo().getText());
            int idP = Integer.parseInt(hapusDiagnosa.getIdP().getText());
            int idD = Integer.parseInt(hapusDiagnosa.getIdD().getText());
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            hapusDiagnosa.dispose();
        }
    }
}
