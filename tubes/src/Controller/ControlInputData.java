/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Utama;
import View.inputdata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputData implements ActionListener{
    
    private inputdata inputData;

    public ControlInputData() {
        inputData = new inputdata();
        inputData.setVisible(true);
        inputData.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == inputData.getInputDokter()) {
            new ControlInputDokter();
            inputData.dispose();
        } else if (event == inputData.getInputPasien()) {
            new ControlInputPasien();
            inputData.dispose();
        } else if (event == inputData.getInputRuangan()) {
            new ControlInputRuangan();
            inputData.dispose();
        } else if (event == inputData.getInputPasienInap()) {
            new ControlInputPasienInap();
            inputData.dispose();
        } else if (event == inputData.getKembali()) {
            new ControlMenu();
            inputData.dispose();
        }
    }
    
}
