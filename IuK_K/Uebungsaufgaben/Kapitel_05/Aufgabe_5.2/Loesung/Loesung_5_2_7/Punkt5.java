// Datei: Punkt5.java

/**
 * Klasse zur Repraesentation eines Punktes als zweidimensionale Koordinate.
 * 
 * @author Java Buch
 * @version 1.0
 */
public class Punkt5
{
   private double x;

   private double y;

   /**
    * Liefert die X-Koordinate des Punktes.
    * 
    * @return x-Wert.
    */
   public double getX()
   {
      return x;
   }

   /**
    * Setzt die X-Koordinate des Punktes.
    * 
    * @param u
    *           x-Wert
    */
   public void setX (double u)
   {
      x = u;
   }

   /**
    * Liefert die Y-Koordinate des Punktes.
    * 
    * @return y-Wert.
    */
   public double getY()
   {
      return y;
   }

   /**
    * Setzt die Y-Koordinate des Punktes.
    * 
    * @param v
    *           y-Wert.
    */
   public void setY (double v)
   {
      y = v;
   }

   /**
    * Erzeugt ein Punkt Objekt fuer die vorgegebenen Koordinaten.
    * 
    * @param x
    *           x-Wert.
    * @param y
    *           y-Wert.
    */
   public Punkt5 (double x, double y)
   {
      this.x = x;
      this.y = y;
   }
}
