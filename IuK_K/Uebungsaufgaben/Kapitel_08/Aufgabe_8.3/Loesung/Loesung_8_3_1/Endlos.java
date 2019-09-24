// Datei: Endlos.java

public class Endlos
{
   public static void main (String[] args)
   {
      int i = 0;
      while (true)
      {
         i++;
         System.out.println (i);

         if (i == 10)
         {
            break;
         }
      }
   }
}