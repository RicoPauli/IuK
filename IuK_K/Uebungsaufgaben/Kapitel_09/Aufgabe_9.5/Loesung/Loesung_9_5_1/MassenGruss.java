// Datei: MassenGruss.java

public class MassenGruss
{
   public static void main (String[] args)
   {
      if (args.length < 1)
      {
         System.out.println ("Argument fehlt");
      }       
      else
      {
         try
         {
            int anzahl = Integer.parseInt (args[0]);

            for (int i = 0; i < anzahl; i++)
            {
               System.out.println ("Hallo, Welt!");
            }
         }         
         catch (Exception ex)
         {
            System.out.println (ex.toString());
         }
      }
   }
}