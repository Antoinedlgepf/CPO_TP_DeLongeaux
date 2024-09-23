/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo3;

import java.util.Scanner;

/**
 *
 * @author caill
 */
public class EXO3 {

    public static void main(String[] args) 
    {
        int operateur;
        int operande1;
        int operande2;
        double res = 0;
        System.out.println("Please enter the operator: \n 1)Add \n 2)Substract \n 3)multiply \n 4)Divide \n 5)Modulo" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operand 1");
        operateur = sc.nextInt();
        if (operateur < 1 || operateur > 5 )
        {
            System.out.println("Erreur");
        }
        System.out.println("sasir operande1");
        operande1 = sc.nextInt();
        System.out.println("saisir operande2");
        operande2 = sc.nextInt();
        if (operateur == 1)
        {
            res = operande1 + operande2;
            System.out.println("the result is" + res);
        }
        if (operateur == 2)
        {
            res = operande1 - operande2;
            System.out.println("the realst is" + res);
        }
        if (operateur == 3)
        {
            res = operande1  * operande2;
            System.out.println("the result is" + res);
        }
        if (operateur == 4)
        {
            res = operande1 / operande2;
            System.out.println("the result is" + res);
        }
        if (operateur == 5)
        {
            res = operande1 % operande2;
            System.out.println("the result is" + res);
        }
        
    }
}
