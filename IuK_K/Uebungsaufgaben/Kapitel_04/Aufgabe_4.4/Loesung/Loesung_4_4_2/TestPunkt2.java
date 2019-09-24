// Datei: TestPunkt2.java

public class TestPunkt2
{
   public static void main (String[] args)
   {
      Punkt2 punkt2a = new Punkt2();
      Punkt2 punkt2b = new Punkt2 (1);
      Punkt2 punkt2c = new Punkt2 (2, 3);

      System.out.println ("Punkt2 a:");
      punkt2a.print();

      System.out.println ("Punkt2 b:");
      punkt2b.print();

      System.out.println ("Punkt2 c:");
      punkt2c.print();
   }
}
