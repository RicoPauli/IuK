// Datei: SichtbarAufg.java

public class SichtbarAufg
{
   private int wert = 7;
   
   public int zugriff()
   {
      int wert = 77;
      return wert;
   }

   public static void main (String [] args)
   {
      SichtbarAufg sich = new SichtbarAufg();
      System.out.println (sich.zugriff());
   }
}
