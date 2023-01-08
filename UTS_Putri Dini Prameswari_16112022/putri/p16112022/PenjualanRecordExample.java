/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.putri.p16112022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class PenjualanRecordExample {

    public static void main( String[] args ){
         
        Penjualan penjualan1 = new Penjualan();
         
        
         penjualan1.setFaktur("05FT785");
         penjualan1.setPelanggan("Putri");
         penjualan1.setKode("2101092015");
         penjualan1.setHarga(20000);
         penjualan1.setJumlah(5);
         
        
         System.out.println("No Faktur = "+penjualan1.getFaktur());
         System.out.println("Nama Pelanggan = "+penjualan1.getPelanggan());
         System.out.println("Kode Penjualan = "+penjualan1.getKode());
         System.out.println("Harga = "+penjualan1.getHarga());
         System.out.println("Jumlah Barang = "+penjualan1.getJumlah());
         System.out.println("Total Harga = "+penjualan1.getTotal());
         System.out.println("Diskon = "+penjualan1.getDiskon());
         System.out.println("Total Bayar = "+penjualan1.getBayar());     
         
    }
    
}
