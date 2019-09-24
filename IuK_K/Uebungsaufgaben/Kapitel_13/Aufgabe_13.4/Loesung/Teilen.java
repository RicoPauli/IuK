// Datei: Teilen.java

public class Teilen
{
   private static int zaehler;
   private static int nenner;
   
   public static void main(String[] args) 
   {
      zaehler = 3;
      nenner = 0;

      assert (nenner != 0) : "Der Nenner ist zu klein";
      
      zaehler = zaehler/nenner;
         
      System.out.println(zaehler);
   }
}
