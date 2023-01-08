/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p19102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hp
 */
public class Latihan5 {
  public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String masukan1 = "";
        String masukan2 = "";
        String masukan3 = "";
        int rata = 0;
        
        System.out.print("Nilai Ujian 1: ");
        
        try {
            masukan1 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Erorr!");
        }
        System.out.print("Nilai Ujian 2: ");
        try {
            masukan2 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Erorr!");
        }
        System.out.print("Nilai Ujian 3: ");
        try {
            masukan3 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Erorr!");
        }

        try {
            rata = (Integer.parseInt(masukan1) + Integer.parseInt(masukan2) + Integer.parseInt(masukan3)) / 3;
            System.out.println("Nilai Rata-rata Ujian = " + rata);
            if (rata >= 60) {
                System.out.println(":-)");
            } else {
                System.out.println(":-(");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("MAAF NILAI UJIAN TIDAK DAPAT DIPROSES.. DATA YANG DIINPUT TIDAK VALID!!");
            
        }
     
    }

}

