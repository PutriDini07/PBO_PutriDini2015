package com.putri.p07122022;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hp
 */
public class ExampleException {

    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("index ke" + ex.getMessage() + "tidak ada");
         }finally{
            System.out.println("Keluar");
        }
        
    }
}
