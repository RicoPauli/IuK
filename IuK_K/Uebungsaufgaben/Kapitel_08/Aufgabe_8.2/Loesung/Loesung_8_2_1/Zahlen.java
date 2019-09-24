// Datei: Zahlen.java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zahlen
{
   // Verwenden Sie die Methode eingabeZahl(), 
   // ohne sie genauer zu studieren
   public static int eingabeZahl()
   {
      int wert = -1;
      try
      {
         java.util.Scanner scanner = 
            new java.util.Scanner (System.in);
         System.out.print ("Gib einen Wert ein: ");
         wert = scanner.nextInt();
      }
      catch (Exception e)
      {
         e.printStackTrace();
         System.exit(-1);
      }   
      return wert;
   }

   public static void main (String[] args)
   {
      int zahl = eingabeZahl();

      System.out.print ("Die eingegebene Zahl ist ");
      if (zahl == 1)
      {
         System.out.println ("EINS");
      }
      else if (zahl == 2)
      {
         System.out.println ("ZWEI");
      }
      else if (zahl == 3)
      {
         System.out.println ("DREI");
      }
      else if (zahl == 4)
      {
         System.out.println ("VIER");
      }
      else if (zahl == 5)
      {
         System.out.println ("FUENF");
      }
      else
      {
         System.out.println ("UNBEKANNT");
      }
   }
}
