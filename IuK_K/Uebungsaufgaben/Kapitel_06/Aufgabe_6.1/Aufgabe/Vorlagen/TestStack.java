// Datei: TestStack.java
public class TestStack
{
   public static void main (String[] args)
   {
      Stack stackRef = new Stack (5);
      stackRef.push (7);
      stackRef.push (3);
      stackRef.push (4);
      stackRef.push (9);
      stackRef.push (1);

      stackRef.stackPrint();

      System.out.println ("\nAusgabe der Zahlen: ");
      while (stackRef.isEmpty() == false)
      {
         int r�ckgabe;
         // oberste Zahl des Stacks wird
         // mit pop() vom Stack geholt
         r�ckgabe = stackRef.pop();
         System.out.println ("Die Zahl war " + r�ckgabe);
      }
   }
}
