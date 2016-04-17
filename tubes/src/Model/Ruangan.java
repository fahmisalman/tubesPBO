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
public class Ruangan {

    private int noRuang;
    private String nama;
    private int jmlPasien;
    private PasienInap[] daftarPasien;
    private Connection conn;
    private Statement stat;
    private String query;

    public Ruangan() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    };
    
    public Ruangan(int no, String nama, int max) throws SQLException {
        noRuang = no;
        this.nama = nama;
        daftarPasien = new PasienInap[max];
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    }

    public String getNama() {
        return nama;
    }

    public void tambahPasien(Pasien pasien, Dokter dokter) {
        if (jmlPasien < this.daftarPasien.length) {
            this.daftarPasien[jmlPasien] = new PasienInap(pasien, dokter);
            jmlPasien++;
        }
    }

    public PasienInap getDaftarPasien(int i) {
        return daftarPasien[i];
    }

    public PasienInap getIdPasien(int id) {
        int i;
        for (i = 0; i < daftarPasien.length; i++) {
            if (daftarPasien[i].getPasien().getId() == id) {
                break;
            }
        }
        return daftarPasien[i];
    }

    public int getJmlPasien() {
        return jmlPasien;
    }

    public void removePasien(int i) {
        int j;
        for (j = i; j < jmlPasien; j++) {
            daftarPasien[j] = daftarPasien[j + 1];
        }
        jmlPasien--;
    }

    public int getNoRuang() {
        return noRuang;
    }
    
    public void saveRuangan() throws SQLException{
        query = "insert into ruangan values ('" + getNoRuang() + "','" + getNama() + "','" + getMaks() + "')";
        stat.execute(query);
    }
    
    public void deleteRuangan(int no) throws SQLException {
        query = "delete from ruangan where noRuang = '" + no + "'";
        stat.execute(query);
    }
    
    public Ruangan getRuangan(int no) throws SQLException {
        query = "Select * from ruangan where noRuang = '" + no + "'";
        ResultSet rs = stat.executeQuery(query);
        Ruangan r = null;
        if (rs.next()) {
            int noRuangan = rs.getInt("noRuang");
            String namaRuang = rs.getString("namaRuang");
            int maks = rs.getInt("maksPasien");
            r = new Ruangan(noRuangan, namaRuang, maks);
        }
        return r;
    }
    
    public int getMaks() {
        return daftarPasien.length;
    }

}
