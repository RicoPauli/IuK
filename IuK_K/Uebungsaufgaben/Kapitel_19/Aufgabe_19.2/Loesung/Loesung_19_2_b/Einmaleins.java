// Datei: Einmaleins.java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Einmaleins
{
   public static void main (String[] args)
   {
      String dateiname = "einmaleins.txt";
      
      if (args.length == 1) 
      { 
         try
         {
            int groesse = Integer.parseInt (args [0]);
            
            PrintWriter writer = new PrintWriter (new BufferedWriter (new FileWriter (dateiname)));

            for (int i = 1; i <= groesse; i++)
            {
               for (int j = 1; j <= groesse; j++)
               {
                  writer.print (i * j + "\t");
               }
               writer.println();
            }

            writer.close();
         }
         catch (NumberFormatException e) 
         {
            System.err.println ("Fehler beim Einlesen der Groesse");
         }
         catch (IOException e)
         {
            System.err.println ("Fehler beim Schreiben in die Datei");
         }
      }
   }
}