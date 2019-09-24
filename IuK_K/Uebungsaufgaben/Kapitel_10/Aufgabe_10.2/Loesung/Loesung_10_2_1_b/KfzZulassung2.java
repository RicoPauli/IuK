// Datei: KfzZulassung2.java

public class KfzZulassung2
{
   // private String kennzeichen;
   public String kennzeichen;

   private String fahrzeughalter;

   public static int anzahl = 0;

   public KfzZulassung2 (String kennzeichen, String fahrzeughalter)
   {
      this.kennzeichen = kennzeichen;
      this.fahrzeughalter = fahrzeughalter;
   }

   public void print()
   {
      System.out.println("Kennzeichen:    " + kennzeichen);
      System.out.println("Fahrzeughalter: " + fahrzeughalter);
   }

}
