// Datei: ZufallszahlenLeser.java

import java.io.*;

public class ZufallszahlenLeser
{
   public static void main (String[] args)
   {
      int anzahl = 0;
      int summe = 0;
      
      try
      {
         LineNumberReader reader = new LineNumberReader (new FileReader (ZufallszahlenSchreiber.DATEI));
         String str;
         
         while ((str = reader.readLine()) != null)
         {
            try
            {
               summe += Integer.parseInt (str); 
               anzahl++;
            }
            catch (Exception e) 
            {
               System.err.println ("Zahl " + str + " konnte nicht gelesen werden");
            }
         }
         reader.close();
         
         System.out.println ("Es wurden " + anzahl + " Zahlen eingelesen");
         System.out.println ("Die Summe der Zahlen betraegt " + summe + " der Durchschnitt ist " + (float) summe/anzahl);
      } 
      catch (IOException e)
      {
         System.err.println ("Fehler beim Lesen der Datei");
      }
   }
}
