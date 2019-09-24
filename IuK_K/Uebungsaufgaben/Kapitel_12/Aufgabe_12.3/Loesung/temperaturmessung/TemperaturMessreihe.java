// Datei: TemperaturMessreihe.java

package temperaturmessung;

import messdaten.Messreihe;

public class TemperaturMessreihe extends Messreihe
{
   private String temperaturEinheit;

   public TemperaturMessreihe (int messwertAnzahl, String temperaturEinheit)
   {
      super (messwertAnzahl);
      this.temperaturEinheit = temperaturEinheit;
   }

   public void print()
   {
      System.out.println ("Folgende Temperaturmessungen (in "
            + temperaturEinheit + ") sind gespeichert: \n");
      super.print();
   }

   public static double CelsiusToFahrenheit (double celsiusTemp)
   {
      return celsiusTemp * 1.8 + 32;
   }
}