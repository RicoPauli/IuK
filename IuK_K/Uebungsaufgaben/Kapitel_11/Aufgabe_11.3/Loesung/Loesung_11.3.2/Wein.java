// Datei: Wein.java

public class Wein extends AlkoholischesGetraenk
{
	private int jahrgang;

   public Wein (String hersteller, float inhaltsmenge, float preis,
                float alkoholgehalt, int jahrgang) 
   {
      super (hersteller, inhaltsmenge, preis, alkoholgehalt);
      
      this.jahrgang = jahrgang;
   }
}