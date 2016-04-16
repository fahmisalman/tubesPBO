/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.lihatpasien;
import View.lihatruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatRuangan implements ActionListener{
    
    private lihatruangan lihatRuangan;
    
    public ControlLihatRuangan() {
        lihatRuangan = new lihatruangan();
        lihatRuangan.setVisible(true);
        lihatRuangan.addListener(this);
        lihatRuangan.getOutput().setText("tes");
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
