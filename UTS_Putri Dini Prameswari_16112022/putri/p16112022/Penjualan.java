/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.putri.p16112022;

/**
 *
 * @author Hp
 */
public class Penjualan {
    private String faktur;
    private String pelanggan;
    private String kode;
    private double harga;
    private double jumlah;
    private double total;
    private double diskon;
    private double bayar;
    public static int penjualanCount;
    
    public Penjualan(){
  
    }
      
    public Penjualan(String faktur, String pelanggan, String kode, double harga){
        //penjualanCount++;
        this.faktur = faktur;
        this.pelanggan = pelanggan;
        this.kode = kode;
        this.harga = harga;
    }
    
    public String getFaktur() {
        return faktur;
    }
    
    public void setFaktur (String faktur){
        this.faktur = faktur;
    }
    
    public String getPelanggan() {
        return pelanggan;
    }
    
    public void setPelanggan (String pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public String getKode() {
        return kode;
    }
    
    public void setKode (String kode){
        this.kode = kode;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga (double harga){
        this.harga = harga;
    }
    
    public double getJumlah() {
        return jumlah;
    }
    
    public void setJumlah (double jumlah){
        this.jumlah = jumlah;
    }
    ///=================================================
    
    public double getTotal(){
        
        total = harga * jumlah;
        return total;
    }
    
     public double getDiskon(){
         
         if(total>500000){
             diskon = harga * 0.02;
         }
         else if(total>1000000){
             diskon = harga * 0.05;
         }
         
        return diskon;
    }
     
     public double getBayar(){
         bayar = total - diskon;
        return bayar;
    }
}