// Datei: Musikantenstadl.java

public class Musikantenstadl
{
   public static void main (String[] args)
   {
      Musikinstrument[] instrumente = new Musikinstrument [3];

      instrumente [0] = new Trompete();
      instrumente [1] = new Trommel();
      instrumente [2] = new Trompete();

      for (int i = 0; i < instrumente.length; i++)
      {
         instrumente [i].spieleInstrument();
      }
   }
}