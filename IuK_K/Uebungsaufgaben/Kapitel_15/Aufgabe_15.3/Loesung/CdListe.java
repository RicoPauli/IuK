// Datei: CdListe.java

public class CdListe
{
   private String archivTitel;
   private Cd[] liste;
   private int index;

   // Elementklasse Cd
   private class Cd
   {
      private String cdTitel;
      private String kuenstler;
      private int jahr;

      public Cd (String cdTitel, String kuenstler, int jahr)
      {
         this.cdTitel = cdTitel;
         this.kuenstler = kuenstler;
         this.jahr = jahr;
      }

      public String toString()
      {
         return "\nTitel: " + cdTitel + "\nKuenstler: " + kuenstler + "\nJahr: " + jahr;
      }
   }
   // Ende der Elementklasse Cd

   public CdListe (String archivTitel, int maxAnzahl)
   {
      this.archivTitel = archivTitel;
      this.liste = new Cd [maxAnzahl];
      index = 0;
   }

   public void cdHinzufuegen (String cdTitel, String kuenstler, int jahr)
   {
      if (index < liste.length)
      {
         liste [index] = new Cd (cdTitel, kuenstler, jahr);
         index++;
      }
      else
      {
         System.out.println ("Die CD-Liste ist voll. Es sind keine weiteren Eintraege moeglich.");
      }
   }

   public void listeAnzeigen()
   {
      System.out.println ("------------------------------------------------");
      System.out.println ("Die CD-Sammlung " + archivTitel + " enthaelt folgende Titel:");

      if (index == 0)
      {
         System.out.println ("\nKeine CD vorhanden!");
      }
      else
      {
         for (int i = 0; i < liste.length; i++)
         {
            Cd cd = liste [i];
            if (cd != null)
            {
               System.out.println (cd.toString());
            }
         }
      }
      System.out.println ("------------------------------------------------\n");
   }
}
