// Datei: AssertionTest.java

class AssertionTest
{
   public static void main (String[] args)
   {
      int y = 11;

      assert (y > 0 && y < 10) :
         "Falscher Übergabeparameter von berechne()";
      System.out.println (berechne (y));
   }

   // Die Vorbedingung von berechne() ist: 0 < x < 10
   static int berechne (int x)
   {
      return x*x*x*x;
   }
}
