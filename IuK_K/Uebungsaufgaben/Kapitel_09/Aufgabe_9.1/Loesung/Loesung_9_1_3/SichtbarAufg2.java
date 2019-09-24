// Datei: SichtbarAufg2.java

public class SichtbarAufg2
{
   private int wert = 7;
   
   public int zugriff()
   {
      int wert = 77;
      return this.wert;
   }

   public static void main (String [] args)
   {
      SichtbarAufg2 sich = new SichtbarAufg2();

      System.out.println (sich.zugriff());
   }
}
