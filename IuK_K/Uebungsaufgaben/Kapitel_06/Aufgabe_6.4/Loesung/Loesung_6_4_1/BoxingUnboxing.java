// Datei: BoxingUnboxing.java

public class BoxingUnboxing
{
   private static void testAutoBoxing(Integer i)
   {
      System.out.println("*** AutoBoxing wurde verwendet ***");
      System.out
            .println("Der Wert der uebergebenen primitiven Integer-Variablen lautet: "
                  + i);
      System.out.println("**********************************");
   }

   private static void testAutoUnboxing(int j)
   {
      System.out.println("*** AutoUnboxing wurde verwendet ***");
      System.out.println("Der Wert des uebergebenen Integer-Objekts lautet: "
            + j);
      System.out.println("************************************");
   }

   public static void main(String[] args)
   {
      int u = 5;
      System.out.print("Wert der primitiven Integer-Variablen: ");
      System.out.println(u);

      Integer v = new Integer(20);
      System.out.print("Wert des Integer-Objekts: ");
      System.out.println(v);

      testAutoBoxing(u);
      testAutoUnboxing(v);

   }
}
