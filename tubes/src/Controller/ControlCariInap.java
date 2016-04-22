/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Diagnosa;
import Model.PasienInap;
import View.CariInap;
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
public class ControlCariInap implements ActionListener{

    private CariInap cariInap;
    private PasienInap inap;
    
    public ControlCariInap() {
        cariInap = new CariInap();
        cariInap.setVisible(true);
        cariInap.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariInap.getCari()) {
            int id = Integer.parseInt(cariInap.getId().getText());
            try {
                inap = new PasienInap();
                if (inap.getInap(id) != null) {
                    new ControlLihatInap(id);
                    cariInap.dispose();
                } else {
                    JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    cariInap.dispose();
                    new ControlCariInap();
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Inputan salah", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                cariInap.dispose();
                new ControlCariInap();
            }
        } else if(event == cariInap.getKembali()) {
            cariInap.dispose();
            new ControlCariData();
        }
    }

}
