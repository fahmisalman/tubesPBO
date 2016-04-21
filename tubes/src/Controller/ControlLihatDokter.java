/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import View.lihatdokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatDokter implements ActionListener {

    private lihatdokter lihatDokter;
    private Dokter dokter;

    public ControlLihatDokter() throws SQLException {
        lihatDokter = new lihatdokter();
        lihatDokter.setVisible(true);
        lihatDokter.addListener(this);
        dokter = new Dokter(0, null);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (dokter.getDokter(i) != null) {
                lihatDokter.getTable().setValueAt(dokter.getDokter(i).getId(), count, 0);
                lihatDokter.getTable().setValueAt(dokter.getDokter(i).getNama(), count, 1);
                count++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();

        if (event == lihatDokter.getHome()) {
            new ControlMenu();
            lihatDokter.dispose();
        }
    }

}
