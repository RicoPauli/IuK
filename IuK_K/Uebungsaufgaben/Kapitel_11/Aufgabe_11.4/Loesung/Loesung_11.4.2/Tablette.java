//Datei: Tablette.java

public class Tablette extends Arzneimittel
{
   private int anzahl; // Anzahl der Tabletten
	
   public Tablette (String name, int anzahl) 
   {
      super (name);
      this.anzahl = anzahl;
   }

   public void print()
   {
      super.print();
      System.out.println ("Es enthaelt " + anzahl + " Tabletten.");
   }
}
