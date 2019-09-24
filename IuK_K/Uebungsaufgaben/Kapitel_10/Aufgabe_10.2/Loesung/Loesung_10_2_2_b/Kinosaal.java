// Datei: Kinosaal.java

public class Kinosaal
{
   private int saalNummer;

   private int anzahlSitzplaetzeSaal;

   private static int anzahlSitzplaetzeKino = 0;

   private static int anzahlKinosaele = 0;

   public Kinosaal()
   {
      anzahlKinosaele++;
      saalNummer = anzahlKinosaele;
   }

   public int getAnzahlSitzplaetzeSaal()
   {
      return anzahlSitzplaetzeSaal;
   }

   public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal)
   {
      // Nur die Differenz zur Anzahl hinzuaddieren
      anzahlSitzplaetzeKino += anzahlSitzplaetzeSaal
            - this.anzahlSitzplaetzeSaal;
      this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
   }

   public static int getAnzahlSitzplaetzeKino()
   {
      return anzahlSitzplaetzeKino;
   }

   public static int getAnzahlKinosaele()
   {
      return anzahlKinosaele;
   }

   public int getSaalNummer()
   {
      return saalNummer;
   }
}
