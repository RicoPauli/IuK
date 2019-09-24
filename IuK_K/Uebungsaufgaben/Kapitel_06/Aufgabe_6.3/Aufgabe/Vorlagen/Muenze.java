// Datei: Muenze.java
public enum Muenze
{
   // Definition der Aufzählungskonstanten
   EinCent . . . . .,
   ZweiCent . . . . . ., 
   FuenfCent . . . . ., 
   ZehnCent . . . . .,
   ZwanzigCent . . . . ., 
   FuenfzigCent . . . . ., 
   EinEuro . . . . .,
   ZweiEuro . . . . .;

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
