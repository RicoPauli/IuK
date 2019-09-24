// Datei: Messreihe.java

package messdaten;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Messreihe
{
   protected Messwert[] messwerte;

   public Messreihe (int messwertAnzahl)
   {
      messwerte = new Messwert [messwertAnzahl];
   }

   public void addMesswert (double messwert, GregorianCalendar datum)
   {
      Messwert messdaten = new Messwert (messwert, datum);

      if (messwerte [messwerte.length - 1] == null)
      {
         for (int i = 0; i < messwerte.length; i++)
         {
            if (messwerte [i] == null)
            {
               messwerte [i] = messdaten;
               break;
            }
         }
      }
   }

   public double getMesswert (GregorianCalendar datum)
   {
      GregorianCalendar testDatum;
      double messwert = 0;
      for (int i = 0; i < messwerte.length; i++)
      {
         testDatum = messwerte [i].getMessDatum();
         if (testDatum.equals (datum))
         {
            messwert = messwerte [i].getWert();
            break;
         }
      }
      return messwert;
   }

   public void print()
   {
      GregorianCalendar messDatum;

      System.out.println();
      for (int i = 0; i < messwerte.length && messwerte [i] != null; i++)
      {
         messDatum = messwerte [i].getMessDatum();
         String datum = messDatum.get (Calendar.DAY_OF_MONTH) + "."
               + messDatum.get (Calendar.MONTH) + "."
               + messDatum.get (Calendar.YEAR);

         System.out.print ("Messwert-Nr.: " + messwerte [i].getMesswertID());
         System.out.print (" Messungs-Datum: " + datum);
         System.out.println (" Messwert: " + messwerte [i].getWert());
         System.out.println();
      }
   }
}