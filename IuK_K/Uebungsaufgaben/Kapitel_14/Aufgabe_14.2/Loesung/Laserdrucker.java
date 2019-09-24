// Datei: Laserdrucker.java

public class Laserdrucker implements Drucker
{
   private static int anzahl;
   private String geraeteId;

   public Laserdrucker()
   {
      anzahl++;
      this.geraeteId = "Laser" + anzahl;
   }

   public void drucken (String druckRef)
   {
      System.out.println ("Drucker " + this.geraeteId + " meldet sich");
      System.out.println();
      System.out.println (drucksimulation);
      System.out.println (druckRef);
      System.out.println();
   }
}