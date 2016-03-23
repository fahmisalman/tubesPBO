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

    public Ruangan(int no, String nama, int max) {
        noRuang = no;
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
            j++;
        }
        jmlPasien--;
    }

    public int getNoRuang() {
        return noRuang;
    }

}
