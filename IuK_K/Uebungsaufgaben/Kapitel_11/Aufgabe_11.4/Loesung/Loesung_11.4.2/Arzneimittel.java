//Datei: Arzneimittel.java

public class Arzneimittel 
{
   private String name;

   public Arzneimittel (String name)
   {
      this.name = name;
   }

   public void print()
   {
      System.out.println ("Das Arzneimittel heisst: " + name);
   }
}
