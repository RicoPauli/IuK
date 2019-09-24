// Datei: Gabel.java

public class Gabel
{
   private boolean belegt = false;

   public Gabel()
   {
   }

   public boolean istBelegt()
   {
      return belegt;
   }

   public void aufheben()
   {
      belegt = true;
   }

   public void hinlegen()
   {
      belegt = false;
   }
}