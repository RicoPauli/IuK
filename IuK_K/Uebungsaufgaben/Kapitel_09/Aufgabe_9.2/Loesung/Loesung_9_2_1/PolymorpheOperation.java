// Datei: PolymorpheOperation.java

public class PolymorpheOperation
{
   public static void main (String [] args)
   {
      Quadrat quad = new Quadrat (5.0);
      Kreis kreis = new Kreis (3.0);

      //Flaecheninhalt des Quadrats
      System.out.println ("Flaecheninhalt des Quadrats: " +
                           quad.berechneFlaecheninhalt());

      //Flaecheninhalt des Kreises
      System.out.println ("Flaecheninhalt des Kreises: " +
                           kreis.berechneFlaecheninhalt());
   }
}

class Quadrat
{
   private double seitenlaenge;

   public Quadrat (double seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
   }

   public double berechneFlaecheninhalt()
   {
      return seitenlaenge * seitenlaenge;
   }
}

class Kreis
{
   private double pi;
   private double radius;

   public Kreis (double radius)
   {
      pi = 3.14;
      this.radius = radius;
   }

   public double berechneFlaecheninhalt()
   {
      return pi * radius * radius;
   }
}
