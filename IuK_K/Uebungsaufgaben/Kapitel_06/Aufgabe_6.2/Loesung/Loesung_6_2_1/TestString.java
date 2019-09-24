// Datei: TestString.java

public class TestString
{
   public static void main(String[] args)
   {
      String s = "Hello";
      System.out.println("Starte Schleife, Bitte warten ...");
      long startTime = System.currentTimeMillis();
      for (int n = 0; n < 10000; n++)
      {
         s += "World";
      }
      long endTime = System.currentTimeMillis();

      System.out.println("Mit dem + Operator braucht man hier "
            + (endTime - startTime) + " Millisekunden");
      System.out.println("Der zusammengesetzte String hat eine Laenge von "
            + s.length() + " Zeichen");

      // Stringkonkatenation mit StringBuffer
      StringBuffer buf = new StringBuffer("Hello");
      System.out.println("\nStarte Schleife, Bitte warten ...");
      startTime = System.currentTimeMillis();
      for (int n = 0; n < 10000; n++)
      {
         buf.append("World");
      }
      endTime = System.currentTimeMillis();

      System.out.println("Mit StringBuffer.append() braucht man hier "
            + (endTime - startTime) + " Millisekunden");
      System.out.println("Der zusammengesetzte String hat eine Laenge von "
            + buf.length() + " Zeichen");
   }
}