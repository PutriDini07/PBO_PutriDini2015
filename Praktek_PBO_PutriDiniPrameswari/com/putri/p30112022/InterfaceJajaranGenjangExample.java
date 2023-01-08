/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p30112022;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public interface InterfaceJajaranGenjangExample {

    public static void main(String[] args) {
        JajaranGenjang jajarangenjang[] = new JajaranGenjang[100];
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        Relation perbandingan = new JajaranGenjang();
        Scanner in = new Scanner(System.in);

        int alas, tinggi, sisiMiring;

        for (int i = 0; i < 2; i++) {
            JajaranGenjang isi = new JajaranGenjang();

            System.out.println("-JajaranGenjang-" + (i + 1));
            System.out.print("Masukkan Alas : ");
            alas = in.nextInt();
            System.out.print("Masukkan Tinggi : ");
            tinggi = in.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            sisiMiring = in.nextInt();
            System.out.println();

            isi.setJajarangenjang(alas, tinggi, sisiMiring);

            jajarangenjang[i] = isi;
        }

        System.out.println("-Jajaran Genjang 1-");
        System.out.println("Luas : " + jajarangenjang[0].luas());
        System.out.println("Keliling : " + jajarangenjang[0].kll());
        System.out.println("-Jajar Genjang 2-");
        System.out.println("Luas : " + jajarangenjang[1].luas());
        System.out.println("Keliling : " + jajarangenjang[1].kll());

        boolean hasilLuas1 = perbandingan.isGreater(jajarangenjang[0].luas(), jajarangenjang[1].luas());
        boolean hasilLuas2 = perbandingan.isLess(jajarangenjang[0].luas(), jajarangenjang[1].luas());
        boolean hasilLuas3 = perbandingan.isEqual(jajarangenjang[0].luas(), jajarangenjang[1].luas());
        boolean hasilKeliling1 = perbandingan.isGreater(jajarangenjang[0].kll(), jajarangenjang[1].kll());
        boolean hasilKeliling2 = perbandingan.isLess(jajarangenjang[0].kll(), jajarangenjang[1].kll());
        boolean hasilKeliling3 = perbandingan.isEqual(jajarangenjang[0].kll(), jajarangenjang[1].kll());

        boolean hasilInt = myInteger.isGreater(5, 7);
        boolean hasilDouble = myDouble.isGreater(5.1, 6.2);

        System.out.println("------------------------------------------------------------");
        System.out.println("Luas Jajaran Genjang 1 > Luas Jajaran Genjang 2 :" + hasilLuas1);
        System.out.println("Luas Jajaran Genjang 1 < Luas Jajaran Genjang 2 :" + hasilLuas2);
        System.out.println("Luas Jajaran Genjang 1 = Luas Jajaran Genjang 2 :" + hasilLuas3);
        System.out.println("Keliling Jajaran Genjang 1 > Keliling Jajaran Genjang 2 :" + hasilKeliling1);
        System.out.println("Keliling Jajaran Genjang 1 < Keliling Jajaran Genjang 2 :" + hasilKeliling2);
        System.out.println("Keliling Jajaran Genjang 1 = Keliling Jajaran2 Genjang 2 :" + hasilKeliling3);
        System.out.println("------------------------------------------------------------");
    }
}
