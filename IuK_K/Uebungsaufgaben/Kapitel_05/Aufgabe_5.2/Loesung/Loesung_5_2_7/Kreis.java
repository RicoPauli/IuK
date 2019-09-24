// Datei: Kreis.java

/**
 * Die Klasse repraesentiert einen Kreis.
 * 
 * @author Java Buch
 * @version 1.0
 */
public class Kreis
{
   private double radius;

   /**
    * Konstante PI zur Berechnung der Flaeche.
    */
   public static final double PI = 3.1415; // PI ist eine konstante

   // Klassenvariable
   /**
    * Skaliert den Kreis um den angegebenen Faktor.
    * 
    * @param u
    *           Faktor um den der Kreis skaliert werden soll.
    */
   public void skaliere(double u)
   {
      radius = radius * u;
   }

   /**
    * Liefert die Flaeche des Kreises.
    * 
    * @return berechnete Flaeche des Kreises.
    */
   public double berechneFlaeche()
   {
      return (PI * radius * radius);
   }

   /**
    * Liefert den Radius des Kreises.
    * 
    * @return Radius des Kreises.
    */
   public double getRadius()
   {
      return radius;
   }

   /**
    * Setzt den Radius fuer den Kreis fest.
    * 
    * @param u
    *           Radius.
    */
   public Kreis(double u)
   {
      radius = u;
   }
}
