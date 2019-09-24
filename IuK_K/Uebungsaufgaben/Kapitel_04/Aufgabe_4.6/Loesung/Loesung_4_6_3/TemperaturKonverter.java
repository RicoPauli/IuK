// Datei TemperaturKonverter.java

import java.util.Scanner;

public class TemperaturKonverter
{
   public static void main (String[] args) 
   {
      Scanner eingabe = new Scanner (System.in);
      int   konverterAuswahl;
      float eingegebeneTemperatur, konvertierteTemperatur;
      String prgEnde;
      
      do
      {
         System.out.println ("\n=============================");
         System.out.println ("Einfacher Temperaturkonverter");
         System.out.println ("=============================\n");
         
         System.out.print ("Bitte geben Sie die zu konvertierende Temperatur ein: ");
         eingegebeneTemperatur = eingabe.nextFloat();
         
         do
         {
            System.out.println ("Folgende Temperaturkonverter stehen zur Auswahl:");
            System.out.println 
                  ("\tCelsius    ==> Fahrenheit......[1]");
            System.out.println 
                  ("\tFahrenheit ==> Celsius.........[2]");
            System.out.print ("Treffen Sie Ihre Auswahl: ");
            konverterAuswahl = eingabe.nextInt();
         }while ((konverterAuswahl != 1) && (konverterAuswahl != 2));
         
         Konverter konverter = new Konverter();
         if (konverterAuswahl == 1) 
         {
            konvertierteTemperatur = konverter.CelsiusToFahrenheit (eingegebeneTemperatur);
            System.out.println ( eingegebeneTemperatur + " Grad Celsius entspricht " 
                                 + konvertierteTemperatur + " Grad Fahrenheit");
         }
         else if (konverterAuswahl == 2)
         {
            konvertierteTemperatur = konverter.FahrenheitToCelsius (eingegebeneTemperatur);
            System.out.println ( eingegebeneTemperatur + " Grad Fahrenheit entspricht " 
                                 + konvertierteTemperatur + " Grad Celsius");
         }
                
         System.out.println ("\nWollen Sie den Konverter beenden? [j / n]: ");
         prgEnde = eingabe.next();
         
      }while (!prgEnde.equals("j"));
   }
}

class Konverter
{
   public float CelsiusToFahrenheit (float celsius) 
   {
      float fahrenheit = (celsius * 1.8f) + 32;	  
      return fahrenheit;
   }
   
   public float FahrenheitToCelsius (float fahrenheit)
   {
      float celsius = (fahrenheit - 32) * 5/9;
      return celsius;
   }
}
