// Datei: Teilen.java

public class Teilen
{
   public static void main (String[] args)
   {
      int zaehler = 4;
      int nenner = 0;

      try
      {
         System.out.println ("Das Ergebnis von " + zaehler + "/" + nenner + " ist " + zaehler / nenner);
      }
      
      catch (ArithmeticException e)
      {
         e.printStackTrace();
      }
   }
}