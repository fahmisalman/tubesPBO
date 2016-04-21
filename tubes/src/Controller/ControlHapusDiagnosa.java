/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Diagnosa;
import View.hapusdiagnosa;
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
public class ControlHapusDiagnosa implements ActionListener {

    private hapusdiagnosa hapusDiagnosa;
    private Diagnosa diagnosa;

    public ControlHapusDiagnosa() {
        hapusDiagnosa = new hapusdiagnosa();
        hapusDiagnosa.setVisible(true);
        hapusDiagnosa.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusDiagnosa.getHapus()) {
            int id = Integer.parseInt(hapusDiagnosa.getIdD().getText());
            try {
                diagnosa = new Diagnosa();
                diagnosa.deleteDiagnosa(id);
                JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new ControlMenu();
                hapusDiagnosa.dispose();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                hapusDiagnosa.dispose();
                new ControlHapusDiagnosa();
            }
        } else if(event == hapusDiagnosa.getKembali()) {
            new ControlHapusData();
            hapusDiagnosa.dispose();
        }
    }
}
