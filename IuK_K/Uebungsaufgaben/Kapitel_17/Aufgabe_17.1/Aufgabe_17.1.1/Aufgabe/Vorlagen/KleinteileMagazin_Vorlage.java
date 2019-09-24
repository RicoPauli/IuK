// Datei: KleinteileMagazin_Vorlage.java
package magazin;

import java.util.ArrayList;

// Die ben�tigten Klassen der hinzu gekauften 
// Klassenbibliothek importieren
. . . . .

// Die generische Klasse soll Objekte vom Typ Teil verwalten k�nnen
public class KleinteileMagazin . . . . .
{
   // Das ArrayList<T>-Objekt dient als interne Datenstruktur
   private ArrayList<T> magazin;
   
   public KleinteileMagazin()
   {
      magazin = new ArrayList<T>();
   }

   // Aufnehmen des �bergebenen Postens in das Magazin 
   public boolean aufnehmen (T posten)
   {
      // Pr�fen, ob der Posten mit Bezeichnung
      // und Ausf�hrung schon vorhanden ist
      int index = . . . . .

      // Ist der Posten schon vorhanden, so soll 
      // die Methode false zur�ckliefern
      . . . . .
      
      // Aufnehmen des Postens in das Magazin
      . . . . .
   }

   // Einlagern des Kleinteils in beschriebener Ausf�hrung
   public boolean einlagern (String bezeichnung,
                             String ausfuehrung, int stueckzahl)
   {
      // Ist der Posten verf�gbar (Die 
      // vorhandene St�ckzahl ist egal)?
      int index = . . . . .
      // Wenn ja, dann die vorhandene St�ckzahl 
      // des Postens um die �bergebene St�ckzahl erh�hen
      if (index >= 0)
      {
         . . . . .
      }
      // Posten ist nicht vorhanden
      . . . . .
   }

   // Entnehmen des gew�nschten Kleinteils
   public boolean entnehmen (String bezeichnung,
                             String ausfuehrung, int stueckzahl)
   {
      // Ist der gesuchte Posten in 
      // ausreichender St�ckzahl verf�gbar?
      int index = . . . . .
      // Wenn ja, dann die gew�nschte St�ckzahl entnehmen
      if (index >= 0)
      {
         . . . . .
      }
      // Nicht in ausreichender St�ckzahl verf�gbar
      . . . . .
   }
      
   // Den Bestand des Magazins ausdrucken
   public void druckeMagazin()
   {
      . . . . .
   }
   
   // Hilfsmethode, die �berpr�ft, ob der Posten in Bezeichnung,
   // Ausf�hrung und gew�nschter St�ckzahl schon im Magazin 
   // vorhanden ist. Sie liefert dann dessen Index im 
   // ArrayList<T>-Objekt zur�ck, sonst -1  
   private int istVerfuegbar (String bezeichnung, 
                              String ausfuehrung, int anzahl)
   {
      // Suchen, bis der Posten in Bezeichnung und 
      // Ausf�hrung gefunden wurde. Dann den Index 
      // im ArrayList<T>-Objekt zur�ckliefern.
      for (T posten : magazin) 
      {
         . . . . .
      }
      // Nicht verf�gbar? -1 zur�ckliefern.
      . . . . .
   }
}
