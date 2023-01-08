/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p19102022;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Latihan1_2 {
    public static void main(String[] args){
        
        double grade=0; 
        String msg = "";
        grade = Double.parseDouble(JOptionPane.showInputDialog("Please enter your grade"));
       
        if (grade >= 90) {
            msg = "Exellent!";
        } else if ((grade < 90) && (grade >= 80)){
            msg = "Good job!";
        } else if ((grade < 80) && (grade >= 60)){
            msg = "Study harder!";
        } else {
            msg = "Sorry, you failed.";
        } 
          JOptionPane.showMessageDialog(null, "nilai anda" + grade + "\n" + msg);
    }   
}
