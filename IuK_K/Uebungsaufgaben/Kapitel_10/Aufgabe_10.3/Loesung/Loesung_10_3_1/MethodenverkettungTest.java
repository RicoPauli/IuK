//MethodenverkettungTest.java

public class MethodenverkettungTest
{
   static public void main (String[] args)
   {
      Wuerfel w = new Wuerfel (5.0f);
      w.berechneGrundflaeche().berechneOberflaeche().berechneVolumen().print();
      w.skaliereSeitenlaenge (2.0f).berechneGrundflaeche().berechneOberflaeche().berechneVolumen().print();
   }
}

class Wuerfel
{
   private float seitenlaenge;
   private float grundflaeche;
   private float oberflaeche;
   private float volumen;
  
   public Wuerfel (float s)
   {
      this.seitenlaenge = s;
      this.grundflaeche = s * s;
      this.oberflaeche = this.grundflaeche * 6;
      this.volumen = this.grundflaeche * s;
   }
   
   public float getSeitenlaenge()
   {
      return this.seitenlaenge;
   }
   
   public float getGrundflaeche()
   {
      return this.grundflaeche;
   }
   
   public float getOberflaeche()
   {
      return this.oberflaeche;
   }

   public float getVolumen()
   {
      return this.volumen;
   }
   
   public Wuerfel setSeitenlaenge (float s)
   {
      this.seitenlaenge = s;
      return this;
   }
   
   public Wuerfel skaliereSeitenlaenge (float faktor)
   {
      this.seitenlaenge = this.seitenlaenge * faktor;
      return this;
   }
   
   public Wuerfel berechneGrundflaeche()
   {
      this.grundflaeche = this.seitenlaenge * this.seitenlaenge;
      return this;
   }
   
   public Wuerfel berechneOberflaeche()
   {
      this.oberflaeche = this.seitenlaenge * this.seitenlaenge * 6;
      return this;
   }
   
   public Wuerfel berechneVolumen()
   {
      this.volumen = this.seitenlaenge * this.seitenlaenge * this.seitenlaenge;
      return this;
   }
   
   public void print()
   {
      System.out.println ("Seitenlaenge: " + this.seitenlaenge);
      System.out.println ("Grundflaeche: " + this.grundflaeche);
      System.out.println ("Oberflaeche: " + this.oberflaeche);
      System.out.println ("Volumen: " + this.volumen);
   }
}