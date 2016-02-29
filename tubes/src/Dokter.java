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
    
    public Dokter(int id, String nama) {
        super(nama);
        this.id = id;
    }
    
    public Dokter(String nama) {
        super(nama);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
