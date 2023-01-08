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
public class Buku {

    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;

    public Buku() {

    }

    public Buku(String kode, String judul, String pengarang, String penerbit) {
        this.kodebuku = kode;
        this.judulbuku = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;

    }

    public void setKodeBuku(String kodeBuku) {
        this.kodebuku = kodeBuku;
    }
       
    public String getKodeBuku() {
        return kodebuku;
    }
    
    public void setJudulBuku(String judulBuku) {
        this.judulbuku = judulBuku;
    }     
    public String getJudulBuku() {
        return judulbuku;
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getPengarang() {
        return pengarang;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }
}
