// Datei: Umrechner.java

package umrechnung.tools;

import umrechnung.konstanten.Laenge;
import umrechnung.konstanten.Temperatur;

public class Umrechner
{
   public static float kmNachMeilen (float km)
   {
      return km * Laenge.faktorKmNachMeilen;
   }

   public static float meilenNachKm (float mile)
   {
      return mile * Laenge.faktorMeilenNachKm;
   }

   public static float celsiusNachFahrenheit (float celsius)
   {
      return (celsius * Temperatur.faktorCelsiusNachFahrenheit)
            + Temperatur.summandCelsiusNachFahrenheit;
   }

   public static float fahrenheitNachCelsius (float fahrenheit)
   {
      return (fahrenheit - Temperatur.summandFahrenheitNachCelsius)
            * Temperatur.faktorFahrenheitNachCelsius;
   }
}