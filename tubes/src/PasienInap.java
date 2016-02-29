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
    private String[] diagnosa = new String[5];
    private int jmlDiagnosa;
    
    public PasienInap(Pasien pasien, Dokter dokter) {
        this.pasien = pasien;
        this.dokter = dokter;
    }
    
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

}
