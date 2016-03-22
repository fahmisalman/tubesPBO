/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FahmiSalman
 */
public class Aplikasi {
    Dokter[] daftarDokter;
    Pasien[] daftarPasien;
    Ruangan[] daftarRuangan;
    int jmlDokter;
    int jmlPasien;
    int jmlRuangan;
    
    public Aplikasi() {
        daftarDokter = new Dokter[100];
        daftarPasien = new Pasien[100];
        daftarRuangan = new Ruangan[100];
    }
    
    public void addDokter (Dokter dokter) {
        if (jmlDokter <= daftarDokter.length) {
            daftarDokter[jmlDokter] = dokter;
            jmlDokter++;
        }
    }
    
    public void addPasien (Pasien pasien) {
        if (jmlPasien <= daftarPasien.length) {
            daftarPasien[jmlPasien] = pasien;
            jmlPasien++;
        }
    }
    
    public void addRuangan (Ruangan ruangan) {
        if (jmlRuangan <= daftarRuangan.length) {
            daftarRuangan[jmlRuangan] = ruangan;
            jmlRuangan++;
        }
    }
    
}
