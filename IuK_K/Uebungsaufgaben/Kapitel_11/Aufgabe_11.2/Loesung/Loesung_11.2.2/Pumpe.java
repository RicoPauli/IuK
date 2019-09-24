// Datei: Pumpe.java

public abstract class Pumpe extends Produkt
{
   private float maximalerBetriebsdruck;
   private int maximaleFoerdermenge;

   public Pumpe (String name, int gewicht, int hoehe, int breite, int tiefe,
                 float maximalerBetriebsdruck, int maximaleFoerdermenge)
   {
      super (name, gewicht, hoehe, breite, tiefe);
      this.maximalerBetriebsdruck = maximalerBetriebsdruck;
      this.maximaleFoerdermenge = maximaleFoerdermenge;
   }
}
