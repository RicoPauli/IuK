// Datei: Getraenk.java

public abstract class Getraenk
{
   private String hersteller;
   private float inhaltsmenge;
   private float preis;
   
   public Getraenk (String hersteller, float inhaltsmenge, float preis) 
   {
      this.hersteller = hersteller;
      this.inhaltsmenge = inhaltsmenge;
      this.preis = preis;
   }
}
