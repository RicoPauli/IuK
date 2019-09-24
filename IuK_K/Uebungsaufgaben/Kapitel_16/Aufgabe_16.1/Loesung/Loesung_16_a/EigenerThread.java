// Datei: EigenerThread.java

public class EigenerThread extends Thread
{
   public void run()
   {
      for (int a = 0; a <= 5; a++)
      {
         System.out.println ("Hier EigenerThread > " + a);
      }
   }
}