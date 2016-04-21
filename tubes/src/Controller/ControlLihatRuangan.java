/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import Model.Pasien;
import Model.PasienInap;
import Model.Ruangan;
import View.lihatpasien;
import View.lihatruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatRuangan implements ActionListener{
    
    private lihatruangan lihatRuangan;
    private Ruangan ruangan;
    private PasienInap inap;
    private Dokter dokter;
    private Pasien pasien;
    
    public ControlLihatRuangan() throws SQLException {
        lihatRuangan = new lihatruangan();
        lihatRuangan.setVisible(true);
        lihatRuangan.addListener(this);
        ruangan = new Ruangan();
        inap = new PasienInap();
        dokter = new Dokter(0, null);
        pasien = new Pasien(0, null);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (inap.getInap(i) != null) {
                lihatRuangan.getTable().setValueAt(inap.getInap(i).getIdPasienInap(), count, 0);
                lihatRuangan.getTable().setValueAt(inap.getInap(i).getNamaPasien(), count, 1);
                lihatRuangan.getTable().setValueAt(inap.getInap(i).getNamaDokter(), count, 2);
                lihatRuangan.getTable().setValueAt(inap.getInap(i).getNamaRuang(), count, 3);
                count++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == lihatRuangan.getHome()) {
            new ControlMenu();
            lihatRuangan.dispose();
        }
    }
}
