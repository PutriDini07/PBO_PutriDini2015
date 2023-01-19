# Modul 5 Putri Dini Prameswari
## Mendapatkan Input dari Keyboard 
##### 1. Menggunakan BufferedReader untuk mendapatkan input
Pada bagian ini, kita akan menggunakan kelas BufferedReader yang berada di java.io
package untuk mendapatkan input dari keyboard. 
langkah-langkah yang diperlukan untuk mendapatkan input dari keyboard: 
1. Tambahkan di bagian paling atas code anda: 
import java.io.*; 
2. Tambahkan statement ini: 
BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
3. Deklarasikan variabel String temporer untuk mendapatkan input, dan gunakan fungsi 
readLine() untuk mendapatkan input dari keyboard. Anda harus mengetikkannya di 
dalam blok try-catch: 
    try{ 
     String temp = dataIn.readLine(); 
     } 
     catch( IOException e ){ 
     System.out.println(“Error in getting input”); 
     } 

source code : 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

    public class GetInputFromKeyboard 
    { 
     public static void main( String[] args ){ 
     
     BufferedReader dataIn = new BufferedReader(new 
     InputStreamReader( System.in) ); 
     String name = ""; 
     System.out.print("Please Enter Your Name:"); 
     try{ 
     name = dataIn.readLine(); 
     }catch( IOException e ){ 
     System.out.println("Error!"); 
     } 
     System.out.println("Hello " + name +"!"); 
     } 
    }
menjelaskan bahwa akan menggunakan kelas BufferedReader, InputStreamReader
dan IOException yang berada di java.io package. Java Application Programming 
Interface (API) sudah berisi ratusan kelas yang bisa digunakan untuk program anda. 
Kelas-kelas tersebut dikumpulkan ke dalam packages.

* Pada statement, 
BufferedReader dataIn = new BufferedReader(new 
 InputStreamReader( System.in) ); 
kita mendeklarasikan sebuah variabel bernama dataIn dengan tipe kelas 
BufferedReader.

* String name = ""; 
Statement diatas merupakan tempat untuk menyimpan input dari user. Variabel name 
diinisialisasi sebagai String kosong "". 
* memberikan output string pada layar menanyakan nama user. 
System.out.print("Please Enter Your Name:"); 
* Block di bawah ini merupakan try-catch block, 
    try{ 
     name = dataIn.readLine(); 
    }catch( IOException e ){ 
     System.out.println("Error!"); 
    } 
Pada baris ini menjelaskan bahwa kemungkinan terjadi error pada statement 
name = dataIn.readLine();

* Selanjutnya statement, 
    name = dataIn.readLine(); 
method diatas memanggil dataIn.readLine(), mendapatkan input dari user dan 
memberikan sebuah nilai String. Nilai ini akan disimpan ke dalam variabel name, yang 
akan kita gunakan pada statement akhir untuk menyambut user, 
System.out.println("Hello " + name + "!");

    
##### 2.  Menggunakan JOptionPane untuk mendapatkan input
Cara lain untuk mendapatkan input dari user adalah dengan menggunakan kelas 
JoptionPane yang didapatkan dari javax.swing package. JoptionPane membuat 
kemudahan dengan memunculkan dialog box standar yang memberikan kepada user 
sebuah nilai atau menginformasikan sesuatu. Berikan kode berikut ini, 
    import javax.swing.JOptionPane; 
    
    public class GetInputFromKeyboard 
    { 
     public static void main( String[] args ){ 
     String name = ""; 
     name = JoptionPane.showInputDialog("Please enter your 
     name"); 
     
     String msg = "Hello " + name + "!"; 
     
     JOptionPane.showMessageDialog(null, msg); 
     
     } 
    } 
    
* Statement pertama, 
    import javax.swing.JOptionPane; 
Menjelaskan bahwa kita mengimport kelas JoptionPane dari javax.swing package. 
Bisa juga ditulis, 
    import javax.swing.*; 

* statement selanjutnya, 
    name = JOptionPane.showInputDialog("Please enter your name"); 
membuat sebuah JOptionPane input dialog, yang akan menampilkan dialog dengan 
sebuah pesan, sebuah textfield dan tombol OK seperti pada gambar. Hasil dari dialog 
tersebut adalah String dan disimpan ke dalam variabel name. 
* Sekarang kita membuat pesan selamat datang, yang akan disimpan ke dalam variabe 
msg, 
    String msg = "Hello " + name + "!"; 

* Menampilkan sebuah dialog yang memilki sebuah pesan dan 
tombol OK, 
    JOptionPane.showMessageDialog(null, msg);

###### Pembuat : Putri Dini Prameswari
**Thank You!**