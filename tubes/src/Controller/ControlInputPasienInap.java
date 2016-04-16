/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PasienInap;
import Model.Ruangan;
import View.inputpasieninap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputPasienInap implements ActionListener{
    private inputpasieninap inputInap;
    
    public ControlInputPasienInap() {
        inputInap = new inputpasieninap();
        inputInap.setVisible(true);
        inputInap.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == inputInap.getSimpan()) {
            int no = Integer.parseInt(inputInap.getNo().getText());
            int idD = Integer.parseInt(inputInap.getIdDokter().getText());
            int idP = Integer.parseInt(inputInap.getIdPasien().getText());
            System.out.println(no);
            System.out.println(idP);
            System.out.println(idD);
//            PasienInap pi = new PasienInap(pasien, dokter);
            new ControlMenu();
            inputInap.dispose();
        } else if (event == inputInap.getKembali()) {
            new ControlInputData();
            inputInap.dispose();
        }
        
    }
}
