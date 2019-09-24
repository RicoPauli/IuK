// Datei: Filter.java

import java.io.*;

public class Filter
{
   public static void main (String[] args)
   {
      if (args.length != 3)
      {
         System.err.println ("Bitte 3 Parameter: ");
         System.err.println ("<Suchmuster> <Dateiname> <Ausgabedatei>");
         System.exit (1);
      }

      String patt = args [0];
      String fileIn = args [1];
      String fileOut = args [2];

      try
      {
         LineNumberReader reader = new LineNumberReader (new FileReader (fileIn));
         PrintWriter writer = new PrintWriter (new BufferedWriter (new FileWriter (fileOut)));

         String str;

         while ((str = reader.readLine()) != null)
         {
            if (str.indexOf (patt) != -1)
            {
               int ln = reader.getLineNumber();
               writer.println (fileIn + "[" + ln + "]: " + str);
            }
         }
         reader.close();
         writer.close();
      }
      catch (IOException e)
      {
         System.err.println ("IO-Fehler beim Filtern");
      }
   }
}