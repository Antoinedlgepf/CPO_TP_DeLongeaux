/*
 * EXO1 TP0
 * Antoine de Longeaux
 * 23 septembre 2024
 */

package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author caill
 */
public class EXO2 {

    public static void main(String[] args) 
    {
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        nb=5;
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) 
        {
        result=result+ind;
        }
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        System.out.println(nb);
        
    }
    // Affichage du resultat
   
}
