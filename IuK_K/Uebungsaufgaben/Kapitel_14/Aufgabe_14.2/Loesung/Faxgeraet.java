// Datei: Faxgeraet.java

public class Faxgeraet implements Fax
{
   private static int anzahl;
   private String geraeteId;

   public Faxgeraet()
   {
      anzahl++;
      this.geraeteId = "Fax" + anzahl;
   }

   public void senden (String sendeRef)
   {
      System.out.println ("Absender ist: " + this.geraeteId);
      System.out.println();
      System.out.println (faxsimulation);
      System.out.println (sendeRef);
      System.out.println();
   }
}