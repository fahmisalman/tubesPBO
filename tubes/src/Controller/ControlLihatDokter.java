/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.lihatdokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatDokter implements ActionListener {

    private lihatdokter lihatDokter;
    
    public ControlLihatDokter() {
        lihatDokter = new lihatdokter();
        lihatDokter.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        lihatDokter.getOutput().setText("coba-coba");
    }
    
}
