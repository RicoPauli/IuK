// Datei: Schuh.java

public class Schuh
{
   private int groesse;

   private String hersteller;

   private String modellbezeichnung;

   public void setGroesse (int gr)
   {
      groesse = gr;
   }

   public void setHersteller (String herst)
   {
      hersteller = herst;
   }

   public void setModellbezeichnung (String modellbez)
   {
      modellbezeichnung = modellbez;
   }

   public int getGroesse()
   {
      return groesse;
   }

   public String getHersteller()
   {
      return hersteller;
   }

   public String getModellbezeichnung()
   {
      return modellbezeichnung;
   }

   public void print()
   {
      System.out.println ("Groesse: " + groesse);
      System.out.println ("Hersteller: " + hersteller);
      System.out.println ("Modellbezeichnung: " + modellbezeichnung);
   }
}
