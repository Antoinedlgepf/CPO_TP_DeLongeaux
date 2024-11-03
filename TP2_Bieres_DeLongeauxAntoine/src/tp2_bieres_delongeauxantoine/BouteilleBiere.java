/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_delongeauxantoine;

/**
 *
 * @author caill
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
   
    @Override

    public String toString() 
    {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }

   

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;

}

 

    public void lireEtiquette() 
    {

        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;

    }

   

    public boolean Décapsuler(){
        if (ouverte==false){
            ouverte=true;
        }else{
           System.out.println("erreur : biere déjà ouverte");
        }
        return false;
    }
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


