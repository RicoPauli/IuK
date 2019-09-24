// Datei: Kombigeraet.java

public class Kombigeraet implements Drucker, Fax, Cloneable
{
   private static int anzahl;
   private String geraeteId;
   private int anzahlDruckpapier;

   public Kombigeraet (int anzahlDruckpapier)
   {
      anzahl++;
      this.geraeteId = "Kombigeraet" + anzahl;
      this.anzahlDruckpapier = anzahlDruckpapier;
   }

   public void drucken (String druckRef)
   {
      System.out.println ("Kombigeraet " + this.geraeteId + " meldet sich");
      System.out.println();
      System.out.println (drucksimulation);
      System.out.println ("Laserdrucker hat noch " + --anzahlDruckpapier +
      " Druckpapier(e)");
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
   
   public void setGeraeteId (String Id)
   {
      this.geraeteId = Id;
   }

   @Override
   public Kombigeraet clone() throws CloneNotSupportedException
   {
      Kombigeraet neuesKombigeraet = (Kombigeraet) super.clone();
      anzahl++;
      neuesKombigeraet.setGeraeteId ("Kombigeraet" + anzahl);

      return neuesKombigeraet;
   }
}