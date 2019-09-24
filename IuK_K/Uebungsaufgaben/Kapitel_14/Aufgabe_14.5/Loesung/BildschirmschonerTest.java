// Datei: BildschirmschonerTest.java

import java.util.Random;

public class BildschirmschonerTest
{
   public static void main (String [] args)
   {
      Random random = new Random();

      for (int i = 0; i <= 10; i++)
      {
         Object koerper;
         if (random.nextBoolean())
         {
            koerper = new Kreis (2.0f);
         }
         else
         {
            koerper = new Quadrat (3.0f);
         }

         if (koerper instanceof Position)
         {
            Position position = (Position) koerper;
            position.verschiebe (random.nextFloat(),
                                 random.nextFloat());
         }
         if (koerper instanceof Groesse)
         {
            Groesse groesse = (Groesse) koerper;
            try
            {
               groesse.aendereGroesse (random.nextFloat()-0.5f);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      }
   }
}
