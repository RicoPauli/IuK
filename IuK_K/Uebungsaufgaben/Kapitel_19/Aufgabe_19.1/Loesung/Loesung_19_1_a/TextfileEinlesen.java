// Datei: TextfileEinlesen.java

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextfileEinlesen
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
         FileReader reader = new FileReader (dateiname);

         int zeichen;
         while ((zeichen = reader.read()) > 0)
         {
            System.out.print ((char) zeichen);
         }
         reader.close();
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