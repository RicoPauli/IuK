// Datei: TestBuch.java

public class TestBuch
{
   public static void main (String[] args)
   {
      Buch b1 = new Buch();
      Buch b2 = new Buch ("Java als erste Programmiersprache",
            "Goll, Heinisch, Mueller", "Teubner Verlag", 885);

      System.out.println ("Titel:     " + b1.getTitel());
      System.out.println ("Autor(en): " + b1.getAutor());
      System.out.println ("Verlag:    " + b1.getVerlag());
      System.out.println ("Seiten:    " + b1.getAnzahlSeiten());
      System.out.println ("**********************************");

      System.out.println ("Titel:     " + b2.getTitel());
      System.out.println ("Autor(en): " + b2.getAutor());
      System.out.println ("Verlag:    " + b2.getVerlag());
      System.out.println ("Seiten:    " + b2.getAnzahlSeiten());
      System.out.println ("**********************************");

      b1.setTitel ("C als erste Programmiersprache");
      b1.setAutor ("Goll, Broeckl, Dausmann");
      b1.setVerlag ("Teubner Verlag");
      b1.setAnzahlSeiten (554);

      System.out.println ("Titel:     " + b1.getTitel());
      System.out.println ("Autor(en): " + b1.getAutor());
      System.out.println ("Verlag:    " + b1.getVerlag());
      System.out.println ("Seiten:    " + b1.getAnzahlSeiten());
   }
}