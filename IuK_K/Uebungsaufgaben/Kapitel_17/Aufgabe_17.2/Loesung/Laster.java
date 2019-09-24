// Datei: Laster.java

public class Laster {
   private final String modell;
   private final double maxZuladung;
   
   public Laster (String modell, double maxZuladung)
   {
      pruefeEingabe (maxZuladung);
      this.modell = modell;
      this.maxZuladung = maxZuladung;
   }
   
   public String getModell()
   {
      return modell;
   }
   
   public double getMaxZuladung()
   {
      return maxZuladung;
   }
   
   protected void pruefeEingabe (double eingabe)
   {
      if (eingabe < 0)
         throw new IllegalArgumentException();
   }
   
   public void print()
   {
      System.out.println ("Lastermodell:\t" + modell);
      System.out.printf ("Max. Zuladung:\t%.2f\n", maxZuladung);
   }
}
