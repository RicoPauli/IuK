// Datei: FormatTest.java

import java.util.Calendar;

public class FormatTest
{
   // Klassenmethode zur formatierten Ausgabe von Datum und Zeit
   public static void main (String[] args)
   {
      Calendar calendar = Calendar.getInstance();
      
      // Zusammensetzen vom Datum
      String datum = String.format ("%1$d-%2$d-%3$d", 
            calendar.get (Calendar.YEAR), 
            calendar.get (Calendar.MONTH)+1, 
            calendar.get (Calendar.DAY_OF_MONTH));
      
      // Zusammensetzen von der Zeit
      String zeit = String.format ("%1$d:%2$d:%3$d", 
            calendar.get (Calendar.HOUR_OF_DAY),
            calendar.get (Calendar.MINUTE), 
            calendar.get (Calendar.SECOND));
            
      System.out.printf ("%1$s %n", datum);
      System.out.printf ("%1$s", zeit);
   }
}
