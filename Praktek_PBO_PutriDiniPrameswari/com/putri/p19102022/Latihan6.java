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
public class Latihan6 {
     public static void main(String[] args) {
       
        String nilai1 = "";        
        String nilai2 = "";
        String nilai3 = "";
            
        int rata = 0;
        nilai1 = JOptionPane.showInputDialog("Nilai 1:");
        nilai2 = JOptionPane.showInputDialog("Nilai 2:");
        nilai3 = JOptionPane.showInputDialog("Nilai 3:");
        
        try {
        rata = (Integer.parseInt(nilai1) + Integer.parseInt(nilai2) + Integer.parseInt(nilai3)) / 3;
        String msg = "Rata-Rata = " + rata;
        if (rata >= 60) {
            JOptionPane.showMessageDialog(null, msg + " :-)");
        }
        else {
            JOptionPane.showMessageDialog(null, msg + " :-( ");
        }
        } catch (NumberFormatException nfe) {
        String msg = "DATA YANG DIINPUT TIDAK VALID!!";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
} 


