/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahmi Salman N
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
//        Ruangan r1 = new Ruangan(1, "RS", 5);
//        Pasien p1 = new Pasien(1, "Fahmi");
//        Pasien p2 = new Pasien(2, "indah");
//        Dokter d1 = new Dokter(1, "Salman");
//        Dokter d2 = new Dokter("Mei");
//        r1.tambahPasien(p1, d1);
//        r1.tambahPasien(p2, d1);
//        r1.getDaftarPasien(0).addDiagnosa("Sakit");
//        r1.getDaftarPasien(0).addDiagnosa("Parah");
//        r1.getDaftarPasien(0).addDiagnosa("Sekali");
//        r1.getDaftarPasien(1).addDiagnosa("Sakit juga");
//
//        System.out.println("Ruangan : " + r1.getNama());
//        for (int i = 0; i < r1.getJmlPasien(); i++) {
//            System.out.println("    Nama    : " + r1.getDaftarPasien(i).getPasien().getNama());
//            System.out.println("    Keluhan : ");
//            for (int j = 0; j < r1.getDaftarPasien(i).getJmlDiagnosa(); j++) {
//                System.out.println("        " + r1.getDaftarPasien(i).getDiagnosa(j));
//            }
//        }
//
//        r1.removePasien(0);
//        r1.getDaftarPasien(0).deleteDiagnosa(0);
//
//        System.out.println("Ruangan : " + r1.getNama());
//        for (int i = 0; i < r1.getJmlPasien(); i++) {
//            System.out.println("    Nama    : " + r1.getDaftarPasien(i).getPasien().getNama());
//            System.out.println("    Keluhan : ");
//            for (int j = 0; j < r1.getDaftarPasien(i).getJmlDiagnosa(); j++) {
//                System.out.println("        " + r1.getDaftarPasien(i).getDiagnosa(j));
//            }
//        }
    Aplikasi aplikasi = new Aplikasi();
    aplikasi.mainMenu();
//    aplikasi.menuInputDokter();

//    Dokter d = new Dokter(12, "Fahmi");
//    aplikasi.addDokter(d);
//    aplikasi.cariDokter();

    }

}
