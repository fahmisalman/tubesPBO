/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pasien;
import View.inputpasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputPasien implements ActionListener{
    private inputpasien inputPasien;
    
    public ControlInputPasien() {
        inputPasien = new inputpasien();
        inputPasien.setVisible(true);
        inputPasien.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == inputPasien.getSimpan()) {
            int id = Integer.parseInt(inputPasien.getId().getText());
            String nama = inputPasien.getNama().getText();
            Pasien p = new Pasien(id, nama);
            System.out.println(p.getId());
            System.out.println(p.getNama());
            inputPasien.dispose();
            new ControlMenu();
        } else if (event == inputPasien.getKembali()) {
            new ControlInputData();
            inputPasien.dispose();
        }
    }
}
