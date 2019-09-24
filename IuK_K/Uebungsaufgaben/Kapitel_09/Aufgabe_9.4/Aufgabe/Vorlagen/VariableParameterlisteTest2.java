// Datei: VariableParameterlisteTest2.java

public class VariableParameterlisteTest2
{
   private void printObjects (Object... objects, 
                              boolean useStdErr)
   {
      if (useStdErr == true)
      {     
         for (Object o : objects)
         {
            System.err.println (o.toString());
         }
      }
      else
      {
         for (Object o : objects)
         {
            System.out.println (o.toString());
         }
      }
   }

   public static void main (String[] args)
   {
      VariableParameterlisteTest2 vpt = 
                            new VariableParameterlisteTest2();
      vpt.printObjects (new Integer (1), new Double (3.5), 
                        "Hello", "World!", false);
   }
}
