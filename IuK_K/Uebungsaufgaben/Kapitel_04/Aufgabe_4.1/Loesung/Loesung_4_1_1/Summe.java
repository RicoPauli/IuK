// Datei Summe.java

public class Summe
{
   public static void main (String[] args)
   {
      final int UPPER = 9;
      int summe = 0;
   
      for (int lv = 1; lv <= UPPER; lv = lv + 1) 
      {
         summe = summe + lv;
         System.out.println ("Neue Summe ist: " + summe);
      }
      System.out.println ("Die Endsumme der Zahlen von 1 bis "
                          + UPPER + " ist: " + summe);
   }
}
