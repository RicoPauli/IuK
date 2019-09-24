// Datei: Kombigeraet.java

public class Kombigeraet implements Drucker, Fax
{
   private static int anzahl;
   private String geraeteId;

   public Kombigeraet()
   {
      anzahl++;
      this.geraeteId = "Kombigeraet" + anzahl;
   }

   public void drucken (String druckRef)
   {
      System.out.println ("Kombigeraet " + this.geraeteId + " meldet sich");
      System.out.println();
      System.out.println (drucksimulation);
      System.out.println (druckRef);
      System.out.println();
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