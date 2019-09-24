// Datei: ExpliziteKonvertierung.java

public class ExpliziteKonvertierung
{
   public static void main (String[] args)
   {
      int k;
      float f = 1.5f, g;
      k = 10 * (int) f;
      g = 10 * f;
      System.out.println ("Multiplikation (int)1.5f * 10: " 
                          + k);
      System.out.println ("Multiplikation 1.5f * 10: " + g);
   }
}
