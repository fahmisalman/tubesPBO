/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Diagnosa;
import View.LihatInap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author FahmiSalman
 */
public class ControlLihatInap implements ActionListener {

    private LihatInap lihatInap;
    private Diagnosa diagnosa;
    
    public ControlLihatInap(int id) throws SQLException {
        lihatInap = new LihatInap();
        lihatInap.setVisible(true);
        lihatInap.addListener(this);
        diagnosa = new Diagnosa();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (diagnosa.getDiagnosa(i) != null && diagnosa.getDiagnosa(i).getIdPasienInap() == id) {
                lihatInap.getTabel().setValueAt(diagnosa.getDiagnosa(i).getIdx(), count, 0);
                lihatInap.getTabel().setValueAt(diagnosa.getDiagnosa(i).getDiagnosa(), count, 1);
                count++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == lihatInap.getHome()) {
            new ControlMenu();
            lihatInap.dispose();
        }
    }
}
