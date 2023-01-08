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
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Putri");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(80);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(90);
        ///Tampilkan
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Matematika  :"+student1.getMathGrade());
        System.out.println("B.Inggris   :"+student1.getEglishGrade());
        System.out.println("Pengetahuan :"+student1.getScienceGrade());
        System.out.println("Rata-Rata   :"+student1.getAverage()); 
        System.out.println("Nilai Max   :"+student1.getMaximum());
        
        System.out.println("------------------------------------");
        StudentRecord student2 = new StudentRecord();
        
        student2.setName("Dini");
        student2.setAddress("Pessel");
        student2.setAge(20);
        student2.setMathGrade(80);
        student2.setEnglishGrade(70);
        student2.setScienceGrade(90);
        student2.print("");
        student2.print(student2.getEglishGrade(),student2.getMathGrade(),student2.getScienceGrade());
       
    }
}
