// Datei: Iteration.java

public class Iteration
{
   public int iterativAufruf (int n)
   {
      int wert = 1;

      for (int i = 2; i <= n; i++)
      {
         wert *= i;
      }
      return wert;
   }

   public static void main (String[] args)
   {
      Iteration it = new Iteration();
      System.out.println (it.iterativAufruf (4));
   }
}
