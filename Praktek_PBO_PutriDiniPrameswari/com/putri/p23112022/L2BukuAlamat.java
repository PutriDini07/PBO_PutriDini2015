/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p23112022;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class L2BukuAlamat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EntryBukuAlamat bukuAlamat[] = new EntryBukuAlamat[100];

        int n, menu, updt;
        int a, i, del, isi;
        String nama;
        String alamat;
        String email;
        String telepon;

        isi = 0;

        do {
            System.out.print("1.Input Data\n2.Tampilkan Data\n3.Update Data\n4.Hapus Data\n5.Exit");
            System.out.println("\n--------------------------------------------");

            System.out.print("Masukkan jumlah data : ");
            n = in.nextInt();

            System.out.print("Masukkan Menu : ");
            menu = in.nextInt();

            System.out.println("============================================");
            switch (menu) {
                case 1:
                    in.nextLine();
                    for (i = 0; i < n; i++) {
                        EntryBukuAlamat bukuAlamat1 = new EntryBukuAlamat();
                        System.out.println("\nData ke-" + (i + 1));
                        System.out.print("Masukkan Nama : ");
                        nama = in.nextLine();
                        bukuAlamat1.setNama(nama);

                        System.out.print("Masukkan Alamat : ");
                        alamat = in.nextLine();
                        bukuAlamat1.setAlamat(alamat);

                        System.out.print("Masukkan Email : ");
                        email = in.nextLine();
                        bukuAlamat1.setEmail(email);

                        System.out.print("Masukkan Telepon : ");
                        telepon = in.nextLine();
                        bukuAlamat1.setNotelp(telepon);

                        bukuAlamat[i] = bukuAlamat1;
                        isi++;
                    }
                    System.out.println("============================================");
                    System.out.println("");
                    break;

                case 2:
                    if (isi == 0) {
                        System.out.println("Data Anda Kosong");
                    } else if (isi != 0) {
                        System.out.print("\t-Data Buku Alamat-");
                        for (i = 0; i < n; i++) {
                            System.out.println("\nData ke-" + (i + 1));
                            System.out.println("Nama : " + bukuAlamat[i].getNama());
                            System.out.println("Alamat : " + bukuAlamat[i].getAlamat());
                            System.out.println("No Telepon : " + bukuAlamat[i].getNotelp());
                            System.out.println("Email : " + bukuAlamat[i].getEmail());
                        }
                    }
                    System.out.println("============================================");
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Masukkan Data yang ingin di Update : ");
                    updt = in.nextInt();
                    EntryBukuAlamat bukuAlamat1 = new EntryBukuAlamat();

                    in.nextLine();
                    System.out.println("\nData ke-" + (updt));
                    System.out.print("Masukkan Nama : ");
                    nama = in.nextLine();
                    bukuAlamat1.setNama(nama);

                    System.out.print("Masukkan Alamat : ");
                    alamat = in.nextLine();
                    bukuAlamat1.setAlamat(alamat);

                    System.out.print("Masukkan Email : ");
                    email = in.nextLine();
                    bukuAlamat1.setEmail(email);

                    System.out.print("Masukkan Telepon : ");
                    telepon = in.nextLine();
                    bukuAlamat1.setNotelp(telepon);

                    bukuAlamat[updt - 1] = bukuAlamat1;
                    System.out.println("============================================");
                    System.out.println("");
                    break;

                case 4:
                    in.nextLine();
                    EntryBukuAlamat bukuAlamat2 = new EntryBukuAlamat();

                    System.out.print("Masukkan Data yang ingin di Hapus : ");
                    del = in.nextInt();

                    bukuAlamat2.setNama("");
                    bukuAlamat2.setAlamat("");
                    bukuAlamat2.setEmail("");
                    bukuAlamat2.setNotelp("");

                    bukuAlamat[del - 1] = bukuAlamat2;
                    isi--;
                    System.out.println("Data indeks " + del + " telah dihapus");
                    System.out.println("============================================");
                    System.out.println("");
                    break;
            }
        } while (menu != 5);
        System.out.println("");
    }

}
