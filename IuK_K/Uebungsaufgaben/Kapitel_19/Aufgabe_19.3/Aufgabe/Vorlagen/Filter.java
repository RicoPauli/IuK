// Datei: Filter.java

import java.io.*; 

public class Filter 
{ 
   public static void main (String args[]) 
   { 
      if (args.length != 2) 
      { 
         System.err.println ("Bitte 2 Parameter: ");
         System.err.println ("<Suchmuster> <Dateiname>"); 
         System.exit (1); 
      } 

      String patt = args [0]; 
      String fileIn = args [1]; 

      try (LineNumberReader reader = new LineNumberReader 
                                      (new FileReader (fileIn)))
      { 
         String str; 

         while ((str = reader.readLine()) != null) 
         { 
            if (str.indexOf (patt) != -1) 
            { 
               int ln = reader.getLineNumber(); 
               System.out.println (fileIn + "[" + ln + "]: " + str); 
            } 
         } 
      } 
      catch (IOException e) 
      { 
         System.err.println ("IO-Fehler beim Filtern"); 
         e.printStackTrace(); 
      } 
   }
} 
