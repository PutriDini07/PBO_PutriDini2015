/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;

/**
 *
 * @author ACER
 */
public class Pinjaman {
    private String cboKodeNasabah;
    private String tanggalPinjaman;
    private String jumlahPinjaman;
    private String lamaPinjaman; 
    
    private double angsuranPokok;
    private double bungaPinjaman;
    
    private double angsuranPerbulan;
    private double total;

    public Pinjaman() {
    }

    public Pinjaman(String cboKodeNasabah, String tanggalPinjaman, String jumlahPinjaman, String lamaPinjaman, double angsuranPokok, double bungaPinjaman, double angsuranPerbulan, double total) {
        this.cboKodeNasabah = cboKodeNasabah;
        this.tanggalPinjaman = tanggalPinjaman;
        this.jumlahPinjaman = jumlahPinjaman;
        this.lamaPinjaman = lamaPinjaman;
        this.angsuranPokok = angsuranPokok;
        this.bungaPinjaman = bungaPinjaman;
        this.angsuranPerbulan = angsuranPerbulan;
        this.total = total;
    }


    public String getCboKodeNasabah() {
        return cboKodeNasabah;
    }

    public void setCboKodeNasabah(String cboKodeNasabah) {
        this.cboKodeNasabah = cboKodeNasabah;
    }

    public String getTanggalPinjaman() {
        return tanggalPinjaman;
    }

    public void setTanggalPinjaman(String tanggalPinjaman) {
        this.tanggalPinjaman = tanggalPinjaman;
    }

    public String getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(String jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    public String getLamaPinjaman() {
        return lamaPinjaman;
    }

    public void setLamaPinjaman(String lamaPinjaman) {
        this.lamaPinjaman = lamaPinjaman;
    }

    public double getBungaPinjaman() {
        bungaPinjaman = (Double.parseDouble(jumlahPinjaman)* 0.12);
        return bungaPinjaman;
    }
    
    public double getAngsuranPokok() {
        angsuranPokok = Double.parseDouble(jumlahPinjaman) / Integer.parseInt(lamaPinjaman);
        return angsuranPokok;
    }
    
    public double getAngsuranPerbulan() {
        
        angsuranPerbulan = (bungaPinjaman/Integer.parseInt(lamaPinjaman))+angsuranPokok;
        return angsuranPerbulan;
    }
    
    public double getTotal() {
        total = Double.parseDouble(jumlahPinjaman) +  bungaPinjaman;
        return total;
    }
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

