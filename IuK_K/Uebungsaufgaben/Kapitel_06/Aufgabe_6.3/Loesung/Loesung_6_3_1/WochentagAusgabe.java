// Datei: WochentagAusgabe.java

public class WochentagAusgabe
{
   public static void main (String[] args)
   {
      Wochentag[] tage = Wochentag.values();
      
      for (int i = 0; i < tage.length; i++) 
      {
         Wochentag wochentag = tage[i];
         
         System.out.println (wochentag + " ist der " + (wochentag.ordinal() + 1) + ". Tag der Woche");
      }
   }
}