//Datei: Salbe.java

public class Salbe extends Arzneimittel
{
   private int menge; // Menge der Salbe in ml

   public Salbe (String name, int menge) 
   {
      super (name);
      this.menge = menge;
   }
	
   public void print()
   {
      super.print();
      System.out.println ("Es enthaelt " + menge + " ml Salbe.");
   }
	
   public int getMenge()
   {
      return this.menge;
   }
}
