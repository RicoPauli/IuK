// Datei: Reader.java

import java.util.concurrent.BlockingDeque;

public class Reader extends Thread
{
   private BlockingDeque<Integer> stack;

   public Reader (BlockingDeque<Integer> stack)
   {
      this.stack = stack;
   }

   public void run()
   {   
      while (true)
      {
         try
         {
            System.out.println ("Reader hat folgende Zahl vom Stack gelesen: " + stack.takeFirst());
         }
         catch (InterruptedException ex)
         {
            return; // Der writer Tread wurde beendet. Deshalb wurde fuer den
                    // reader Thread die interrupt()-Methode aufgerufen, um
                    // den reader Thread aus dem Wartezustand zu befreien und
                    // die run()-Methode zu beenden. Ansonsten Gefahr eines
                    // Deadlocks.
         }    
      }
   }
}