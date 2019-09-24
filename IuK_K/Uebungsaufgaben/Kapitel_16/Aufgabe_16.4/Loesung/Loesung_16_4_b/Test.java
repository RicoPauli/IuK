// Datei: Test.java

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Test
{
   public static void main (String[] args)
   {
      BlockingDeque<Integer> testStack = new LinkedBlockingDeque<Integer>();
      
      Writer testWriter = new Writer (testStack);
      Reader testReader = new Reader (testStack);
      System.out.println ("Methode main(): *** Die Threads werden jetzt gestartet! ***");

      try
      {
         testWriter.start();
         testReader.start();
         testWriter.join();
         testReader.interrupt();
         testReader.join();
         System.out.println ("Methode main(): *** Die Threads wurden beendet! ***");
      }
      catch (InterruptedException e1)
      {
      }
   }
}