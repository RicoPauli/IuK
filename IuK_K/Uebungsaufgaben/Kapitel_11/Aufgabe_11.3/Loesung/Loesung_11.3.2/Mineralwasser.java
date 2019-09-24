// Datei: Mineralwasser.java

public class Mineralwasser extends AlkoholfreiesGetraenk
{
	private boolean istKohlensaeurehaltig;

   public Mineralwasser (String hersteller, float inhaltsmenge, float preis,
                         boolean istKohlensaeurehaltig) 
   {
      super (hersteller, inhaltsmenge, preis);
      
      this.istKohlensaeurehaltig = istKohlensaeurehaltig;
   }
}
