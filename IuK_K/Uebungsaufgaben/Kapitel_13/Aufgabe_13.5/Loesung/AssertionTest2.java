// Datei: AssertionTest2.java

public class AssertionTest2
{
   public static void main (String [] args)
   {
      int y = 11;
      
      try
      {
    	  assert (y > 0 && y < 10) :
    		  "Falscher Übergabeparameter von berechne()";
    	  
    	  System.out.println (berechne (y));
      }
      catch (AssertionError ae)
      {
    	  System.out.println (ae.getMessage());
    	  
    	  System.out.println ("Parameter = " + y);
    	  
    	  System.exit (1);
      }
   }

   // Die Vorbedingung von berechne() ist: 0 < x < 10
   static int berechne (int x)
   {
      return x*x*x*x;
   }
}
