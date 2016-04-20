/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PasienInap;
import View.inputpasieninap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputPasienInap implements ActionListener {

    private inputpasieninap inputInap;
    private PasienInap inap;

    public ControlInputPasienInap() {
        inputInap = new inputpasieninap();
        inputInap.setVisible(true);
        inputInap.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == inputInap.getSimpan()) {
            int idPi = Integer.parseInt(inputInap.getIdPi().getText());
            int no = Integer.parseInt(inputInap.getNo().getText());
            int idD = Integer.parseInt(inputInap.getIdDokter().getText());
            int idP = Integer.parseInt(inputInap.getIdPasien().getText());
            try {
                inap = new PasienInap();
                inap.saveInap(idPi, idD, idP, no);
                JOptionPane.showConfirmDialog(null, "Input data berhasil", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                inputInap.dispose();
                new ControlMenu();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat memasukan data ke database", "Error", JOptionPane.ERROR_MESSAGE);
                inputInap.dispose();
                new ControlInputPasienInap();
            }
        } else if (event == inputInap.getKembali()) {
            new ControlInputData();
            inputInap.dispose();
        }

    }
}
