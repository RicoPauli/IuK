//Datei: Augensalbe.java

public class Augensalbe extends Salbe 
{
   public Augensalbe (String name, int menge) 
   {
      super (name, menge);
   }
	
   public void print()
   {
      System.out.println ("Die Augensalbe enthaelt " 
                           + super.getMenge() + " ml.");
   }
}
