// Datei: UmgekehrteZeilenreihenfolge.java

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class UmgekehrteZeilenreihenfolge
{
   public static void main (String[] args)
   {
      if (args.length != 1)
      {
         System.err.println ("Bitte Dateinamen angeben");
         System.exit (1);
      }

      String dateiname = args [0];

      try
      {
         FileInputStream fis = new FileInputStream (dateiname);
         InputStreamReader reader = new InputStreamReader (fis);

         int zeichen;
         StringBuilder zeichenBuilder = new StringBuilder();
         String dateiInhalt;
         String[] zeilen;

         while ((zeichen = reader.read()) > 0)
         {
            zeichenBuilder.append ((char) zeichen);
         }
         reader.close();

         dateiInhalt = new String (zeichenBuilder);
         zeilen = dateiInhalt.split ("\\n");

         for (int i = zeilen.length - 1; i >= 0; i--)
         {
            System.out.println (zeilen [i]);
         }
      }
      catch (FileNotFoundException e)
      {
         System.err.println ("Datei konnte nicht gefunden werden");
      }
      catch (IOException e)
      {
         System.err.println ("Fehler beim Zugriff auf die Datei");
      }
   }
}
