// Datei: DreieckZeichnen.java

public class DreieckZeichnen
{
   static final int HOEHE = 5;

   public static void main (String[] args)
   {
      for (int zeile = 1; zeile <= HOEHE; zeile++)
      {
         for (int i = 1; i <= HOEHE - zeile; i++)
         {
            System.out.print (" ");
         }

         for (int j = 1; j <= zeile * 2 - 1; j++)
         {
            System.out.print ("*");
         }

         System.out.println();
      }
   }
}
