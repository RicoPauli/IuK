// Datei: Kreiselpumpe.java

public class Kreiselpumpe extends Pumpe
{
   private int anzahlSchaufeln;
   private int maximaleDrehzahl;

   public Kreiselpumpe (String name, int gewicht, int hoehe, int breite, int tiefe, float maximalerBetriebsdruck,
                        int maximaleFoerdermenge, int anzahlSchaufeln, int maximaleDrehzahl)
   {
      super (name, gewicht, hoehe, breite, tiefe, maximalerBetriebsdruck, maximaleFoerdermenge);
      this.anzahlSchaufeln = anzahlSchaufeln;
      this.maximaleDrehzahl = maximaleDrehzahl;
   }

   public void print()
   {
      super.print();
      System.out.println ("Typ:                Kreiselpumpe");
      System.out.println ("Anzahl Schaufeln:   " + anzahlSchaufeln);
      System.out.println ("Max. Drehzahl:      " + maximaleDrehzahl + "U/min");
   }
}
