// Datei: PhilosophenTest.java

public class PhilosophenTest
{
   private static int ANZAHL_PHILOSOPHEN = 5;
   
   public static void main (String[] args)
   {
      Gabel[] gabeln = new Gabel [ANZAHL_PHILOSOPHEN];
      Philosoph[] philosophen = new Philosoph [ANZAHL_PHILOSOPHEN];
      
      for (int i = 0; i < ANZAHL_PHILOSOPHEN; i++ )
      {
         gabeln [i] = new Gabel();
      }
      
      System.out.println ("Methode main(): *** Starte Philosophen-Threads! ***");
      for (int i = 0; i < ANZAHL_PHILOSOPHEN; i++)
      {
         int zweiteGabel = i + 1;
         if (zweiteGabel == ANZAHL_PHILOSOPHEN) 
            zweiteGabel = 0;
         philosophen [i] = new Philosoph (gabeln [i], gabeln [zweiteGabel]);
         philosophen [i].start();
      }

      try
      {
         Thread.sleep (10000);
      }
      catch (InterruptedException e1)
      {
      }
      
      for (int i = 0; i < philosophen.length; i++)
      {
         philosophen [i].interrupt();
         try
         {
            philosophen [i].join();
         }
         catch (InterruptedException e)
         {
         }
      }

      System.out.println ("Methode main(): *** Alle Threads wurden beendet! ***");
   }
}
