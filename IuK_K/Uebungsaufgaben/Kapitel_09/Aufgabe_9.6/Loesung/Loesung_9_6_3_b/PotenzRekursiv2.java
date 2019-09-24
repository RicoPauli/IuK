// Datei: PotenzRekursiv2.java

public class PotenzRekursiv2
{
   public static int berechnePotenz (int basis, int exponent)
   {
      if (basis == 0)
      {
         return 0;
      }
      
      if (exponent == 0)
      {
         return 1;
      }
      
      if (exponent == 1)
      {
         return basis;
      }

      return basis * berechnePotenz(basis, exponent - 1);
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
