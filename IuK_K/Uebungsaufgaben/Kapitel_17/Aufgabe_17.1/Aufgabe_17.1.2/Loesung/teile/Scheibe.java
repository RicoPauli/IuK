// Datei: Scheibe.java

package teile;

public class Scheibe<T extends Number> extends Teil<T> 
{
   public static final String NORMAL = "Normal";
   public static final String FEDER = "Feder";
   
   private T innendurchmesser;
   private T aussendurchmesser;
   
   public Scheibe (int anzahl, String ausfuehrung, T innenDurchmesser, T aussendurchmesser, T toleranz)
   {
      super (anzahl, "Scheibe", ausfuehrung, toleranz);
      this.innendurchmesser = innenDurchmesser;
      this.aussendurchmesser = aussendurchmesser;
   }
   
   public T getInnendurchmesser()
   {
      return innendurchmesser;
   }
   
   public T getAussendurchmesser()
   {
      return aussendurchmesser;
   }
   
   public String toString()
   {
      return super.toString() + 
         ", D innen: " + innendurchmesser + 
         ", D aussen: " + aussendurchmesser;
   }
}
