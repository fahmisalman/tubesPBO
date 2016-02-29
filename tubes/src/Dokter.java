/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahmi Salman N
 */
public class Dokter extends Orang{

    private int id;
    private String spesialis;
    
    public Dokter(String nama, String alamat, int id, String spesialis) {
        super(nama, alamat);
        this.id = id;
        this.spesialis = spesialis;
    }
    
    public Dokter(String nama, int id) {
        super(nama);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
    
}
