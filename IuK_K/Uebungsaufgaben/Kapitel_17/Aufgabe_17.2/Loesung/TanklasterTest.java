// Datei: TanklasterTest.java

import java.util.ArrayList;
import java.util.Arrays;

public class TanklasterTest
{
   public static void main (String[] args)
   {
      Tanklaster[] lasterArr = new Tanklaster[3];
      
      // Anlegen dreier neuer Tanklaster	  
      lasterArr[0] = new Tanklaster ("Maimler - Tankstelle Lara", 25000d, 1.5d);
      lasterArr[1] = new Tanklaster ("Nam - Tankstelle Muschel", 25000d, 1.7d);
      lasterArr[2] = new Tanklaster ("WV - Tankstelle Osse", 2500d, 1.7d);
      
      // Unterschiedliches Befuellen der angelegten Laster
      lasterArr[0].befuelle (lasterArr[0].getMaxFuellmenge());
      lasterArr[1].befuelle (50000d);
      lasterArr[2].befuelle (1000d);

      // Anlegen einer neuen, leeren Ergebnis-Collection
      ArrayList<Tanklaster> list = new ArrayList<Tanklaster>();
      
      System.out.println ("Nicht volle Laster:\n");
      // Befuellen der Ergebnis-Collection mit nicht vollen Lastern
      TanklasterUtils.ermittleNichtVolleLaster (Arrays.asList (lasterArr), list);
      // Ausgeben der Collection auf dem Schirm
      TanklasterUtils.printLasterFuellstand (list);
	  
      // Saeubern der Ergebnis-Collection, um sie wiederzuverwenden
      list.clear();
      
      System.out.println ("\nVolle Laster:\n");
      // Befuellen der Ergebnis-Collection mit vollen Lastern
      TanklasterUtils.ermittleVolleLaster (Arrays.asList (lasterArr), list);
      // Ausgeben der Collection auf dem Schirm
      TanklasterUtils.printLasterFuellstand (list);
   }
}
