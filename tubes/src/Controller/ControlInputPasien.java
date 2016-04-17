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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputPasien implements ActionListener {

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
            try {
                Pasien p = new Pasien(id, nama);
                p.savePasien();
                JOptionPane.showConfirmDialog(null, "Input data berhasil", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                inputPasien.dispose();
                new ControlMenu();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat memasukan data ke database", "Error", JOptionPane.ERROR_MESSAGE);
                inputPasien.dispose();
                new ControlInputPasien();
            }
            
        } else if (event == inputPasien.getKembali()) {
            new ControlInputData();
            inputPasien.dispose();
        }
    }
}
