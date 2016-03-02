/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahmi Salman N
 */
public class Pasien extends Orang{

    private int id;
    
    public Pasien(int id, String nama) {
        super(nama);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    
}
