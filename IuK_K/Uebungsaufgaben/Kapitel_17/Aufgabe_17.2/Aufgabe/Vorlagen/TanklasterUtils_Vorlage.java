// Datei: TanklasterUtils_Vorlage.java
import java.util.Collection;

public class TanklasterUtils
{
   // Statische Methode zum Ermitteln aller nicht vollen Laster in
   // einer Collection. Diese Methode soll als ersten Parameter alle
   // von Collection abgeleiteten Typen akzeptieren, die Referenzen
   // auf Tanklaster-Objekte - oder auf Objekte eines Subtyps -
   // enthalten. Als zweiten Parameter sollen alle von Collection 
   // abgeleiteten Typen akzeptiert werden, die Referenzen auf 
   // Tanklaster-Objekte - oder auf Objekte eines Basistyps - 
   // enthalten. 
   public static <T . . . . Collection< . . . . . . . >,
      R . . . . Collection< . . . . . . . >>
      void ermittleNichtVolleLaster
      (T alleLaster, R NichtVolleLaster)
   {
      // Collection der Tanklaster nach nicht vollen Lastern 
      // durchsuchen.
      for (Tanklaster l : alleLaster)
      {
         // Prüfe, ob Tanklaster nicht voll.
         if ( . . . . . . . . )
         {
            // Gefundenen Laster zur Collection hinzufügen.
            . . . . . . . .
         }
      }
   }
   
   // Statische Methode zum Ermitteln aller vollen Laster in einer 
   // Collection.
   // Alle Einschränkungen für Typen, die von der Methode
   // ermittleNichtVolleLaster() akzeptiert werden, gelten auch für
   // diese Methode.
   public static <T . . . . Collection< . . . . . . . >,
      R . . . . Collection< . . . . . . . >>
      void ermittleVolleLaster (T alleLaster, R volleLaster)
   {
      // Collection der Tanklaster wird durchsucht nach vollen
      // Lastern
      for (Tanklaster l : alleLaster)
      {
         // Prüfe, ob Laster voll.
         if ( . . . . . . . . )
         {
            // Gefundenen Laster zur Collection hinzufügen
            . . . . . . . .
         }
      }
   }
      
   // Statische Methode, um alle Tanklaster in einer Collection 
   // auf dem Bildschirm auszugeben. Diese Methode soll als ersten 
   // Parameter alle von Collection abgeleiteten Typen akzeptieren,
   // die Referenzen auf Tanklaster-Objekte - oder auf Objekte 
   // eines Subtyps - enthalten. 
   public static <T . . . . Collection< . . . . . . . >>
      void printLasterFuellstand (T laster)
   {
      for (Tanklaster l : laster)
      {
         l.print();
         System.out.println ("-----------");
      }
   }
}
