/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.lihatpasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatPasien implements ActionListener{
    
    private lihatpasien lihatPasien;
    
    public ControlLihatPasien() {
        lihatPasien = new lihatpasien();
        lihatPasien.setVisible(true);
        lihatPasien.addListener(this);
        lihatPasien.getOutput().setText("tes");
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
