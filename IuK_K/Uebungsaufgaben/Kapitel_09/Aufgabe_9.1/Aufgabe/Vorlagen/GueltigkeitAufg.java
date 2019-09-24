// Datei: GueltigkeitAufg.java

public class GueltigkeitAufg
{
   private int wert = 7;
   
   public int zugriff()
   {
      int tmp = wert;
      int wert = 77;
      return tmp;
   }

   public static void main (String[] args)
   {
      GueltigkeitAufg guelt = new GueltigkeitAufg();
      System.out.println (guelt.zugriff());
   }
}
