/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahmi Salman N
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ruangan r1 = new Ruangan("Zaitun", 5);
        Pasien p1 = new Pasien("Fahmi");
        Pasien p2 = new Pasien("indah");
        Dokter d1 = new Dokter(1, "Salman");
        Dokter d2 = new Dokter("Mei");
        r1.tambahPasien(p1, d1);
        r1.tambahPasien(p2, d1);
        r1.getDaftarPasien(0).addDiagnosa("Sakit");
        r1.getDaftarPasien(0).addDiagnosa("Parah");
        r1.getDaftarPasien(0).addDiagnosa("Sekali");
        r1.getDaftarPasien(1).addDiagnosa("Sakit juga");
        
        System.out.println(r1.getDaftarPasien(0).getDokter().getNama());
        System.out.println(r1.getDaftarPasien(0).getPasien().getNama());
        System.out.println(r1.getDaftarPasien(0).getDiagnosa(0));
        System.out.println(r1.getDaftarPasien(0).getDiagnosa(1));
        System.out.println(r1.getDaftarPasien(0).getDiagnosa(2));
        System.out.println("");
        System.out.println(r1.getDaftarPasien(1).getDokter().getNama());
        System.out.println(r1.getDaftarPasien(1).getPasien().getNama());
        System.out.println(r1.getDaftarPasien(1).getDiagnosa(0));
        r1.getDaftarPasien(1).setDokter(d2);
        System.out.println("\n" + r1.getDaftarPasien(1).getDokter().getNama());
        
    }
    
}
