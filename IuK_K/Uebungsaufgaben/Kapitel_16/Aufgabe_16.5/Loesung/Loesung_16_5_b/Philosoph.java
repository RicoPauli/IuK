// Datei: Philosoph.java

import java.util.*;

public class Philosoph extends Thread
{
   private Gabel linkeGabel;
   private Gabel rechteGabel;
   private int philosophId;
   private static int anzahl;
   private Random rnd;

   public Philosoph (Gabel links, Gabel rechts)
   {
      linkeGabel = links;
      rechteGabel = rechts;
      philosophId = ++anzahl;
      rnd = new Random (System.currentTimeMillis() + anzahl);
   }

   public void run()
   {
      while (true)
      {
         System.out.println ("Philosoph " + philosophId + " denkt!");
         try
         {
            sleep (rnd.nextInt (4000) + 1000);
         }
         catch (InterruptedException e1)
         {
            break;
         }
         
         try
         {
            linkeGabel.aufheben();

            try
            {
               rechteGabel.aufheben();
               System.out.println ("Philosoph " + philosophId + " isst!");
               
               try
               {
                  sleep (rnd.nextInt (2000) + 1000);
               }
               catch (InterruptedException e1)
               {
                  break;
               }
               
               linkeGabel.hinlegen();
               rechteGabel.hinlegen();
            }
            catch (GabelBelegtException e)
            {
               linkeGabel.hinlegen();
            }
         }
         catch (GabelBelegtException e)
         {
         }
      }
   }
}