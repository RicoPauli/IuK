// Datei: Muenze.java

public enum Muenze
{
   // Definition der Aufzaehlungskonstanten
   EinCent (1),
   ZweiCent (2),
   FuenfCent (5),
   ZehnCent (10),
   ZwanzigCent (20),
   FuenfzigCent (50),
   EinEuro (100),
   ZweiEuro (200);

   // Datenfeld
   private int wert;

   // Konstruktor
   Muenze (int wert)
   {
      this.wert = wert;
   }

   // Methode zum Auslesen des Wertes
   public int value()
   {
      return wert;
   }
}
