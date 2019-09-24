// Datei: Fakultaet.java

public class Fakultaet
{
   public static void main (String[] args)
   {
      final int n = 10;      // Konstante als int definiert
      int fakultaetVonN;     // Variable zum Speichern von n!
      fakultaetVonN = 1;     // manuelle Initialisierung

      for (int i = 1; i <= n; i = i + 1)
      {
         // Berechnen der Fakultaet
         fakultaetVonN = fakultaetVonN * i;
      }
      // Ausgeben der Ergenisses
      System.out.println ("Die Fakultaet von n = "  + n + " ist " +
                          fakultaetVonN);
   }
}