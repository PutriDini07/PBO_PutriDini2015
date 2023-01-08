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
public class Peminjaman {

    private String nobp;
    private String kodeBuku;
    private String tgl_pinjam;
    private String tgl_kembali;

    public Peminjaman() {
    }
    
    

    public Peminjaman(String nobp, String kodeBuku, String tgl_pinjam, String tgl_kembali) {
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
    }
    
    

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

  
}

