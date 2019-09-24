// Datei: Bier.java

public class Bier extends AlkoholischesGetraenk
{
	private String farbe;

   public Bier (String hersteller, float inhaltsmenge, float preis,
                float alkoholgehalt, String farbe) 
   {
      super (hersteller, inhaltsmenge, preis, alkoholgehalt);
      
      this.farbe = farbe;
   }
}
