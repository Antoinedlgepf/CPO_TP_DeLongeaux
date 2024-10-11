/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_delongeauxantoine;

/**
 *
 * @author caill
 */
public class BouteilleBiere 
{
    String Nom;
    double DegreAlcool;
    String Brasserie;
    Boolean Ouverte;
    public void lireEtiquette() 
    {
        System.out.println("Bouteille de " + Nom +" (" + DegreAlcool +
        " degres) \nBrasserie : " + Brasserie ) ;

    }

   
}
