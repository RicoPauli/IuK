// Datei: ZahlThread.java

import java.util.Random;

public class ZahlThread extends Thread
{
   private Zwischenspeicher speicher;
   private String name;
   private Random rnd;

   public ZahlThread (Zwischenspeicher speicher, String name)
   {
      this.speicher = speicher;
      this.name = name;
      this.rnd = new Random();
   }

   public void run()
   {
      System.out.println ("Starte Thread: " + name + " ....");
      int wertVorher;
      int wertNachher;

      for (int i = 0; i < 5; i++)
      {
         wertVorher = rnd.nextInt (100);
         
         synchronized (this.speicher)
         {
            speicher.setWert (wertVorher);

            try
            {
               sleep (2000);
            }
            catch (InterruptedException ex)
            {
            }

            wertNachher = speicher.getWert();
         }

         if (wertVorher == wertNachher)
         {
            System.out.println (name + ": Zahlenvergleich OK! Wert vorher: " + wertVorher + " Wert nachher: " + wertNachher);
         }
         else
         {
            System.out.println (name + ": Die Werte vor und nach dem Aufruf von sleep() sind verschieden! Wert vorher: " + wertVorher + " Wert nachher: " + wertNachher);
         }
      }

      System.out.println ("Beende Thread: " + name + "....");
   }
}