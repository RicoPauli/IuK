// Datei: CowboyJim.java

public class CowboyJim
{
   public static void main (String[] args)
   {
      LaufThread laufen = new LaufThread();
      
      KauThread kauen = new KauThread();

      System.out.println ("Lauf Cowboy Jim, lauf .....");
      
      System.out.println ("\n\n");

      laufen.start();
      
      kauen.start();
   }
}