/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.caridata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlCariData implements ActionListener{
    private caridata cariData;
    
    public ControlCariData() {
        cariData = new caridata();
        cariData.setVisible(true);
        cariData.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == cariData.getCariDokter()) {
            new ControlCariDokter();
            cariData.dispose();
        } else if (event == cariData.getCariPasien()) {
            new ControlCariPasien();
            cariData.dispose();
        } else if (event == cariData.getCariRuangan()) {
            new ControlCariRuangan();
            cariData.dispose();
        } else if (event == cariData.getKembali()) {
            new ControlMenu();
            cariData.dispose();
        } else if (event == cariData.getInap()) {
            new ControlCariInap();
            cariData.dispose();
        }
    }
    
    
}
