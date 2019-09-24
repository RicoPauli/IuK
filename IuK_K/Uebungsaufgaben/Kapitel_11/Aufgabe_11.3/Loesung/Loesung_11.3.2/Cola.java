// Datei: Cola.java

public class Cola extends AlkoholfreiesGetraenk
{
   private boolean istKoffeinfrei;
   
	public Cola (String hersteller, float inhaltsmenge, float preis,
                boolean istKoffeinfrei) 
	{
      super (hersteller, inhaltsmenge, preis);
      
      this.istKoffeinfrei = istKoffeinfrei;
   }
}
