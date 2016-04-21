/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pasien;
import View.lihatpasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatPasien implements ActionListener{
    
    private lihatpasien lihatPasien;
    private Pasien pasien;
    
    public ControlLihatPasien() throws SQLException {
        lihatPasien = new lihatpasien();
        lihatPasien.setVisible(true);
        lihatPasien.addListener(this);
        pasien = new Pasien(0, null);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (pasien.getPasien(i) != null) {
                lihatPasien.getTable().setValueAt(pasien.getPasien(i).getId(), count, 0);
                lihatPasien.getTable().setValueAt(pasien.getPasien(i).getNama(), count, 1);
                count++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        
        if (event == lihatPasien.getHome()) {
            new ControlMenu();
            lihatPasien.dispose();
        }
    }
    
}
