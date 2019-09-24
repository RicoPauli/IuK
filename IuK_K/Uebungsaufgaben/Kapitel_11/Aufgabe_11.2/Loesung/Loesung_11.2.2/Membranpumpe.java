// Datei: Membranpumpe.java

public class Membranpumpe extends Pumpe
{
   private String membranmaterial;

   public Membranpumpe (String name, int gewicht, int hoehe, int breite, int tiefe, float maximalerBetriebsdruck,
                        int maximaleFoerdermenge, String membranmaterial)
   {
      super (name, gewicht, hoehe, breite, tiefe, maximalerBetriebsdruck, maximaleFoerdermenge);
      this.membranmaterial = membranmaterial;
   }
}
