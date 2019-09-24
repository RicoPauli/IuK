// Datei: Ggt.java

public class Ggt
{
   public static void main (String[] args)
   {
      int x = 24;
      int y = 9;

      while (x != y)
      {
         if (x > y)
         {
            x -= y;
         }
	 else
         {
            y -= x;
         }
      }
      System.out.println ("Groesster gemeinsamer Teiler = " + x);
   }
}
