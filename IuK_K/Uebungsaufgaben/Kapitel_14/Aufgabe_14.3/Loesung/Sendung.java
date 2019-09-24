// Datei: Sendung.java

public class Sendung implements Versendbar
{
   private String[] absender;
   private String[] empfaenger;
   private int gewicht;

   public Sendung (String[] an, String[] von, int gewicht)
   {
      this.absender = von;
      this.empfaenger = an;
      this.gewicht = gewicht;
   }

   public void setAbsender (String[] absender)
   {
      this.absender = absender;
   }

   public String[] getAbsender()
   {
      return absender;
   }

   public int getGewicht()
   {
      return gewicht;
   }

   public void setEmpfaenger (String[] adresse)
   {
      this.empfaenger = adresse;
   }

   public String[] getEmpfaenger()
   {
      return empfaenger;
   }
}
