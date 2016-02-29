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
    private String nama;
    private int jmlPasien;
    private PasienInap[] daftarPasien;
    
    public Ruangan(String nama, int max) {
        this.nama = nama;
        daftarPasien = new PasienInap[max];
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
    
}
