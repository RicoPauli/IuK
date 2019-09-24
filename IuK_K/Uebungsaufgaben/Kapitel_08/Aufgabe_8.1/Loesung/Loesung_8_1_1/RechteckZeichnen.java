// Datei: RechteckZeichnen.java

public class RechteckZeichnen
{
   static final int BREITE = 20;

   static final int HOEHE = 10;

   public static void main(String[] args)
   {
      int hoehe;  // Zaehlvariable fuer die Hoehe
      int breite; // Zaehlvariable fuer die Breite

      for (breite = 0; breite < BREITE; breite++)
      {
         System.out.print ("*");
      }
      System.out.println();

      for (hoehe = 0; hoehe < HOEHE - 2; hoehe++)
      {
         System.out.print ("*");

         breite = 1;
         for (breite = 1; breite < BREITE - 1; breite++)
         {
            System.out.print (" ");
         }
         System.out.print ("*");
         System.out.println();
      }

      for (breite = 0; breite < BREITE; breite++)
      {
         System.out.print ("*");
      }
   }
}
