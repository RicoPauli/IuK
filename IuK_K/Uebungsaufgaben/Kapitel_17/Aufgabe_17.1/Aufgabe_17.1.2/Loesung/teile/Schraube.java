// Datei: Schraube.java

package teile;

public class Schraube<T extends Number> extends GewindeTeil<T> 
{
   public static final String LINSENKOPF = "Linsenkopf";
   public static final String SENKKOPF = "Senkkopf";
   
   public static final String KREUZSCHLITZ = "Kreuzschlitz";
   public static final String EINFACHSCHLITZ = "Einfachschlitz";
   
   private String schlitzart;
   
   public Schraube (int anzahl, String ausfuehrung, String kopfart, T gewindeGroesse, T toleranz)
   {
      super (anzahl, "Schraube", ausfuehrung, gewindeGroesse, toleranz);
      this.schlitzart = kopfart;
   }
   
   public String getSchlitzart()
   {
      return schlitzart;
   }

   public String toString()
   {
      return super.toString() + 
         ", Schlitzart: " + schlitzart;
   }
}
