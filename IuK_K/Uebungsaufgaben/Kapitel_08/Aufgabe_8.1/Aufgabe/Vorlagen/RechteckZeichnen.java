// Datei: RechteckZeichnen.java

public class RechteckZeichnen
{
   static final int BREITE = 20;
   static final int HOEHE = 10;

   public static void main (String[] args)
   {
      int hoehe;    // Zaehlvariable für die Hoehe
      int breite;   // Zaehlvariable für die Breite
      breite = 0;
      do
      {
         System.out.print ("*");
         breite++;
      }
      while (breite < BREITE);

      System.out.println();
      hoehe = 0;
      while (hoehe < HOEHE - 2)
      {
         System.out.print ("*");

         breite = 1;
         do
         {
            System.out.print (" ");
            breite++;
         }
         while (breite < BREITE - 1);
         System.out.println ("*");
         hoehe++;
      }

      breite = 0;
      while (breite < BREITE)
      {
         System.out.print ("*");
         breite++;
      }
      System.out.println();
   }
}
