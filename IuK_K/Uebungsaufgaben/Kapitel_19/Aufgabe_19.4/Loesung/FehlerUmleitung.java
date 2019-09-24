// Datei: FehlerUmleitung.java

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FehlerUmleitung
{
   public static void main (String[] args)
   {
      try
      {
         PrintStream fehlerausgabe = new PrintStream (new FileOutputStream ("error.log"));
         System.setErr (fehlerausgabe);
         
         System.out.println ("Ausgabe auf der Standardausgabe");
         System.err.println ("Ausgabe auf der Fehlerausgabe");
         System.err.println ("Die Fehlerausgabe wird nun in eine Datei umgeleitet");
         System.out.println ("Die Standardausgabe erscheint auf der Konsole");
         System.err.println ("Fehler werden auf der Konsole nicht mehr angezeigt");
      }
      catch (IOException e) 
      {
         System.err.println ("Fehler beim Erzeugen der Ausgabedatei");
      }
   }
}