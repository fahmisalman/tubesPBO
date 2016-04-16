/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Utama;
import View.hapusdata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusData implements ActionListener{
    private hapusdata hapusData;

    public ControlHapusData() {
        hapusData = new hapusdata();
        hapusData.setVisible(true);
        hapusData.addListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusData.getHapusDokter()) {
            hapusData.dispose();
        } else if (event == hapusData.getHapusPasien()) {
            hapusData.dispose();
        } else if (event == hapusData.getHapusInap()) {
            hapusData.dispose();
        } else if (event == hapusData.getHapusDiagnosa()) {
            hapusData.dispose();
        } else if (event == hapusData.getHapusRuangan()) {
            hapusData.dispose();
        } else if (event == hapusData.getKembali()) {
            new ControlMenu();
            hapusData.dispose();
        }
    }
}
