// Datei: KfzZulassung.java

public class KfzZulassung
{
   private String kennzeichen;

   private String fahrzeughalter;

   public static int anzahl = 0;

   public KfzZulassung(String kennzeichen, String fahrzeughalter)
   {
      this.kennzeichen = kennzeichen;
      this.fahrzeughalter = fahrzeughalter;
   }

   public void print()
   {
      System.out.println("Kennzeichen:    " + kennzeichen);
      System.out.println("Fahrzeughalter: " + fahrzeughalter);
   }

   public static void main(String[] args)
   {
      System.out.println("Anzahl der Zulassungen: " + KfzZulassung.anzahl);

      System.out.println("\nNeue Zulassung");
      KfzZulassung z1 = new KfzZulassung("ES-FH 2003", "Martin Mustermann");
      KfzZulassung.anzahl++;
      z1.print();

      System.out.println("\nAnzahl der Zulassungen: " + KfzZulassung.anzahl);

      System.out.println("\nNeue Zulassung");
      KfzZulassung z2 = new KfzZulassung("ES-FH 2004", "Markus Mueller");
      KfzZulassung.anzahl++;
      z2.print();

      System.out.println("\nAnzahl der Zulassungen: " + KfzZulassung.anzahl);
   }
}
