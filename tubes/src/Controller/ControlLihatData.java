/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.lihatdata;
import View.lihatdokter;
import View.lihatpasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatData implements ActionListener{
    
    private lihatdata lihatData;
    private lihatdokter lihatDokter;
    private lihatpasien lihatPasien;
    
    public ControlLihatData() {
        lihatData = new lihatdata();
        lihatDokter = new lihatdokter();
        lihatPasien = new lihatpasien();
        lihatData.setVisible(true);
        lihatDokter.addListener(this);
        lihatPasien.addListener(this);
        lihatData.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == lihatData.getLihatDokter()) {
            try {
                new ControlLihatDokter();
            } catch (SQLException ex) {
                Logger.getLogger(ControlLihatData.class.getName()).log(Level.SEVERE, null, ex);
            }
            lihatData.dispose();
        } else if (event == lihatData.getLihatPasien()) {
            try {
                new ControlLihatPasien();
            } catch (SQLException ex) {
                Logger.getLogger(ControlLihatData.class.getName()).log(Level.SEVERE, null, ex);
            }
            lihatData.dispose();
        } else if (event == lihatData.getLihatRuangan()) {
            new ControlLihatRuangan();
            lihatData.dispose();
        } else if (event == lihatData.getKembali()) {
            new ControlMenu();
            lihatData.dispose();
        }
    }
    
}
