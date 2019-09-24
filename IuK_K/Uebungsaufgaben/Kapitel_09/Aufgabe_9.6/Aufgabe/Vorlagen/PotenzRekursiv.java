// Datei: PotenzRekursiv.java

public class PotenzRekursiv
{
   public static . . . . . berechnePotenz (. . . . .)
   {
      . . . . .
   }

   public static void main (String[] args)
   {
      java.util.Scanner scanner = 
                         new java.util.Scanner (System.in);
      try
      {
         System.out.println 
                     ("Gib einen Wert >0 für a ein: ");
         int a = scanner.nextInt();

         System.out.println 
                     ("Gib einen Wert >0 für n ein: ");
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
