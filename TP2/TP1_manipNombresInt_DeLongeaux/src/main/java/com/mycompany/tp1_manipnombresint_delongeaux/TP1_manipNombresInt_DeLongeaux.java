/*
 * Antoine De Longeaux
 * 23 septembre 2024
 */

package com.mycompany.tp1_manipnombresint_delongeaux;

import java.util.Scanner;

/**
 *
 * @author caill
 */
public class TP1_manipNombresInt_DeLongeaux {

    public static void main(String[] args) 
    {
        System.out.println("saisir des variable");
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int var1 = sc.nextInt();
        System.out.println("var ="+ var);
        System.out.println("var1 ="+ var1);
        int addition = var+var1;
        double mult = var*var1;
        double div = var/var1;
        System.out.println("L'addition entre var et var1 =" + addition +"\n La multiplication entre var et var1 =" + mult + "\n La division entre var et var1 ="+ div );
        int val1 = var/var1;
        double reste = var%var1;
        
        
        
        
    }
}
