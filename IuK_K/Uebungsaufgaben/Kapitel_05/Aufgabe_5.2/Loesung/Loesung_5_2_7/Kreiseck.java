// Datei: Kreiseck.java

/**
 * Die Klasse Kreiseck verbindet den Kreis mit dem Quadrat.
 * 
 * @author Java Buch
 * @version 1.0
 */
public class Kreiseck
{
   private Kreis kreisref;

   private Eck eckref;

   /**
    * Skaliert das Kreiseck um den angegebenen Faktor.
    * 
    * @param u
    *           Faktor zur Skalierung.
    */
   public void skaliere (double u)
   {
      kreisref.skaliere (u);
      eckref.skaliere (u);
   }

   /**
    * Liefert die Flaechendifferenz der kombinierten Objekte.
    * 
    * @return Flaechendifferenz zwischen dem Quadrat und dem Kreis.
    */
   public double flaechendifferenz()
   {
      return (eckref.berechneFlaeche() - kreisref.berechneFlaeche());
   }

   /**
    * Liefert das Kreisobjekt.
    * 
    * @return Kreisobjekt.
    */
   public Kreis getKreis()
   {
      return kreisref;
   }

   /**
    * Setzt die Abmessungen fuer das Kreiseck.
    * 
    * @param alpha
    *           Abstand vom Mittelpunkt zum Rand.
    */
   public Kreiseck (double alpha) // alpha ist der Radius des
   // Inkreises
   {
      kreisref = new Kreis(alpha);
      eckref = new Eck(alpha);
   }
}
