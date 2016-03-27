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
        }
        jmlRuangan--;
    }

    public void menuInputDokter() {
        System.out.print("Id Dokter\t: ");
        int id = scan.nextInt();
        if (getDokter(id) == null) {
            System.out.print("Nama Dokter\t: ");
            String nama = scan.next();
            Dokter d = new Dokter(id, nama);
            addDokter(d);
            System.out.println("Penginputan berhasil");
        } else {
            System.out.println("Id sudah ada");
        }

    }

    public void menuInputPasien() {
        System.out.print("Id Pasien\t: ");
        int id = scan.nextInt();
        if (getPasien(id) == null) {
            System.out.print("Nama Pasien\t: ");
            String nama = scan.next();
            Pasien p = new Pasien(id, nama);
            addPasien(p);
        } else {
            System.out.println("Id sudah ada");
        }
    }

    public void menuInputRuangan() {
        System.out.print("No Ruangan\t: ");
        int no = scan.nextInt();
        if (getRuangan(no) == null) {
            System.out.print("Nama Ruangan\t: ");
            String nama = scan.next();
            System.out.print("Maks Pasien\t: ");
            int max = scan.nextInt();
            Ruangan r = new Ruangan(no, nama, max);
            addRuangan(r);
        }

    }

    public void menuHapusDokter() {
        System.out.print("Id Dokter\t: ");
        int id = scan.nextInt();
        if (getDokter(id) != null) {
            deleteDokter(id);
            System.out.println("Penghapusan berhasil");
        } else {
            System.out.println("Penghapusan gagal");
        }
    }

    public void menuHapusPasien() {
        System.out.print("Id Pasien\t: ");
        int id = scan.nextInt();
        if (getPasien(id) != null) {
            deletePasien(id);
            System.out.println("Penghapusan berhasil");
        } else {
            System.out.println("Penghapusan gagal");
        }
    }

    public void menuHapusRuangan() {
        System.out.print("No Ruangan\t: ");
        int no = scan.nextInt();
        if (getRuangan(no) != null) {
            deleteRuangan(no);
            System.out.println("Penghapusan berhasil");
        } else {
            System.out.println("Penghapusan gagal");
        }
    }

    public void cariDokter() {
        System.out.print("Id Dokter\t: ");
        int id = scan.nextInt();
        if (getDokter(id) != null) {
            System.out.println(getDokter(id).toString());
        } else {
            System.out.println("Tidak ada dokter dengan id tersebut");
        }
    }

    public void cariPasien() {
        System.out.print("Id Pasien\t: ");
        int id = scan.nextInt();
        if (getPasien(id) != null) {
            System.out.println(getPasien(id).toString());
        } else {
            System.out.println("Tidak ada pasien dengan id tersebut");
        }
    }

    public void cariRuangan() {
        System.out.print("No Ruangan\t: ");
        int no = scan.nextInt();
        if (getRuangan(no) != null) {
            System.out.println("No Ruangan\t: " + getRuangan(no).getNoRuang());
            System.out.println("Nama Ruangan\t: " + getRuangan(no).getNama());
            System.out.println("Daftar Pasien Inap  : ");
            for (int i = 0; i < getRuangan(no).getJmlPasien(); i++) {
                System.out.println("\t" + i + 1 + ".\tNama Pasien\t: " + getRuangan(no).getDaftarPasien(i).getPasien().getNama());
                System.out.println("\t\tNama Dokter\t: " + getRuangan(no).getDaftarPasien(i).getDokter().getNama());
                System.out.println("\t\tDiagnosa\t: ");
                for (int j = 0; j < getRuangan(no).getDaftarPasien(i).getJmlDiagnosa(); j++) {
                    System.out.println("\t\t\t" + j + 1 + ". " + getRuangan(no).getDaftarPasien(i).getDiagnosa(j));
                }
            }
        } else {
            System.out.println("Tidak ada ruangan dengan no tersebut");
        }
    }

    public void tampilDaftarPasien() {
        System.out.println("Daftar Pasien");
        for (int i = 0; i < jmlPasien; i++) {
            System.out.println(i + 1 + ". " + daftarPasien[i].getNama());
        }
    }

    public void tampilDaftarDokter() {
        System.out.println("Daftar Dokter");
        for (int i = 0; i < jmlDokter; i++) {
            System.out.println(i + 1 + ". " + daftarDokter[i].getNama());
        }
    }

    public void tampilDaftarRuangan() {
        System.out.println("Daftar Ruangan");
        for (int i = 0; i < jmlRuangan; i++) {
            System.out.println(i + 1 + ". " + daftarRuangan[i].getNoRuang());
        }
    }

    public void inputPasienInap() {
        System.out.print("No Ruangan\t: ");
        int no = scan.nextInt();
        if (getRuangan(no) != null) {
            System.out.print("Id Dokter\t: ");
            int idDokter = scan.nextInt();
            if (getDokter(idDokter) != null) {
                System.out.print("Id Pasien\t: ");
                int idPasien = scan.nextInt();
                if (getPasien(idPasien) != null) {
                    getRuangan(no).tambahPasien(getPasien(idPasien), getDokter(idDokter));
                    System.out.print("Jumlah Diahgnosa");
                    int jmlDiagnosa = scan.nextInt();
                    for (int i = 0; i < jmlDiagnosa; i++) {
                        System.out.print("Diagnosa : ");
                        String diagnosa = scan.next();
                        getRuangan(no).getIdPasien(idPasien).addDiagnosa(diagnosa);
                    }
                } else {
                    System.out.println("Tidak terdapat data pasien");
                }
            } else {
                System.out.println("Tidak terdapat data dokter");
            }
        } else {
            System.out.println("Tidak terdapat data ruangan");
        }
    }
    
    public void hapusDiagnosa() {
        System.out.print("No Ruangan\t: ");
        int no = scan.nextInt();
        if (getRuangan(no) != null) {
            System.out.print("Indeks Pasien Inap\t: ");
            int idx = scan.nextInt();
            idx--;
            if (getRuangan(no).getDaftarPasien(idx) != null) {
                System.out.print("Indeks diagnosa\t: ");
                int ind = scan.nextInt();
                ind--;
                if (getRuangan(no).getDaftarPasien(idx).getDiagnosa(ind) != null) {
                    getRuangan(no).getDaftarPasien(idx).deleteDiagnosa(ind);
                }
            }
        }
    }
    
    public void hapusPasienInap() {
        System.out.print("No Ruangan\t: ");
        int no = scan.nextInt();
        if (getRuangan(no) != null) {
            System.out.print("Indeks Pasien Inap\t: ");
            int idx = scan.nextInt();
            idx--;
            if (getRuangan(no).getDaftarPasien(idx) != null) {
                getRuangan(no).removePasien(idx);
            }
        }
    }

    public void mainMenu() throws InterruptedException {
        int pil;
        do {
            System.out.println("Main Menu\n----------------------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cari data");
            System.out.println("4. Lihat data");
            System.out.println("5. Keluar\n----------------------------------------");
            System.out.print("Pilih menu\t: ");
            pil = scan.nextInt();
            System.out.println("-----------------------------------------\n");
            switch (pil) {
                case 1: {
                    System.out.println("1. Input dokter");
                    System.out.println("2. Input pasien");
                    System.out.println("3. Input Ruangan");
                    System.out.println("4. Input Pasien Inap");
                    System.out.println("0. Kembali\n");
                    System.out.print("Pilih menu\t: ");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1: {
                            menuInputDokter();
                            break;
                        }
                        case 2: {
                            menuInputPasien();
                            break;
                        }
                        case 3: {
                            menuInputRuangan();
                            break;
                        }
                        case 4: {
                            inputPasienInap();
                            break;
                        }
                    }
                    Thread.sleep(2000);
                    break;
                }
                case 2: {
                    System.out.println("1. Hapus dokter");
                    System.out.println("2. Hapus pasien");
                    System.out.println("3. Hapus Ruangan");
                    System.out.println("4. Hapus pasien inap");
                    System.out.println("5. Hapus Diagnosa");
                    System.out.println("0. Kembali\n");
                    System.out.print("Pilih menu\t: ");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1: {
                            menuHapusDokter();
                            break;
                        }
                        case 2: {
                            menuHapusPasien();
                            break;
                        }
                        case 3: {
                            menuHapusRuangan();
                            break;
                        }
                        case 4: {
                            hapusPasienInap();
                            break;
                        }
                        case 5: {
                            hapusDiagnosa();
                            break;
                        }
                    }
                    Thread.sleep(2000);
                    break;
                }
                case 3: {
                    System.out.println("1. Cari dokter");
                    System.out.println("2. Cari pasien");
                    System.out.println("3. Cari Ruangan");
                    System.out.println("0. Kembali\n");
                    System.out.print("Pilih menu\t: ");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1: {
                            cariDokter();
                            break;
                        }
                        case 2: {
                            cariPasien();
                            break;
                        }
                        case 3: {
                            cariRuangan();
                            break;
                        }
                    }
                    Thread.sleep(2000);
                    break;
                }
                case 4: {
                    System.out.println("1. Lihat dokter");
                    System.out.println("2. Lihat pasien");
                    System.out.println("3. Lihat Ruangan");
                    System.out.println("0. Kembali\n");
                    System.out.print("Pilih menu\t: ");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1: {
                            tampilDaftarDokter();
                            break;
                        }
                        case 2: {
                            tampilDaftarPasien();
                            break;
                        }
                        case 3: {
                            tampilDaftarRuangan();
                            break;
                        }
                    }
                    Thread.sleep(2000);
                    break;
                }
            }
        } while (pil != 5);

    }

}
