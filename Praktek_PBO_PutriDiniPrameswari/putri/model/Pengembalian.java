/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri.model;

/**
 *
 * @author USER
 */
public class Pengembalian {
    private String kodeAnggota;
    private String kodeBuku;
    private String tgl_pinjam;
    private String tgl_kembali;
    private String tgl_dikembalikan;
    private int terlambat;
    private int denda;
    
    public Pengembalian(){
        
    }
    
    public Pengembalian(String kodeA,String kodeB,String tglP,String tglK,String tglD,int late,int denda){
        this.kodeAnggota = kodeA;
        this.kodeBuku = kodeB;
        this.tgl_pinjam = tglP;
        this.tgl_kembali = tglK;
        this.tgl_dikembalikan = tglD;
        this.terlambat = late;
        this.denda = denda;
        
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public String getTgl_dikembalikan() {
        return tgl_dikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public int getDenda() {
        return denda;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public void setTgl_kembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public void setTgl_dikembalikan(String tgl_dikembalikan) {
        this.tgl_dikembalikan = tgl_dikembalikan;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
    
    
}
