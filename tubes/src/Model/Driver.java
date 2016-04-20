package Model;

import Controller.ControlMenu;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fahmi Salman N
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("org.gjt.mm.mysql.Driver");
//        Aplikasi aplikasi = new Aplikasi();
//        aplikasi.mainMenu();
        ControlMenu menu = new ControlMenu();

    }

}
