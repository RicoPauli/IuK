// Datei: TestSchuh.java

public class TestSchuh
{
   public static void main (String[] args)
   {
      Schuh s = new Schuh();
      System.out.println ("Wert unmittelbar nach dem Erzeugen:");
      s.print();

      s.setGroesse (42);
      s.setHersteller ("Mike");
      s.setModellbezeichnung ("Air Ultramatic");

      System.out.println();
      System.out.println ("Wert nach dem Setzen der Daten");
      s.print();
   }
}
