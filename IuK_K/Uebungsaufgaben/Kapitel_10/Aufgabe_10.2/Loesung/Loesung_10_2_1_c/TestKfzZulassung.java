// Datei: TestKfzZulassung.java

public class TestKfzZulassung
{
   public static void main(String[] args)
   {
      System.out.println("Anzahl der Zulassungen: " + KfzZulassung.getAnzahl());

      System.out.println("\nNeue Zulassung");
      KfzZulassung z1 = new KfzZulassung("ES-FH 2003", "Martin Mustermann");
      z1.print();

      System.out.println("\nAnzahl der Zulassungen: "
            + KfzZulassung.getAnzahl());

      System.out.println("\nNeue Zulassung");
      KfzZulassung z2 = new KfzZulassung("ES-FH 2004", "Markus Mueller");
      z2.print();

      System.out.println("\nAnzahl der Zulassungen: "
            + KfzZulassung.getAnzahl());
   }
}
