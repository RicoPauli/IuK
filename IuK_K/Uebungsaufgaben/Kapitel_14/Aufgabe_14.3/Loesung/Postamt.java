// Datei: Postamt.java

public class Postamt 
{
   public void versende (Versendbar sendung)
   {
      System.out.println ("Sendung wurde entgegengenommen und wird jetzt versandt.");
      System.out.print ("Absender: ");

      for (int i = 0; i < sendung.getAbsender().length; i++)
      {
         System.out.print (sendung.getAbsender() [i] + "\t");
      }

      System.out.println();

      System.out.print ("Empfaenger: ");

      for (int i = 0; i < sendung.getEmpfaenger().length; i++)
      {
         System.out.print (sendung.getEmpfaenger() [i] + "\t");
      }
   }
}
