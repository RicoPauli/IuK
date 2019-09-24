// Datei: PolymorpheOperation2.java

public class PolymorpheOperation2
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

      //Skaliere Quadrat um Faktor 2
      quad.skaliereFigur (2.0);

      //Skaliere Kreis um Faktor 2
      kreis.skaliereFigur (2.0);


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

   public void skaliereFigur (double skalierungsfaktor)
   {
      seitenlaenge = seitenlaenge * skalierungsfaktor;
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

   public void skaliereFigur (double skalierungsfaktor)
   {
      radius = radius * skalierungsfaktor;
   }
}
