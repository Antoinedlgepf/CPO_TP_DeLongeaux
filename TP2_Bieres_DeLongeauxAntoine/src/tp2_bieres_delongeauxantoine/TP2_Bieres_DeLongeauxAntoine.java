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
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
      
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxBiere.lireEtiquette();
   
        BouteilleBiere troisBiere = new BouteilleBiere("Heineken",5.0,"Abbaye de Heineken");
        troisBiere.lireEtiquette();
       
        BouteilleBiere quatreBiere = new BouteilleBiere("Chouffe",5.5,"Abbaye de Chouffe");
        quatreBiere.lireEtiquette();
      
        uneBiere.Décapsuler();
        troisBiere.Décapsuler();
        System.out.println(uneBiere);
        System.out.println(deuxBiere);
        System.out.println(troisBiere);
        System.out.println(quatreBiere);
 
    }

}