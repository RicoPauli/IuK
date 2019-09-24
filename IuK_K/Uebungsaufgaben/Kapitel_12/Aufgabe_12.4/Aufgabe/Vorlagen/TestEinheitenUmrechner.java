// Datei: TestEinheitenUmrechner_Vorlage.java

import umrechnung.tools.Umrechner; 
 
public class TestEinheitenUmrechner  
{ 
   public static void main (String[] args)  
   { 
      float km = 100f; 
      float kmInMeilen; 
      float meilen = 250.35f; 
      float meilenInKm; 
      float celsius = 0f; 
      float celsiusInFahrenheit; 
      float fahrenheit = 85f; 
      float fahrenheitInCelsius; 
 
      kmInMeilen = Umrechner.kmNachMeilen (km); 
      meilenInKm = Umrechner.meilenNachKm (meilen); 
      celsiusInFahrenheit = 
                       Umrechner.celsiusNachFahrenheit (celsius); 
      fahrenheitInCelsius =  
                  Umrechner.fahrenheitNachCelsius (fahrenheit);
      System.out.println (km + " km entsprechen " +  
                          kmInMeilen + " Meilen"); 
      System.out.println (meilen + " Meilen entsprechen " +  
                          meilenInKm + " km"); 
      System.out.println (celsius + " °C entsprechen " +  
                          celsiusInFahrenheit + " °F"); 
      System.out.println (fahrenheit + " °F entsprechen " +  
                          fahrenheitInCelsius + " °C"); 
   } 
}