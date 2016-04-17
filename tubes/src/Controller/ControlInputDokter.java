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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlInputDokter implements ActionListener {

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
            try {
                Dokter d = new Dokter(id, nama);
                d.saveDokter();
                JOptionPane.showConfirmDialog(null, "Input data berhasil", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                inputDokter.dispose();
                new ControlMenu();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat memasukan data ke database", "Error", JOptionPane.ERROR_MESSAGE);
                inputDokter.dispose();
                new ControlInputDokter();
            }
        } else if (event == inputDokter.getKembali()) {
            new ControlInputData();
            inputDokter.dispose();
        }
    }
}
