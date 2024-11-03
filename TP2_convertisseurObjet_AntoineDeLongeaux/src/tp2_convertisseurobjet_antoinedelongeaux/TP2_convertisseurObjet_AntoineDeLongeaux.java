q/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_antoinedelongeaux;

/**
 *
 * @author caill
 */
public class TP2_convertisseurObjet_AntoineDeLongeaux {

   public void main(String[] args) {

        Convertisseur convertisseur = new Convertisseur();

        convertisseur.CelciusVersKelvin(25);

        convertisseur.KelvinVersCelcius(30);

       

        Convertisseur convertisseur2 = new Convertisseur();

        convertisseur.FarenheitVersCelcius(25);

        convertisseur.CelciusVersFarenheit(25);

       

        System.out.println(convertisseur);

        System.out.println(convertisseur2);

    }
   public class Convertisseur {

    int nbConversions;

   

    public Convertisseur () {

        nbConversions = 0 ;

    }

    public double CelciusVersKelvin (double tCelcius) {

        nbConversions +=1 ;

        return tCelcius+273;

    }

    public double KelvinVersCelcius (double tKelvin) {

        nbConversions +=1 ;

        return tKelvin-273;

    }

    public double FarenheitVersCelcius (double tFarenheit) {

        nbConversions +=1 ;

        return tFarenheit-32;

    }

    public double CelciusVersFarenheit (double tCelcius) {

        nbConversions +=1 ;

        return tCelcius+32;

    }

    public double KelvinVersFarenheit (double tKelvin) {

        nbConversions +=1 ;

        return tKelvin-459.67;

    }

    public double FarenheitVersKelvin (double tFarenheit) {

        nbConversions +=1 ;

        return tFarenheit+459.67;

    }

    @Override

    public String toString () {

        return "nb de conversions"+ nbConversions;

    }

}

   

}
    

