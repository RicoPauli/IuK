// Datei: UngeradeZahlen.java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UngeradeZahlen
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
      int startwert = -1;
      int endwert = -1;

      System.out.println ("Dieses Programm gibt alle " +
                          "ungeraden Zahlen zwischen " +
                          "dem Startwert und Endwert aus.");
      System.out.print ("Gib den Startwert ein: ");
      startwert = eingabeZahl();

      do
      {
         System.out.print ("Gib den Endwert ein: ");
         endwert = eingabeZahl();
         System.out.println();
      } while (endwert < startwert);

      for (int i = startwert; i <= endwert; i++)
      {
         . . . . .

         System.out.println 
            ("Die Zahl " + i + " ist ungerade!");
      }
   }
}
