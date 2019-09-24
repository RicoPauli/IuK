// Datei: Quadrat.java

public class Quadrat implements Position
{
   private float seitenlaenge;
   private Punkt koordinaten;

   public Quadrat (float seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
      koordinaten = new Punkt();
      System.out.println();
      System.out.println ("Quadrat erzeugt mit Seitenlaenge = "
            + this.seitenlaenge + " an " + koordinaten.toString());
   }

   public void verschiebe (float x, float y)
   {
      koordinaten.setX (koordinaten.getX() + x);
      koordinaten.setY (koordinaten.getY() + y);
      System.out.println ("Quadrat-Position geaendert auf: "
            + koordinaten.toString());
   }
}
