/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.p07122022;

/**
 *
 * @author Hp
 */
public class LatihanException1 {

    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]="
                        + args[i]);
            }

        } catch (Exception x) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Done");
        }
    }
}
