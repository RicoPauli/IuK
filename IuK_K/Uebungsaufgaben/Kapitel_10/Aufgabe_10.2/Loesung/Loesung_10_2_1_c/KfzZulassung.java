// Datei: KfzZulassung.java

public class KfzZulassung
{
   private String kennzeichen;

   private String fahrzeughalter;

   private static int anzahl = 0;

   public KfzZulassung(String kennzeichen, String fahrzeughalter)
   {
      this.kennzeichen = kennzeichen;
      this.fahrzeughalter = fahrzeughalter;
      anzahl++;
   }

   public void print()
   {
      System.out.println("Kennzeichen:    " + kennzeichen);
      System.out.println("Fahrzeughalter: " + fahrzeughalter);
   }

   public static int getAnzahl()
   {
      return anzahl;
   }
}
