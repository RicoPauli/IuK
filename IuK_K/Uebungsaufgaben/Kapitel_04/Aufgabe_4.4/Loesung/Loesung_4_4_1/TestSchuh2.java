// Datei: TestSchuh2.java

public class TestSchuh2
{
   public static void main (String[] args)
   {
      Schuh2 s1 = new Schuh2();
      s1.print();

      Schuh2 s2 = new Schuh2 (44);
      s2.print();

      Schuh2 s3 = new Schuh2 (41, "Puna");
      s3.print();

      Schuh2 s4 = new Schuh2 (42, "Mike", "Air Ultramatic");
      s4.print();
   }
}
