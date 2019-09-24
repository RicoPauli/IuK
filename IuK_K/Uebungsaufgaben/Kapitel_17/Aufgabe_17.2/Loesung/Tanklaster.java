// Datei: Tanklaster.java

public class Tanklaster extends Laster
{
   private final double maxFuellmenge;
   private double fuellstand = 0;
   
   public Tanklaster (String modell, double maxZuladung, double kgProLiter)
   {
      super (modell, maxZuladung);
      
      pruefeEingabe (kgProLiter);
      this.maxFuellmenge = maxZuladung / kgProLiter;
   }
   
   public double getMaxFuellmenge()
   {
      return maxFuellmenge;
   }
   
   public double getFuellstand()
   {
      return fuellstand;
   }
   
   public double befuelle (double menge)
   {
      pruefeEingabe (menge);
      double tempFuellstand = this.fuellstand + menge;
      if (tempFuellstand > maxFuellmenge)
      {
         this.fuellstand = maxFuellmenge;
         return tempFuellstand - maxFuellmenge;
      }
      else
      {
         this.fuellstand = tempFuellstand;
         return 0;
      }
   }
   
   public void print()
   {
      super.print();
      System.out.printf ("Max. Fuellmenge:\t%.2f\n", maxFuellmenge);
      System.out.printf ("Fuellstand:\t%.2f\n", fuellstand);
   }
}
