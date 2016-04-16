/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dokter;
import View.inputdokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputDokter implements ActionListener{
    private inputdokter inputDokter;
    
    public ControlInputDokter() {
        inputDokter = new inputdokter();
        inputDokter.setVisible(true);
        inputDokter.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == inputDokter.getSimpan()) {
            int id = Integer.parseInt(inputDokter.getId().getText());
            String nama = inputDokter.getNama().getText();
            Dokter d = new Dokter(id, nama);
            inputDokter.dispose();
            new ControlMenu();
        } else if (event == inputDokter.getKembali()) {
            new ControlInputData();
            inputDokter.dispose();
        }
    }
}
