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
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
            Ruangan r;
            try {
                r = new Ruangan(id, nama, maks);
                r.saveRuangan();
                JOptionPane.showConfirmDialog(null, "Input data berhasil", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                inputRuangan.dispose();
                new ControlMenu();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Tidak dapat memasukan data ke database", "Error", JOptionPane.ERROR_MESSAGE);
                inputRuangan.dispose();
                new ControlInputRuangan();
            }
        }
        if (event == inputRuangan.getKembali()) {
            new ControlInputData();
            inputRuangan.dispose();
        }
    }
}
