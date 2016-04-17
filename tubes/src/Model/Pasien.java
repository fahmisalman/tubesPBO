package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahmi Salman N
 */
public class Pasien extends Orang{

    private int id;
    private Connection conn;
    private Statement stat;
    private String query;
    
    public Pasien(int id, String nama) throws SQLException {
        super(nama);
        this.id = id;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    }

    public int getId() {
        return id;
    }
    
    public void savePasien() throws SQLException{
        query = "insert into pasien values ('" + getId() + "','" + getNama() + "')";
        stat.execute(query);
    }
    
    public void deletePasien(int id) throws SQLException {
        query = "delete from pasien where idPasien = '" + id + "'    ";
        stat.execute(query);
    }
    
    public Pasien getPasien(int id) throws SQLException {
        query = "Select * from pasien where idPasien = '" + id + "'";
        ResultSet rs = stat.executeQuery(query);
        Pasien p = null;
        if (rs.next()) {
            int idPasien = rs.getInt("idPasien");
            String nama = rs.getString("namaPasien");
            p = new Pasien(idPasien, nama);
        }
        return p;
    }
    
    @Override
    public String toString() {
        String x = "Id Pasien\t : " + this.getId() + 
                "\nNama Pasien\t : " + this.getNama();
        return x;
    }
    
}
