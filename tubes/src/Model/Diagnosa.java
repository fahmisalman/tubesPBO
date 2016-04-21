/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FahmiSalman
 */
public class Diagnosa {
    private int idx;
    private int idPasienInap;
    private String diagnosa;
    private Connection conn;
    private Statement stat;
    private String query;
    
    public Diagnosa() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    }
    
    public Diagnosa(int id, int idPasienInap, String diagnosa) throws SQLException {
        idx = id;
        this.idPasienInap = idPasienInap;
        this.diagnosa = diagnosa;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
        stat = conn.createStatement();
    }

    public int getIdPasienInap() {
        return idPasienInap;
    }

    public void setIdPasienInap(int id) {
        this.idPasienInap = id;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }
    
    public void saveDiagnosa() throws SQLException{
        query = "insert into diagnosa (idPasienInap, namaDiagnosa) values ('" + getIdPasienInap()+ "','" + getDiagnosa()+ "')";
        stat.execute(query);
    }
    
    public void deleteDiagnosa(int id) throws SQLException {
        query = "delete from diagnosa where idx = '" + id + "'    ";
        stat.execute(query);
    }
    
    public Diagnosa getDiagnosa(int id) throws SQLException {
        query = "Select * from diagnosa where idx = '" + id + "'";
        ResultSet rs = stat.executeQuery(query);
        Diagnosa d = null;
        if (rs.next()) {
            int idD = rs.getInt("idx");
            String diag = rs.getString("namaDiagnosa");
            int idP = rs.getInt("idPasienInap");
            d = new Diagnosa(idD, idP, diag);
        }
        return d;
    }
    
    public Diagnosa getPasienInap(int id) throws SQLException {
        query = "Select * from diagnosa where idPasienInap = '" + id + "'";
        ResultSet rs = stat.executeQuery(query);
        Diagnosa d = null;
        if (rs.next()) {
            int idD = rs.getInt("idx");
            String diag = rs.getString("namaDiagnosa");
            int idP = rs.getInt("idPasienInap");
            d = new Diagnosa(idD, idP, diag);
        }
        return d;
    }
    
    public int getIdx() {
        return idx;
    }
    
}
