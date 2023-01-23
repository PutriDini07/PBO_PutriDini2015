# Modul 9 PBO Teori_Putri Dini Prameswari

### Bekerja dengan Java Class Library

###### Contoh TestPassByValue 
    
    public class TestPassByValue 
    { 
     public static void main( String[] args ){ 
     int i = 10; 
     //mencetak nilai i 
     System.out.println( i ); 
     //memanggil method test 
     //passing i pada method test 
     test( i ); 
     //Mencetak nilai i 
     System.out.println( i ); 
    Pass i as parameter 
    which is copied to j 
         } 
    public static void test( int j ){ 
     //merubah nilai parameter j 
     j = 33; 
     } 
    } 
Pada contoh diatas yang telah diberikan, kita memanggil method tes dan melewatkan nilai i sebagai parameter. Nilai pada i dikopikan pada variable pada method j. sejak j adalah variable pengganti pada method tes, dia tidak akan berdampak pada nilai variable jika i pada main semenjak memiliki perbedaan kopy pada variable.

###### contoh TestPassByReference : 

    class TestPassByReference 
    { 
     public static void main( String[] args ){ 
     //membuat array integer 
     int []ages = {10, 11, 12}; 
     //mencetak nilai array 
     for( int i=0; i<ages.length; i++ ){ 
     System.out.println( ages[i] ); 
     } 
     test( ages ); 
     
     for( int i=0; i<ages.length; i++ ){ 
     System.out.println( ages[i] ); 
     } 
     } 
    public static void test( int[] arr ){ 
     //merubah nilai array 
     for( int i=0; i<arr.length; i++ ){ 
     arr[i] = i + 50; 
    Pass ages as parameter 
    which is copied to 
    variable arr 
     } 
     } 
    }
Keadaan yang salah tentang nilai oleh referensi di java adalah ketika membuat method swap menggunakan referensi Java, mencatat tentang manipulasi object Java ‘by reference’ tetapi nilai objeck dari referensi dari method ‘by value,’” adalah hasil, anda tidak dapat menulis standart swap method ke swap objek. 

###### Untuk melihat jika dua object String memiliki nilai yang sesuai, sebuah method dari class yang disebuat dengan equals() digunakan. 
Method menguji setiap character dalam string dan mengembalikan nilai true jika dua string memiliki nilai yang sama. 
Kode :

    class EqualsTest { 
     public static void main(String[] arguments) { 
     String str1, str2; 
     str1 = "Free the bound periodicals."; 
     str2 = str1; 
     System.out.println("String1: " + str1); 
     System.out.println("String2: " + str2); 
     System.out.println("Same object? " + (str1 == str2)); 
     str2 = new String(str1); 
     System.out.println("String1: " + str1); 
     System.out.println("String2: " + str2); 
     System.out.println("Same object? " + (str1 == str2)); 
     System.out.println("Same value? " + str1.equals(str2)); 
     } 
     } 
Output program ini adalah sebagai berikut , 
OUTPUT: 
String1: Free the bound periodicals. 
String2: Free the bound periodicals. 
Same object? true 
String1: Free the bound periodicals. 
String2: Free the bound periodicals. 
Same object? false 
Same value? True 
Sekarang mari mendiskusikan tentang kode. 
String str1, str2; 
str1 = "Free the bound periodicals.";

*Thank you !*

*Pembuat*
> Putri Dini Prameswari