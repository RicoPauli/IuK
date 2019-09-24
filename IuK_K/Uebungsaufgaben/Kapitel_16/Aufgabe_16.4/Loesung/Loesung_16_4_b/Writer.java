// Datei: Writer.java

import java.util.concurrent.BlockingDeque;

public class Writer extends Thread
{
   private BlockingDeque<Integer> stack;

   public Writer (BlockingDeque<Integer> stack)
   {
      this.stack = stack;
   }

   public void run()
   {
      for (int i = 0; i < 100; i++)
      {
         try
         {
            stack.putFirst (i);
            System.out.println ("Writer hat folgende Zahl auf den Stack geschrieben: " + i);
         }
         catch (InterruptedException e)
         {
            return;
         }
      }
   }
}