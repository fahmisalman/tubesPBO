/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
            new ControlHapusDokter();
            hapusData.dispose();
        } else if (event == hapusData.getHapusPasien()) {
            new ControlHapusPasien();
            hapusData.dispose();
        } else if (event == hapusData.getHapusInap()) {
            new ControlHapusInap();
            hapusData.dispose();
        } else if (event == hapusData.getHapusDiagnosa()) {
            hapusData.dispose();
        } else if (event == hapusData.getHapusRuangan()) {
            new ControlHapusRuangan();
            hapusData.dispose();
        } else if (event == hapusData.getKembali()) {
            new ControlMenu();
            hapusData.dispose();
        }
    }
}
