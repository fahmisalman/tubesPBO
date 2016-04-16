/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.lihatdata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatData implements ActionListener{
    
    private lihatdata lihatData;
    
    public ControlLihatData() {
        lihatData = new lihatdata();
        lihatData.setVisible(true);
        lihatData.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == lihatData.getLihatDokter()) {
            lihatData.dispose();
        } else if (event == lihatData.getLihatPasien()) {
            lihatData.dispose();
        } else if (event == lihatData.getLihatRuangan()) {
            lihatData.dispose();
        } else if (event == lihatData.getKembali()) {
            new ControlMenu();
            lihatData.dispose();
        }
    }
    
}
