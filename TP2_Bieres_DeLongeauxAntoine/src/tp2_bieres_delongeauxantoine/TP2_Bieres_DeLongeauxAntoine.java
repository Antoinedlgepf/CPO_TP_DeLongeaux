/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_delongeauxantoine;

/**
 *
 * @author
 */
public class TP2_Bieres_DeLongeauxAntoine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       BouteilleBiere uneBiere = new BouteilleBiere() ;
       uneBiere.Nom = "Cuvee des trolls";
       uneBiere.DegreAlcool = 7.0;
       uneBiere.lireEtiquette();
       BouteilleBiere uneBiere2 = new BouteilleBiere() ;
       uneBiere2.Nom = "Leffe";
       uneBiere2.DegreAlcool = 6.6 ;
       uneBiere2.Brasserie = "Abbaye de Leffe" ;
       uneBiere2.lireEtiquette();
       
    }
    
}
