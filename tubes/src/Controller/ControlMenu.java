/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlMenu implements ActionListener{
    
    private Utama utama;
    
    public ControlMenu() {
        utama = new Utama();
        utama.setVisible(true);
        utama.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == utama.getInput()) {
            new ControlInputData();
            utama.dispose();
        } else if (event == utama.getHapus()) {
            new ControlHapusData();
            utama.dispose();
        } else if (event == utama.getCari()) {
            new ControlCariData();
            utama.dispose();
        } else if (event == utama.getLihat()) {
            new ControlLihatData();
            utama.dispose();
        }
    }
    
}
