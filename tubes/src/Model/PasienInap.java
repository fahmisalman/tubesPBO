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
public class PasienInap {

    private Pasien pasien;
    private Dokter dokter;
    private String[] diagnosa = new String[10];
    private int jmlDiagnosa;
    private Connection conn;
    private Statement stat;
    private String query;

    public PasienInap(Pasien pasien, Dokter dokter) throws SQLException {
        this.pasien = pasien;
        this.dokter = dokter;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    }
    
    public PasienInap() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    };

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void addDiagnosa(String diagnosa) {
        if (getJmlDiagnosa() <= diagnosa.length()) {
            this.diagnosa[getJmlDiagnosa()] = diagnosa;
            jmlDiagnosa++;
        }
    }

    public int getJmlDiagnosa() {
        return jmlDiagnosa;
    }

    public String getDiagnosa(int i) {
        return diagnosa[i];
    }

    public void deleteDiagnosa(int i) {
        int j;
        for (j = i; j < jmlDiagnosa; j++) {
            diagnosa[j] = diagnosa[j + 1];
            System.out.println(j);
        }
        jmlDiagnosa--;
    }
    
    public void saveInap(int idPasienInap, int idDokter, int idPasien, int noRuang) throws SQLException{
        query = "insert into pasieninap values ('" + idPasienInap + "','" + idDokter + "','" + idPasien + "','" + noRuang + "')";
        stat.execute(query);
    }
    
    public void deleteInap(int id) throws SQLException {
        query = "delete from pasieninap where idPasienInap = '" + id + "'";
        stat.execute(query);
    }
    
    public Ruangan getInap(int id) throws SQLException {
        query = "Select * from pasieninap where idPasienInap = '" + id + "'";
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

}
