// Datei: Schuh2.java

public class Schuh2
{
   private int groesse;

   private String hersteller;

   private String modellbezeichnung;

   public Schuh2()
   {
      System.out.println ("\nKonstruktor ohne Parameter");
   }

   public Schuh2 (int gr)
   {
      groesse = gr;
      System.out.println ("\nKonstruktor mit einem Parameter: groesse = "
            + groesse);
   }

   public Schuh2 (int gr, String herst)
   {
      groesse = gr;
      hersteller = herst;
      System.out.println ("\nKonstruktor mit zwei Parametern: groesse = "
            + groesse + ", hersteller = " + hersteller);
   }

   public Schuh2 (int gr, String herst, String modellbez)
   {
      groesse = gr;
      hersteller = herst;
      modellbezeichnung = modellbez;
      System.out.println ("\nKonstruktor mit drei Parametern: groesse = "
            + groesse + ", hersteller = " + hersteller
            + ", modellbezeichnung = " + modellbezeichnung);
   }

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
