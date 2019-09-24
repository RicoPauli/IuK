// Datei: Auffangbecken.java

public class Auffangbecken extends Produkt
{
   private int volumen;

   public Auffangbecken (String name, int gewicht, int hoehe, int breite, int tiefe, int volumen)
   {
      super (name, gewicht, hoehe, breite, tiefe);
      this.volumen = volumen;
   }
}
