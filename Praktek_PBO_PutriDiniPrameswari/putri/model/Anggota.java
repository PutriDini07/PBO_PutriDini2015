/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.model;

/**
 *
 * @author Hp
 */
public class Anggota {

    private String nobp;
    private String nama;
    private String alamat;
   
   public Anggota(){
        
    }
    public Anggota(String nobp, String nama, String alamat){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
        
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }
     
    public String getNobp() {
        return nobp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

}
