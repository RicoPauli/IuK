// Datei: Zeichen.java

public class Zeichen
{
   // Beachten Sie die Deklaration der Methode main() nicht
   public static void main (String[] args) throws java.io.IOException
   {
      int c = 0;
      int anzahl = 0;
      int anzahlLeerzeichen = 0;
      
      while (c != -1)
      {
         // System.in.read() gibt einen int-Wert im Bereich 0 bis
         // 255 zurueck. -1 wird zurueckgegeben, wenn kein Zeichen
         // mehr im Dateipuffer steht.
         c = System.in.read();
         if (c != -1)
         {
            // mit (char)c wird die int-Variable c
            // in ein Zeichen gewandelt
            System.out.println ("ASCII-Code: " + c + 
                                " Zeichen: " + (char) c);
            anzahl = anzahl + 1;
            if (c == ' ')
            {
               anzahlLeerzeichen = anzahlLeerzeichen + 1;
            }
         }
      }
      System.out.println ("Anzahl Zeichen: " + anzahl);
      System.out.println ("Anzahl Leerzeichen: " +
                          anzahlLeerzeichen);
   }
}
