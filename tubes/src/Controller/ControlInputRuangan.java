/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ruangan;
import View.inputruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputRuangan implements ActionListener{
    private inputruangan inputRuangan;
    
    public ControlInputRuangan() {
        inputRuangan = new inputruangan();
        inputRuangan.setVisible(true);
        inputRuangan.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == inputRuangan.getSimpan()) {
            int id = Integer.parseInt(inputRuangan.getNo().getText());
            String nama = inputRuangan.getNama().getText();
            int maks = Integer.parseInt(inputRuangan.getMaks().getText());
            Ruangan r = new Ruangan(id, nama, maks);
            System.out.println(r.getNoRuang());
            System.out.println(r.getNama());
            inputRuangan.dispose();
            new ControlMenu();
        }
        if (event == inputRuangan.getKembali()) {
            new ControlInputData();
            inputRuangan.dispose();
        }
    }
}
