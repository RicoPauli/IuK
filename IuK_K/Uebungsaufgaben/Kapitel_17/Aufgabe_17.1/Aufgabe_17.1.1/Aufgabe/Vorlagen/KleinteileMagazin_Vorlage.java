// Datei: KleinteileMagazin_Vorlage.java
package magazin;

import java.util.ArrayList;

// Die benötigten Klassen der hinzu gekauften 
// Klassenbibliothek importieren
. . . . .

// Die generische Klasse soll Objekte vom Typ Teil verwalten können
public class KleinteileMagazin . . . . .
{
   // Das ArrayList<T>-Objekt dient als interne Datenstruktur
   private ArrayList<T> magazin;
   
   public KleinteileMagazin()
   {
      magazin = new ArrayList<T>();
   }

   // Aufnehmen des übergebenen Postens in das Magazin 
   public boolean aufnehmen (T posten)
   {
      // Prüfen, ob der Posten mit Bezeichnung
      // und Ausführung schon vorhanden ist
      int index = . . . . .

      // Ist der Posten schon vorhanden, so soll 
      // die Methode false zurückliefern
      . . . . .
      
      // Aufnehmen des Postens in das Magazin
      . . . . .
   }

   // Einlagern des Kleinteils in beschriebener Ausführung
   public boolean einlagern (String bezeichnung,
                             String ausfuehrung, int stueckzahl)
   {
      // Ist der Posten verfügbar (Die 
      // vorhandene Stückzahl ist egal)?
      int index = . . . . .
      // Wenn ja, dann die vorhandene Stückzahl 
      // des Postens um die übergebene Stückzahl erhöhen
      if (index >= 0)
      {
         . . . . .
      }
      // Posten ist nicht vorhanden
      . . . . .
   }

   // Entnehmen des gewünschten Kleinteils
   public boolean entnehmen (String bezeichnung,
                             String ausfuehrung, int stueckzahl)
   {
      // Ist der gesuchte Posten in 
      // ausreichender Stückzahl verfügbar?
      int index = . . . . .
      // Wenn ja, dann die gewünschte Stückzahl entnehmen
      if (index >= 0)
      {
         . . . . .
      }
      // Nicht in ausreichender Stückzahl verfügbar
      . . . . .
   }
      
   // Den Bestand des Magazins ausdrucken
   public void druckeMagazin()
   {
      . . . . .
   }
   
   // Hilfsmethode, die überprüft, ob der Posten in Bezeichnung,
   // Ausführung und gewünschter Stückzahl schon im Magazin 
   // vorhanden ist. Sie liefert dann dessen Index im 
   // ArrayList<T>-Objekt zurück, sonst -1  
   private int istVerfuegbar (String bezeichnung, 
                              String ausfuehrung, int anzahl)
   {
      // Suchen, bis der Posten in Bezeichnung und 
      // Ausführung gefunden wurde. Dann den Index 
      // im ArrayList<T>-Objekt zurückliefern.
      for (T posten : magazin) 
      {
         . . . . .
      }
      // Nicht verfügbar? -1 zurückliefern.
      . . . . .
   }
}
