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
public class Dokter extends Orang{

    private int id;
    private Connection conn;
    private Statement stat;
    private String query;
    
    public Dokter(int id, String nama) throws SQLException {
        super(nama);
        this.id = id;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void saveDokter() throws SQLException{
        query = "insert into dokter values ('" + getId() + "','" + getNama() + "')";
        stat.execute(query);
    }
    
    public void deleteDokter(int id) throws SQLException {
        query = "delete from dokter where idDokter = '" + id + "'    ";
        stat.execute(query);
    }
    
    public Dokter getDokter(int id) throws SQLException {
        query = "Select * from dokter where idDokter = '" + id + "'";
        ResultSet rs = stat.executeQuery(query);
        Dokter d = null;
        if (rs.next()) {
            int idDokter = rs.getInt("idDokter");
            String nama = rs.getString("namaDokter");
            d = new Dokter(idDokter, nama);
        }
        return d;
    }
    
    @Override
    public String toString() {
        String x = "Id Dokter\t : " + this.getId() + 
                "\nNama Dokter\t : " + this.getNama();
        return x;
    }
    
}
