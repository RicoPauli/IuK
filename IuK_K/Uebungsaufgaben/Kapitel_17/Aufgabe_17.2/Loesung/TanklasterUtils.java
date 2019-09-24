// Datei: TanklasterUtils.java

import java.util.Collection;

public class TanklasterUtils
{
   // Statische Methode zum Ermitteln aller nicht voller Laster in einer Collection.
   // Diese Methode akzeptiert als ersten Parameter ALLE VON COLLECTION ABGELEITETE Typen,
   // die Referenzen auf Tanklaster - oder einen SUBTYP davon - enthalten. Der konkrete Typ,
   // den die Collection akzeptiert, ist dabei nicht interessant.
   // Als zweiten Parameter werden ALLE VON COLLECTION ABGELEITETE Typen akzeptiert,
   // die Referenzen auf Tanklaster - oder einen BASISTYP davon - enthalten. Der konkrete Typ,
   // den die Collection akzeptiert, ist dabei wiederum nicht interessant.
   public static <T extends Collection<? extends Tanklaster>,
                  R extends Collection<? super Tanklaster>> void ermittleNichtVolleLaster
                  (T alleLaster, R nichtVolleLaster)
   {
      // Collection der Tanklaster wird durchsucht nach nicht vollen Lastern
      for (Tanklaster l : alleLaster)
      {
         // Wird ein nicht voller Laster gefunden, so wird er in die Ergebnis-Collection eingetragen
         if (istLeer (l) || l.getMaxFuellmenge() > l.getFuellstand())
         {
            nichtVolleLaster.add (l);
         }
      }
   }
   
   // Statische Methode zum Ermitteln aller voller Laster in einer Collection.
   // Alle Einschraenkungen fuer Typen, die von der Methode ermittleNichtVolleLaster() akzeptiert werden,
   // gelten auch fuer diese Methode.
   public static <T extends Collection<? extends Tanklaster>,
                  R extends Collection<? super Tanklaster>> void ermittleVolleLaster
                  (T alleLaster, R volleLaster)
   {
      // Collection der Tanklaster wird durchsucht nach vollen Lastern
      for (Tanklaster l : alleLaster)
      {
	     // Wird ein voller Laster gefunden, so wird er in die Ergebnis-Collection eingetragen
         if (!istLeer (l) && l.getMaxFuellmenge() == l.getFuellstand())
         {
            volleLaster.add (l);
         }
      }
   }
   
   // Statische Hilfsmethode, um festzustellen, ob ein Tanklaster leer ist oder nicht.
   // Akzeptiert werden alle von Tanklaster abgeleitete Typen.
   public static <T extends Tanklaster> boolean istLeer (T laster)
   {
      return laster.getFuellstand() == 0;
   }
   
   // Statische Methode, um alle Tanklaster in einer Collection auszugeben.
   // Diese Methode akzeptiert als ersten Parameter ALLE VON COLLECTION ABGELEITETE Typen,
   // die Referenzen auf Tanklaster - oder einen SUBTYP davon - enthalten. Der konkrete Typ,
   // den die Collection akzeptiert, ist dabei nicht interessant.
   public static <T extends Collection<? extends Tanklaster>> void printLasterFuellstand (T laster)
   {
      for (Tanklaster l : laster)
      {
         l.print();
         System.out.println ("-----------");
      }
   }
}
