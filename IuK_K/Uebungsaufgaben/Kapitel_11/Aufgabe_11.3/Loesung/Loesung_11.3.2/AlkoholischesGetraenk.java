// Datei: AlkoholischesGetraenk.java

public abstract class AlkoholischesGetraenk extends Getraenk
{
	private float alkoholgehalt;

   public AlkoholischesGetraenk (String hersteller, float inhaltsmenge,
                                 float preis, float alkoholgehalt) 
   {
      // Aufruf des Getraenke-Konstruktors
      super (hersteller, inhaltsmenge, preis);
      
      this.alkoholgehalt = alkoholgehalt;
   }
}
