// Datei: UeberladeneMethoden2.java

public class UeberladeneMethoden2
{
   public static void main (String [] args)
   {
      int intProdukt = 0;
      int a = 2;
      int b = 3;
      double doubleProdukt = 0.0;
      double c = 3.0;
      double d = 0.5;

      Taschenrechner tr = new Taschenrechner();
      intProdukt = tr.multipliziere (a, b);
      System.out.println (a + " * " + b + " = " + intProdukt);

      doubleProdukt = tr.multipliziere (c, d);
      System.out.println (c + " * " + d + " = " + doubleProdukt);
   }
}

class Taschenrechner
{
   public int addiere (int a, int b)
   {
      return a + b;
   }

   public double addiere (double a, double b)
   {
      return a + b;
   }

   public int multipliziere (int a, int b)
   {
      return a * b;
   }

   public double multipliziere (double a, double b)
   {
      return a * b;
   }
}
