// Datei: Flaechenberechnung.java

import java.util.Scanner;

class Quadrat 
{
    double a;
    
    public Quadrat (double laenge)
    {
       a = laenge;
    }

    public double getFlaeche()
    {
        return a * a;
    }
}

class Rechteck 
{
    double a, b;
    
    public Rechteck (double laenge, double breite)
    {
       a = laenge;
       b = breite;
    }

    public double getFlaeche()
    {
        return a * b;
    }
}

public class Flaechenberechnung
{
    public static void main (String[] args) 
    {
        System.out.println ("Flaechenprogramm\n");

        Scanner eingabe = new Scanner (System.in);

        // die Koordinaten fuer die Flaechen einlesen und zuweisen
        System.out.print ("Bitte Seite a des Rechtecks eingeben: ");
        double a = eingabe.nextDouble();
        System.out.print ("Bitte Seite b des Rechtecks eingeben: ");
        double b = eingabe.nextDouble();
        
        Rechteck rechteck = new Rechteck (a, b);
        
        System.out.print ("Bitte Seitelaenge des Quadrats " +
                          "eingeben:");
        double laenge = eingabe.nextDouble();

        Quadrat quadrat = new Quadrat (laenge);

        // Flaeche des Rechtecks berechnen
        double flaecheR = rechteck.getFlaeche();

        // Flaeche des Quadrats berechnen
        double flaecheQ = quadrat.getFlaeche();

        // Ausgabe der Flaechen auf den Bildschirm
        System.out.println ("\nDie Flaeche des Rechtecks betraegt " 
                            + flaecheR + " qm.");
        System.out.println ("Die Flaeche des Quadrats betraegt "
                            + flaecheQ + " qm."); 
        System.out.println ("Die Flaeche der beiden Objekte betraegt "
                            + (flaecheQ + flaecheR) + " qm.");
    }
}
