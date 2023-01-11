/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;

/**
 *
 * @author Hp
 */
//tipe data huruf pertama tidak perlu besar
// 1) buat tipe data
public class Nasabah {
    private String kodeNasabah;
    private String namaNasabah;

    //2) buat contructor dan deklarasikan nilai nya
    public Nasabah(){
    }
    
    public Nasabah(String kodeNasabah, String namaNasabah) {
        this.kodeNasabah = kodeNasabah;
        this.namaNasabah = namaNasabah;
    }
    

    //3)Buat getter and setter dari data
    public String getKodeNasabah() {
        return kodeNasabah;
    }

    public void setKodeNasabah(String kodeNasabah) {
        this.kodeNasabah = kodeNasabah;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }
    
    
    
}
