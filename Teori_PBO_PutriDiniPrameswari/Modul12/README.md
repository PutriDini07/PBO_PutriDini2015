# Modul 12 PBO Teori_Putri Dini Prameswari

### Dasar Exception Handling

######  Exception
Exception adalah sebuah peristiwa yang menjalankan alur proses normal pada program. Peristiwa ini biasanya berupa kesalahan(error) dari beberapa bentuk. Ini disebabkan program kita berakhir tidak normal. 
 
 contoh :
 
    public class ExceptionExample
    {
    public static void main( String[] args ){
    try{
    System.out.println( args[1] );
    }catch( ArrayIndexOutOfBoundsException exp ){
    System.out.println("Exception caught!");
    }
    }
    }
Jadi kita akan menjalankan program lagi tanpa argumen, keluarannya akan menjadi

    Exception caught!


*Pembuat*
> Putri Dini Prameswari