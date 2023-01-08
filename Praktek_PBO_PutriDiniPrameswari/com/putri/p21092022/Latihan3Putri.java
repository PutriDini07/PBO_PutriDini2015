/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p21092022;

/**
 *
 * @author Hp
 */
public class Latihan3Putri {
    public static void main(String[] args) {
        int x = 10;
        int y = 23;
        int z = 5;
            
        int max;
       
        System.out.println("number1 =" + x);
        System.out.println("number2 =" + y);
        System.out.println("number3 =" + z);
        
        max =(y>=x)? y: x;
        max =(z>=max)? z: max;
        System.out.println("nilai tertinggi adalah angka =" + max);    
    }
}
