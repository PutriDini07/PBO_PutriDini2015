/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p23112022;

/**
 *
 * @author Hp
 */
public class EntryBukuAlamat {

    private String nama;
    private String alamat;
    private String notelp;
    private String email;

    public EntryBukuAlamat() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
      public void print(String nama,String alamat,String telp,String email){
        System.out.println("Nama : "+nama);
        System.out.println("Almat : "+alamat);
        System.out.println("Nomor Telepon : "+telp);
        System.out.println("Email : "+email);
    }
}
