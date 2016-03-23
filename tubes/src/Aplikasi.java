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

    private Dokter[] daftarDokter;
    private Pasien[] daftarPasien;
    private Ruangan[] daftarRuangan;
    int jmlDokter;
    int jmlPasien;
    int jmlRuangan;

    public Aplikasi() {
        daftarDokter = new Dokter[100];
        daftarPasien = new Pasien[100];
        daftarRuangan = new Ruangan[100];
    }

    public void addDokter(Dokter dokter) {
        if (jmlDokter <= daftarDokter.length) {
            daftarDokter[jmlDokter] = dokter;
            jmlDokter++;
        }
    }

    public void addPasien(Pasien pasien) {
        if (jmlPasien <= daftarPasien.length) {
            daftarPasien[jmlPasien] = pasien;
            jmlPasien++;
        }
    }

    public void addRuangan(Ruangan ruangan) {
        if (jmlRuangan <= daftarRuangan.length) {
            daftarRuangan[jmlRuangan] = ruangan;
            jmlRuangan++;
        }
    }

    public Dokter getDokter(int id) {
        int i;
        for (i = 0; i < jmlDokter; i++) {
            if (daftarDokter[i].getId() == id) {
                break;
            }
        }
        return daftarDokter[i];
    }

    public Pasien getPasien(int id) {
        int i;
        for (i = 0; i < jmlPasien; i++) {
            if (daftarPasien[i].getId() == id) {
                break;
            }
        }
        return daftarPasien[i];
    }

    public Ruangan getRuangan(int no) {
        int i;
        for (i = 0; i < jmlRuangan; i++) {
            if (daftarRuangan[i].getNoRuang() == no) {
                break;
            }
        }
        return daftarRuangan[i];
    }

    public void deletePasien(int id) {
        int i;
        for (i = 0; i < jmlPasien; i++) {
            if (daftarPasien[i].getId() == id) {
                break;
            }
        }
        int j;
        for (j = i; j < jmlPasien; j++) {
            daftarPasien[j] = daftarPasien[j + 1];
            j++;
        }
        jmlPasien--;
    }

    public void deleteDokter(int id) {
        int i;
        for (i = 0; i < jmlDokter; i++) {
            if (daftarDokter[i].getId() == id) {
                break;
            }
        }
        int j;
        for (j = i; j < jmlDokter; j++) {
            daftarDokter[j] = daftarDokter[j + 1];
            j++;
        }
        jmlDokter--;
    }

    public void deleteRuangan(int no) {
        int i;
        for (i = 0; i < jmlRuangan; i++) {
            if (daftarRuangan[i].getNoRuang() == no) {
                break;
            }
        }
        int j;
        for (j = i; j < jmlRuangan; j++) {
            daftarRuangan[j] = daftarRuangan[j + 1];
            j++;
        }
        jmlRuangan--;
    }

}
