/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p19102022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

/**
 *
 * @author Hp
 */
public class Latihan1 {
    public static void main(String[] args)throws IOException
    {        
        BufferedReader dataIn = new BufferedReader(new
            InputStreamReader( System.in) );
        int grade = 0;
        System.out.print("grade:");
        grade = Integer.parseInt(dataIn.readLine());
       
        if (grade >= 90) {
            System.out.println("Exellent!");
        } else if ((grade < 90) && (grade >= 80)){
            System.out.println("Good job!");
        } else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study harder!");
        } else {
            System.out.println("Sorry, you failed.");
        } 
    }
}
