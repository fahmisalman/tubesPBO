/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

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
    
    Scanner scan = new Scanner(System.in);

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

    public void menuInputDokter() {
        System.out.print("Id Dokter\t: "); int id = scan.nextInt();
        if (getDokter(id) == null){
            System.out.print("Nama Dokter\t: "); String nama = scan.next();
            Dokter d = new Dokter(id, nama);
            addDokter(d);
            System.out.println("Penginputan berhasil");
        }
        else {
            System.out.println("Id sudah ada");
        }
        
    }
    
    public void menuInputPasien() {
        System.out.print("Id Pasien\t: "); int id = scan.nextInt();
        if (getDokter(id) == null){
            System.out.print("Nama Dokter\t: "); String nama = scan.next();
            Pasien p = new Pasien(id, nama);
            addPasien(p);
        }
        else {
            System.out.println("Id sudah ada");
        }
    }
    
    public void menuInputRuangan() {
        int no = scan.nextInt();
        String nama = scan.next();
        int max = scan.nextInt();
        Ruangan r = new Ruangan(no, nama, max);
        addRuangan(r);
    }
    
    public void menuHapusDokter() {
        System.out.print("Id Dokter\t: "); int id = scan.nextInt();
        if (getDokter(id) != null) {
            deleteDokter(id);
            System.out.println("Penghapusan berhasil");
        }
        else {
            System.out.println("Penghapusan gagal");
        }
    }
    
    public void menuHapusPasien() {
        System.out.print("Id Pasien\t: "); int id = scan.nextInt();
        if (getPasien(id) != null) {
            deletePasien(id);
            System.out.println("Penghapusan berhasil");
        }
        else {
            System.out.println("Penghapusan gagal");
        }
    }
    
    public void menuHapusRuangan() {
        System.out.print("No Ruangan\t: "); int no = scan.nextInt();
        if (getRuangan(no) != null) {
            deleteRuangan(no);
            System.out.println("Penghapusan berhasil");
        }
        else {
            System.out.println("Penghapusan gagal");
        }
    }
    
    public void cariDokter() {
        System.out.print("Id Dokter\t: "); int id = scan.nextInt();
        if (getDokter(id) != null) {
            System.out.println("Id Dokter\t: " + getDokter(id).getId());
            System.out.println("Nama Dokter\t: " + getDokter(id).getNama()); 
        }
        else {
            System.out.println("Tidak ada dokter dengan id tersebut");
        }
    }
    
    public void cariPasien() {
        System.out.print("Id Pasien\t: "); int id = scan.nextInt();
        if (getPasien(id) != null) {
            System.out.println("Id Pasien\t: " + getPasien(id).getId());
            System.out.println("Nama Pasien\t: " + getPasien(id).getNama()); 
        }
        else {
            System.out.println("Tidak ada pasien dengan id tersebut");
        }
    }
    
    public void cariRuangan() {
        System.out.print("No Ruangan\t: "); int no = scan.nextInt();
        if (getRuangan(no) != null) {
            System.out.println("No Ruangan\t: " + getRuangan(no).getNoRuang());
            System.out.println("Nama Ruangan\t: " + getRuangan(no).getNama());
            //Tambahkan daftar pasien dan dokter
        }
        else {
            System.out.println("Tidak ada ruangan dengan no tersebut");
        }
    }
    
}
