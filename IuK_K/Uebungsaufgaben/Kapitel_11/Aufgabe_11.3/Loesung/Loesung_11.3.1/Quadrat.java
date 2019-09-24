// Datei: Quadrat.java

public class Quadrat extends GeometrischeFigur
{
   private int seitenlaenge;

   public Quadrat (int seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
   }

   protected double berechneFlaeche()
   {
      return (seitenlaenge * seitenlaenge);
   }

   protected double berechneUmfang()
   {
      return (4 * seitenlaenge);
   }
}
