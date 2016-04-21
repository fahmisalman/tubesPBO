/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Diagnosa;
import View.InputDiagnosa;
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
public class ControlInputDiagnosa implements ActionListener{

    private InputDiagnosa inputDiagnosa;
    private Diagnosa diagnosa;

    public ControlInputDiagnosa() {
        inputDiagnosa = new InputDiagnosa();
        inputDiagnosa.setVisible(true);
        inputDiagnosa.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if(event == inputDiagnosa.getSimpan()) {
            int id = Integer.parseInt(inputDiagnosa.getId().getText());
            String nama = inputDiagnosa.getDiagnosa().getText();
            try {
                diagnosa = new Diagnosa();
                diagnosa.setIdPasienInap(id);
                diagnosa.setDiagnosa(nama);
                diagnosa.saveDiagnosa();
                JOptionPane.showConfirmDialog(null, "Input data berhasil", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                inputDiagnosa.dispose();
                new ControlMenu();
            } catch (SQLException ex) {
                Logger.getLogger(ControlInputDiagnosa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
