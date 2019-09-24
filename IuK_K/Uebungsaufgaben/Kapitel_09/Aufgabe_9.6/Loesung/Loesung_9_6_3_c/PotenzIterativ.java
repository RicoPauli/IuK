// Datei: PotenzIterativ.java

public class PotenzIterativ
{
   public static int berechnePotenz (int basis, int exponent)
   {
      int ergebnis;

      if (basis == 0)
      {
         ergebnis = 0;
      }       
	  else
      {
         ergebnis = 1;
         for (int i = 1; i <= exponent; i++)
         {
            ergebnis *= basis;
         }
      }
      return ergebnis;
   }

   public static void main (String [] args)
   {
      java.util.Scanner scanner = 
                         new java.util.Scanner (System.in);
      try
      {
         System.out.println 
                     ("Gib einen Wert >0 fuer a ein: ");
         int a = scanner.nextInt();

         System.out.println 
                     ("Gib einen Wert >0 fuer n ein: ");
         int n = scanner.nextInt();

         int ergebnis = berechnePotenz (a, n);
         System.out.println ("Das Ergebnis ist: " +
                              ergebnis);
      }
      catch (Exception ex)
      {
         System.out.println (ex.toString());
      }
   }
}

