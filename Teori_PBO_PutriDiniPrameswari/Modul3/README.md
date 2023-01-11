# Modul 3 PBO Teori_Putri Dini Prameswari

## Mengenali Lingkup Pemrograman Anda


### 3.2 Tujuan
membahas tentang bagaimana menulis, meng-compile dan
menjalankan(run) program Java. Terdapat 2 cara dalam melakukannya, yang pertama
menggunakan console dan text editor. Sedangkan cara kedua adalah dengan
menggunakan NetBeans yang merupakan Integrated Development Environment
atau yang disebut IDE.

### 3.2 Pendahuluan
IDE adalah sebuah peralatan dalam pemrograman yang diintegrasikan kedalam aplikasi
software yang mendukung pembangunan GUI, text atau penulisan kode, compiler dan
debugger.
Tutorial ini menggunakan Ubuntu Dapper sebagai sistem operasinya. Sebelum
menggunakan tutorial ini, pastikan bahwa telah menginstal Java dan NetBeans dalam
sistem yang anda gunakan. Untuk instruksi dalam bagaimana cara menginstal Java dan
NetBeans, dapat dilihat pada Appendix A. Untuk versi Windows Xp dalam sesi ini, dapat
dilihat pada Appendix B.

##### 1.2 Apa itu Teknologi Java ?.
Sebagai sebuah bahasa pemrograman, Java dapat membuat seluruh bentuk aplikasi, 
desktop, web dan lainnya, sebagaimana dibuat dengan menggunakan bahasa pemrograman konvensional yang lain. 
Java adalah bahasa pemrograman yang berorientasi objek (OOP) dan dapat 
dijalankan pada berbagai platform sistem operasi. Perkembangan Java tidak hanya 
terfokus oada satu sistem operasi, tetapi dikembangkan untuk berbagai sistem 
operasi dan bersifat open source

### 3.3 Program Java Pertama
    public class Hello 
    { 
    /**
     * My first java program
     */
     public static void main(String[] args) {
    //Menampilkan kata "Hello world" dilayar
     System.out.println("Hello world!"); 
     } 
    }
    
### 3.4 Menggunakan Text editor dan Console
###### Langkah 1: Memulai Text Editor
    Untuk memulai text editor di linux , klik pada Applications->Accessories->Text Editor.
###### Langkah 2: Membuka Terminal
    Untuk membuka terminal di linux, klik pada Applications-> Accessories-> Terminal.
###### Langkah 3: Tulislah listing program Java anda dalam text editor.
###### Langkah 4: Simpanlah program Java anda
    Program ini akan disimpan dalam file yang bernama ''Hello.java'', dan disimpan dalam
    sebuah folder yang bernama MYJAVAPROGRAMS.
    Untuk membuka Save dialog box, klik pada File menu yang terdapat pada menubar dan
    kemudian klik save.
    Setelah melakukan instruksi tersebut, dialog box akan tampil seperti gambar dibawah
    ini.
    Klik pada tombol browse, kemudian klik tombol Create Folder.
    Nama folder baru, MYJAVAPROGRAMS. Sekarang, klik pada folder MYJAVAPROGRAMS untuk mengetahui isi folder yang ada didalamnya.
    dalam pilihan textbox, ketiklah nama file dari program anda, yaitu ''Hello.java'',kemudian klik pada tombol SAVE.
    . Jika anda ingin melakukan perubahan pada file anda,
    anda hanya perlu mengeditnya, kemudian menyimpannya kembali dengan mengklik pada File->Save.
    
###### Langkah 5: Meng-compile program anda
    Langkah berikut ini adalah meng-compile program Anda. Masuklah ke Terminal Window
    yang telah kita buka sebelumnya.
    Ketika anda membuka terminal window, terminal tersebut menampilkan window yang
    disebut sebagai home folder Anda. Untuk melihat isi dari folder tersebut, ketik ls dan
    kemudian tekan ENTER. Apa yang akan anda temukan adalah daftar file-file dan folder
    didalamnya.
    Disinilah Anda dapat melihat folder dengan nama "MYJAVAPROGRAMS" yang telah kita buat sebelumnya, dan merupakan tempat dimana kita menyimpan program Hello.java kita. Kemudian masuklah kedalam direktori tersebut.
    Untuk masuk kedalam sebuah direktori, ketiklah perintah : cd [directory name].
    Perintah ''cd'' digunakan untuk merubah direktori. Dalam hal ini, nama dari direktori kita adalah MYJAVAPROGRAM, maka anda harus mengetik : cd MYJAVAPROGRAMS.
###### Langkah 6 : Menjalakan Program
    Selama proses peng-compile-an, javac menambah file baru kedalam disk yang disebut [filename].class, dalam hal ini, Hello.class, yang merupakan kode sebenarnya saat ini, dengan perkiraan tidak ada permasalahan pada saat proses compile (kita akan menyelidiki dan membahas permasalahan yang ditemukan selama proses compile, pada
    bagian berikutnya), berarti telah siap untuk menjalankan program anda.
    Untuk menjalankan program Java Anda, dengan mengetikan perintah : java [filename without the extension], maka dalam hal ini, Anda mengetikkan perintah : java Hello.




#### 3.4.1 Errors
Apa yang telah ditunjukan sejauh ini adalah program Java dimana kita tidak menemukan berbagai masalah dalam proses compiling maupun pada saat menjalankannya.
Bagaimanapun juga, hal ini tidak selalu terjadi. Seperti yang telah kita diskusikan pada bagian pertama dari latihan ini, biasanya kita juga akan menemukan permasalahan selama proses berlangsung.
Seperti yang telah didiskusikan sebelumnya, ada 2 macam error. Pertama adalah compile-time error atau yang disebut juga sebagai syntax error. Kedua adalah runtime errors.
#### 3.4.1.1 Syntax Errors
Syntax errors biasanya terjadi karena kesalahan penulisan. Mungkin Anda kekurangan sebuah perintah di Java atau lupa untuk menulis tanda titik-koma pada akhir
pernyataan. Java mencoba untuk mengisolasi error tersebut dengan cara menunjukkan baris dari kode dan terlebih dahulu menunjuk karakter yang salah dalam baris tersebut.
Bagaimanapun juga, error belum tentu berada pada titik yang ditunjuk.
Kesalahan umum lainnya adalah dalam kapitalisasi, ejaan, penggunaan dari karakter khusus yang tidak benar, dan penghilangan dari pemberian tanda baca yang sebenarnya.
#### 3.4.1.2 Run-time Errors
Run-time error merupakan error yang tidak akan ditampilkan sampai anda menjalankan program anda. Bahkan program yang dicompile dengan sukses dapat menampilkan jawaban yang salah jika programmer belum berpikir sampai struktur dan proses logis dari program tersebut.

### 3.5 Menggunakan NetBeans
Sekarang kita mencoba mengerjakan program kita dengan jalan yang lebih rumit, mari kita lihat bagaimana mengerjakan semua proses yang telah dijelaskan pada bagian sebelumnya dengan menggunakan sebuah aplikasi.
Pada bagian pelajaran ini, kita akan menggunakan NetBeans, yang merupakan
Integrated Development Environment atau IDE. Suatu IDE adalah lingkupan
pemrograman yang mengintegrasikan kedalam suatu aplikasi perangkat lunak yang menyediakan pembangun GUI, suatu text atau kode editor, suatu compiler atau enterpreter dan suatu debugger.
###### Langkah 1 : NetBeans
Ada dua cara untuk menjalankan NetBeans. Pertama menulis perintah menggunakan terminal, atau hanya dengan mengklik pada tombol shortcut yang dapat ditemukan didesktop.
Untuk menjalankan NetBeans menggunakan command-line. Bukalah terminal (lihat
langkahnya pada bagaimana menjalankan terminal didiskusi sebelumnya), dan ketiklah : netbeans.
Cara kedua untuk menjalankan NetBeans, adalah dengan mengklik shortcut icon yang terdapat pada desktop Anda.

###### Langkah 2: Membuat sebuah Project
Pertama, mari kita buat sebuah project. Klik pada File->New Project. Setelah melakukannya, akan ditampilkan kotak dialog project yang baru. Kemudian klik pada Java Application dan klik tombol NEXT.

###### Langkah 3 : Menulis Program Anda
Sebelum menulis program, pertama akan dijelaskan window utama setelah membuat project.

###### Langkah 4 : Meng-compile Program Anda
Sekarang, untuk meng-compile program anda, klik pada Build->Buid Main Project. Atau,anda juga dapat menggunakan tombol shortcut untuk meng-compile kode anda.

###### Langkah 5 : Menjalankan Program Anda
Untuk menjalankan program Anda, klik pada Run->Run Main Project. Atau Anda juga dapat menggunakan tombol shortcut untuk menjalankan program Anda.

*Thank you !*

*Pembuat*
> Putri Dini Prameswari