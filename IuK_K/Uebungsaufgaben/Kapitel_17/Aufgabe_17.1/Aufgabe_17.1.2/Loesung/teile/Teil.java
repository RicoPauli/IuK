// Datei: Teil.java

package teile;

public abstract class Teil<T extends Number> 
{
   private int anzahl;
   private String bezeichnung;
   private String ausfuehrung;
   private T toleranz;
   
   public Teil (int anzahl, String bezeichnung, String ausfuehrung, T toleranz)
   {
      this.anzahl = anzahl;
      this.bezeichnung = bezeichnung;
      this.ausfuehrung = ausfuehrung;
      this.toleranz = toleranz;
   }
   
   public int getAnzahl()
   {
      return anzahl;
   }
   
   public void setAnzahl (int anzahl)
   {
      this.anzahl = anzahl;
   }
   
   public String getBezeichnung()
   {
      return bezeichnung;
   }
   
   public String getAusfuehrung()
   {
      return ausfuehrung;
   }
   
   public T getToleranz()
   {
      return toleranz;
   }
   
   public String toString()
   {
      return "Anzahl: " + anzahl +
         ", Bezeichung: " + bezeichnung +
         ", Ausfuehrung: " + ausfuehrung +
         ", Toleranz: " + toleranz;
   }
}
