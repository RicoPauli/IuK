// Datei: Punkt.java

public class Punkt
{
   private float x;
   private float y;

   public Punkt()
   {
      this (0.0f, 0.0f);
   }

   public Punkt (float x, float y)
   {
      this.x = x;
      this.y = y;
   }

   public float getX()
   {
      return x;
   }

   public void setX (float x)
   {
      this.x = x;
   }

   public float getY()
   {
      return y;
   }

   public void setY (float y)
   {
      this.y = y;
   }

   public String toString()
   {
      return "x = " + x + " y = " + y;
   }
}
