// Datei: LaufThread.java

public class LaufThread extends Thread
{
   public void run()
   {
      for (int i = 0; i < 1000; i++)
      {
         System.out.println ("links... ");
         
         System.out.println ("rechts... ");
      }
   }
}