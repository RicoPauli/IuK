// Datei: Kreis.java

public class Kreis implements Position, Groesse
{
   private float radius;
   private Punkt koordinaten;

   public Kreis (float radius)
   {
      this.radius = radius;
      koordinaten = new Punkt();
      System.out.println();
      System.out.println ("Kreis erzeugt mit r = " + radius + " an "
            + koordinaten.toString());
   }

   public void verschiebe (float x, float y)
   {
      koordinaten.setX (koordinaten.getX() + x);
      koordinaten.setY (koordinaten.getY() + y);
      System.out.println ("Kreis-Position geaendert auf: "
            + koordinaten.toString());
   }

   public void aendereGroesse (float faktor) throws Exception
   {
      if (faktor<0)
      {
         throw new Exception("negativer Multiplikater unzulaessig");
      }
      
      this.radius *= faktor;
      System.out.println ("Kreis-Groesse geaendert auf: Radius = " + radius);
   }
}
