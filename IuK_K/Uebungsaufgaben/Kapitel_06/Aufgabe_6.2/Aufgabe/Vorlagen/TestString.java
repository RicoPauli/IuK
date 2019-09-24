// Datei: TestString.java

public class TestString
{
   public static void main (String[] args)
   {
      String s = "Hello";
      System.out.println ("Starte Schleife, Bitte warten");
      long startTime = System.currentTimeMillis();

      for (int n = 0; n < 10000; n++)
      {
         s += "World";
      }

      long endTime = System.currentTimeMillis();

      System.out.println ("Mit dem + Operator braucht man " +
                          (endTime-startTime) +
                          " Millisekunden");

      System.out.println ("Der zusammengesetzte String hat " +
                          "eine Länge von " + s.length () +
                          " Zeichen");
   }
}
