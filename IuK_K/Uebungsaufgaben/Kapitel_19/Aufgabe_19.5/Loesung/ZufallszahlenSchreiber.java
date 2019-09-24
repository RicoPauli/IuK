// Datei: ZufallszahlenSchreiber.java

import java.io.*;
import java.util.Random;

public class ZufallszahlenSchreiber
{
   public static final String DATEI = "zufall.txt";
   
   public static void main (String[] args)
   {
      int anzahl = ZufallszahlenSchreiber.eingabeZahl();
      
      try
      {
         PrintWriter writer = new PrintWriter (new BufferedWriter (new FileWriter (ZufallszahlenSchreiber.DATEI)));
         Random random = new Random (System.currentTimeMillis());
         
         for (int i = 0; i < anzahl; i++)
         {
            writer.println (random.nextInt (1000));
         }
         writer.close();
      }
      catch (IOException e)
      {
         System.err.println ("IO-Fehler beim Schreiben der Datei");
         e.printStackTrace();
      }
   }
   
   public static int eingabeZahl()
   {
      InputStreamReader inp = new InputStreamReader (System.in);
      BufferedReader buffer = new BufferedReader (inp);

      try
      {
         System.out.println ("Anzahl der Zufallszahlen: ");
         String eingabe = buffer.readLine();

         Integer wert = Integer.valueOf (eingabe);
         return wert.intValue();
      }
      catch (IOException ioexcept)
      {
         System.out.println (ioexcept.toString());
      }
      catch (NumberFormatException nFExcept)
      {
         System.out.println (nFExcept.toString());
      }

      return 0;
   }
}
