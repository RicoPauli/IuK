// Datei: Reader.java

public class Reader extends Thread
{
   private Stack stack;

   public Reader (Stack stack)
   {
      this.stack = stack;
   }

   public void run()
   {   
      while (true)
      {
         try
         {
            System.out.println ("Reader hat folgende Zahl vom Stack gelesen: " + stack.pop());
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