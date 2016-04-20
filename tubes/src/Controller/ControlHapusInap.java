/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PasienInap;
import View.hapuspinap;
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
public class ControlHapusInap implements ActionListener {

    private hapuspinap hapusInap;
    private PasienInap pasieninap;

    public ControlHapusInap() {
        hapusInap = new hapuspinap();
        hapusInap.setVisible(true);
        hapusInap.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusInap.getHapus()) {
            int id = Integer.parseInt(hapusInap.getIdx().getText());
            try {
                pasieninap = new PasienInap();
                pasieninap.deleteInap(id);
                JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new ControlMenu();
                hapusInap.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ControlHapusInap.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (event == hapusInap.getKembali()) {
            new ControlHapusData();
            hapusInap.dispose();
        }
    }
}
