// Datei: Produkt.java

public abstract class Produkt
{
   private String name;
   private int tiefe;
   private int hoehe;
   private int gewicht;
   private int breite;

   public Produkt (String name, int gewicht, int hoehe, int breite, int tiefe)
   {
      this.name = name;
      this.gewicht = gewicht;
      this.hoehe = hoehe;
      this.breite = breite;
      this.tiefe = tiefe;
   }

   public void print()
   {
      System.out.println();
      System.out.println ("Name:               " + name);
      System.out.println ("Gewicht:            " + gewicht + "kg");
      System.out.println ("Abmessungen:        " + hoehe + "cm x " + breite + "cm x " + tiefe + "cm");
   }
}
