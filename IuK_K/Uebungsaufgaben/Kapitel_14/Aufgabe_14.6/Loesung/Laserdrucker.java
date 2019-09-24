// Datei: Laserdrucker.java

public class Laserdrucker implements Drucker, Cloneable
{
   private static int anzahl;
   private String geraeteId;
   private int anzahlDruckpapier;

   public Laserdrucker (int anzahlDruckpapier)
   {
      anzahl++;
      this.geraeteId = "Laser" + anzahl;
      this.anzahlDruckpapier = anzahlDruckpapier;
   }

   public void drucken (String druckRef)
   {
      System.out.println ("Drucker " + this.geraeteId + " meldet sich");
      System.out.println();
      System.out.println (drucksimulation);
      System.out.println ("Laserdrucker hat noch " + --anzahlDruckpapier +
      " Druckpapier(e)");
      System.out.println (druckRef);
      System.out.println();
   }
   
   public void setGeraeteId (String Id)
   {
      this.geraeteId = Id;
   }
   
   @Override
   public Laserdrucker clone() throws CloneNotSupportedException
   {
      Laserdrucker neuerLaserdrucker = (Laserdrucker) super.clone();
      anzahl++;
      neuerLaserdrucker.setGeraeteId ("Laser" + anzahl);

      return neuerLaserdrucker;
   }
}