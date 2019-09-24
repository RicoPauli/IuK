// Datei: Writer.java

public class Writer extends Thread
{
   private Stack stack;

   public Writer (Stack stack)
   {
      this.stack = stack;
   }

   public void run()
   {
      for (int i = 0; i < 100; i++)
      {
         try
         {
            stack.push (i);
            System.out.println ("Writer hat folgende Zahl auf den Stack geschrieben: " + i);
         }
         catch (InterruptedException e)
         {
            return;
         }
      }
   }
}