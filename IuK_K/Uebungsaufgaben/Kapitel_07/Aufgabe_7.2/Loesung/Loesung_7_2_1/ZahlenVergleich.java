// Datei: ZahlenVergleich.java

public class ZahlenVergleich
{
   public static void main(String[] args)
   {
      ZahlenVergleich zahlenVergleich = new ZahlenVergleich();

      int zahl1 = zahlenVergleich.eingabeZahl();
      int zahl2 = zahlenVergleich.eingabeZahl();

      if (zahl1 == zahl2)
      {
         System.out.println("Die Zahlen sind gleich!");
      } 
      
      else
      {
         if (zahl1 > zahl2)
         {
            System.out.println("Die Zahl " + zahl1
                  + " ist groesser als die Zahl " + zahl2 + "!");
         } else
         {
            System.out.println("Die Zahl " + zahl2
                  + " ist groesser als die Zahl " + zahl1 + "!");
         }
      }
   }

   public int eingabeZahl()
   {
      try
      {
         java.util.Scanner scanner = new java.util.Scanner (System.in);
         
         System.out.print ("Gib einen Wert ein: ");
         
         return scanner.nextInt();
      } catch (Exception e)
      {
         System.out.println (e);
         
         System.exit(1);
      }
      
      return -1;
   }
}
