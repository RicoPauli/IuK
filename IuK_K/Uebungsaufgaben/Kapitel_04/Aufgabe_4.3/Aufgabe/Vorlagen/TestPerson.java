// Datei: TestPerson.java

public class TestPerson
{
   public static void main (String[] args)
   {
      String vorname;
      String name;
      Person schoettle;

      schoettle = new Person();

      schoettle.setName ("Schöttle");
      schoettle.setVorname ("Lothar");

      name = schoettle.getName();
      vorname = schoettle.getVorname();

      System.out.println ("Vorname: " + vorname);
      System.out.println ("Name:    " + name);
   }
}
