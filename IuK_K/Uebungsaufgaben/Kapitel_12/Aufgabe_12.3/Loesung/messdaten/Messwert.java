// Datei: Messwert.java

package messdaten;

import java.util.GregorianCalendar;

class Messwert
{
   private static int anzahlMesswerte;
   private double wert;
   private GregorianCalendar messDatum;
   private int messwertID;

   Messwert (double messwert, GregorianCalendar messDatum)
   {
      messwertID = anzahlMesswerte++;
      this.wert = messwert;
      this.messDatum = messDatum;
   }

   protected double getWert()
   {
      return wert;
   }

   protected GregorianCalendar getMessDatum()
   {
      return messDatum;
   }

   protected int getMesswertID()
   {
      return messwertID;
   }
}