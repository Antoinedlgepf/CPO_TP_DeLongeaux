/*
 * Antoine de Longeaux
 * 23 Septembre 2024
 */

package com.mycompany.tp1_convertisseur_delongeaux;

import java.util.Scanner;

/**
 *
 * @author caill
 */
public class TP1_convertisseur_DeLongeaux {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double var1 = sc.nextDouble()+ 275;
        System.out.println("Res"+ var1);
        
    }
    public static double CelciusVersKelvin(double tcelcius)
    {
        double res = tcelcius+275;
        return res;
    }
    public static double FareinheitVerscelcius(double tFareinheit)
    {
        double res = (tFareinheit - 32 )*5/9;
        return res;
              
    }
    public static double KelvinVersCelcius(double tKelvin)
    {
        double res = tKelvin - 275;
        return res;
    }
    public static double CelciusVersFarenheit(double tCelcius)
    {
        double res = (tCelcius * 9/5) + 32;
        return res;
        
    }
    public static double KelvinVersFarenheit (double tKelvin)
    {
        double res
    }
    public static double FarenheitVersKelvin(double tFarenheit)
    {
        
    
    }
            
            
            
}
