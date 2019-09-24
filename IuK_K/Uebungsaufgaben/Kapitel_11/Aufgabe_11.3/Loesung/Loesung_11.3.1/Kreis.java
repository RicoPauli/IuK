// Datei: Kreis.java

public class Kreis extends GeometrischeFigur
{
   private int radius;

   public Kreis (int radius)
   {
      this.radius = radius;
   }

   protected double berechneFlaeche()
   {
      return (radius * radius * Math.PI);
   }

   protected double berechneUmfang()
   {
      return (2 * radius * Math.PI);
   }
}
