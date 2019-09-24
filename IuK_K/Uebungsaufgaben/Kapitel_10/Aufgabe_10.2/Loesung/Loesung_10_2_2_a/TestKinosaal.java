// Datei: TestKinosaal.java

public class TestKinosaal
{
   public static void main(String[] args)
   {
      Kinosaal saal1 = new Kinosaal();
      saal1.setAnzahlSitzplaetzeSaal(50);
      System.out.println("Kino " + saal1.getSaalNummer() + " mit "
            + saal1.getAnzahlSitzplaetzeSaal() + " Sitzplaetzen erzeugt.");

      System.out.println("Anzahl Kinosaele:       "
            + Kinosaal.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "
            + Kinosaal.getAnzahlSitzplaetzeKino());

      Kinosaal saal2 = new Kinosaal();
      saal2.setAnzahlSitzplaetzeSaal(100);
      System.out.println("Kino " + saal2.getSaalNummer() + " mit "
            + saal2.getAnzahlSitzplaetzeSaal() + " Sitzplaetzen erzeugt.");

      System.out.println("Anzahl Kinosaele:       "
            + Kinosaal.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "
            + Kinosaal.getAnzahlSitzplaetzeKino());
   }
}
