# Modul 7 PBO Teori_Putri Dini Prameswari

## Java Array


##### contoh, bagaimana untuk mencetak seluruh elemen didalam array. 
 contoh ini digunakanlah loop, sehingga kode kita menjadi lebih pendek.

    public class ArraySample{ 
     public static void main( String[] args ){ 
     int[] ages = new int[100]; 
     
     for( int i=0; i<100; i++ ){ 
     System.out.print( ages[i] ); 
     } 
     } 
    }

#####  contoh sebelumnya, kita dapat menuliskannya kembali seperti berikut ini
    
    public class ArraySample 
    { 
     public static void main( String[] args ){ 
     int[] ages = new int[100]; 
     
     for( int i=0; i<ages.length; i++ ){ 
     System.out.print( ages[i] ); 
     } 
     } 
    } 
Petunjuk penulisan program: 
 
1. Pada saat pembuatan loop untuk memproses elemen-elemen dalam array, 
gunakanlah length field didalam pernyataan pengkondisian dalam loop. Hal ini akan 
menyebabkan loop secara otomatis menyesuaikan diri terhada ukuran array yang
berbeda-beda. 
2. Pendeklarasian ukuran array di Java, biasanya digunakan constant untuk 
mempermudah. Sebagai contoh, 
final int ARRAY_SIZE = 1000; //pendeklarasian constant 
 . . . 
int[] ages = new int[ARRAY_SIZE]; 


##### Array Multidimensi 
Array multidimensi diimplementasikan sebagai array didalam array. Array multidimensi dideklarasikan dengan menambahkan jumlah tanda kurung setelah nama array. Sebagai contoh, 
     
    // Elemen 512 x 128 dari integer array 
    int[][] twoD = new int[512][128]; 
    // karakter array 8 x 16 x 24 
    char[][][] threeD = new char[8][16][24]; 
    // String array 4 baris x 2 kolom 
    String[][] dogs = {{ "terry", "brown" }, 
     { "Kristin", "white" }, 
     { "toby", "gray"}, 
     { "fido", "black"} 
     }; 
Untuk mengakses sebuah elemen didalam array multidimensi, sama saja dengan 
mengakses array satu dimensi. Misalnya saja, untuk mengakses element pertama dari 
baris pertama didalam array dogs, kita akan menulis, 
System.out.print( dogs[0][0] ); 
Kode diatas akan mencetak String “terry” di layar. 


    

*Thank you !*

*Pembuat*
> Putri Dini Prameswari