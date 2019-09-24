// Datei: Test.java

public class Test
{
   public static void main (String[] args)
   {
      Stack testStack = new Stack();
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