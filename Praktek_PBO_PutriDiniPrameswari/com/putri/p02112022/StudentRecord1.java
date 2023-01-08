/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p02112022;

/**
 *
 * @author Hp
 */
public class StudentRecord1 {

    public static void main(String[] args) {
        StudentRecord student3 = new StudentRecord("Ptr", "Padang", 20);
        student3.setAge(21);
        student3.print("");
        
         System.out.println("*******************************************");

        StudentRecord student4 = new StudentRecord();
        student4.print("");
        System.out.println("Jumlah Siswa :"+StudentRecord.getStudentCount());
        
        

    }
}
