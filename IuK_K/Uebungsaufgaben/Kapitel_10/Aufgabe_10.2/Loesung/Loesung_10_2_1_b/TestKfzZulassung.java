// Datei: TestKfzZulassung.java

public class TestKfzZulassung
{
   public static void main (String[] args)
   {
      System.out.println ("Anzahl der Zulassungen: " + KfzZulassung2.anzahl);

      System.out.println ("\nNeue Zulassung");
      KfzZulassung2 z1 = new KfzZulassung2 ("ES-FH 2003", "Martin Mustermann");
      KfzZulassung2.anzahl++;
      z1.print();

      System.out.println ("\nAnzahl der Zulassungen: " + KfzZulassung2.anzahl);

      System.out.println ("\nNeue Zulassung");
      KfzZulassung2 z2 = new KfzZulassung2 ("ES-FH 2004", "Markus Mueller");
      KfzZulassung2.anzahl++;
      z2.print();

      System.out.println ("\nAnzahl der Zulassungen: " + KfzZulassung2.anzahl);

      System.out.println ("\nZulassung aendern");
      z1.kennzeichen = "N-EU 1111";
      z1.print();

      System.out.println ("\nAnzahl der Zulassungen: " + KfzZulassung2.anzahl);
   }
}
