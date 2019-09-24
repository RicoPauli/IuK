// Datei: Buch.java

public class Buch
{
   private String titel;

   private String autor;

   private String verlag;

   private int anzahlSeiten;

   public Buch()
   {
   }

   public Buch (String titel, String autor, String verlag, int seiten)
   {
      this.titel = titel;
      this.autor = autor;
      this.verlag = verlag;
      this.anzahlSeiten = seiten;
   }

   public String getAutor()
   {
      return autor;
   }

   public void setAutor (String autor)
   {
      this.autor = autor;
   }

   public int getAnzahlSeiten()
   {
      return anzahlSeiten;
   }

   public void setAnzahlSeiten (int seiten)
   {
      this.anzahlSeiten = seiten;
   }

   public String getTitel()
   {
      return titel;
   }

   public void setTitel (String titel)
   {
      this.titel = titel;
   }

   public String getVerlag()
   {
      return verlag;
   }

   public void setVerlag (String verlag)
   {
      this.verlag = verlag;
   }
}