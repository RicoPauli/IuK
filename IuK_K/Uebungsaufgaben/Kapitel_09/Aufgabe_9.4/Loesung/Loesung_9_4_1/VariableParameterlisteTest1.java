// Datei: VariableParameterlisteTest1.java

public class VariableParameterlisteTest1
{
   private void test (String text, int... zahl)
   {
      int summe = 0;
      
      System.out.println (text);
      
      for (int i : zahl)
      {
         summe += i;
      }
      
      System.out.println (summe);      
   }
   
   public static void main (String[] args)
   {
      VariableParameterlisteTest1 vpt = new VariableParameterlisteTest1();
      vpt.test ("Die Summe lautet:", 1, 2, 3);
   }
}
