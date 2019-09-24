// Datei: ProduktTest.java

public class ProduktTest
{
   public static void main (String[] args)
   {
      Produkt[] produkte = new Produkt [5];
      
      // Neues Auffagbecken anlegen
      produkte [0] = new Auffangbecken ("AufFang 2000", 2000, 60, 200, 70, 840);
      // Neue Kreiselpumpe anlegen
      produkte [1] = new Kreiselpumpe ("Kreisel SXT", 400, 52, 56, 150, 2.8f, 1500, 8, 800);
      // Neue Membranpumpe anlegen
      produkte [2] = new Membranpumpe ("Membro", 750, 50, 49, 120, 3.8f, 438, "Teflon");
      // Neue Kreiselpumpe anlegen
      produkte [3] = new Kreiselpumpe ("Schaufel TX", 650, 60, 59, 157, 3.1f, 1800, 5, 1200);
      // Neue Membranpumpe anlegen
      produkte [4] = new Membranpumpe ("Membri", 1200, 60, 60, 140, 4.1f, 673, "Edelstahl");

      // Alle Produkte ausgeben 
      for (Produkt i : produkte)
      {
         i.print();
      }
   }
}