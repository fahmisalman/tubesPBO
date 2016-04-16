/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.hapuspasien;
import View.hapuspinap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FahmiSalman
 */
public class ControlHapusInap implements ActionListener{
    private hapuspinap hapusInap;
    
    public ControlHapusInap() {
        hapusInap = new hapuspinap();
        hapusInap.setVisible(true);
        hapusInap.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object event = ae.getSource();
        if (event == hapusInap.getHapus()) {
            int no = Integer.parseInt(hapusInap.getNo().getText());
            int idx = Integer.parseInt(hapusInap.getIdx().getText());
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            hapusInap.dispose();
        } else if (event == hapusInap.getKembali()) {
            new ControlHapusData();
            hapusInap.dispose();
        }
    }
}
