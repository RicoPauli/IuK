// Datei: AlkoholfreiesGetraenk.java

public abstract class AlkoholfreiesGetraenk extends Getraenk
{
   public AlkoholfreiesGetraenk (String hersteller, float inhaltsmenge,
                                 float preis) 
   {
      // Aufruf des Getraenke-Konstruktors
      super (hersteller, inhaltsmenge, preis);
   }
}
