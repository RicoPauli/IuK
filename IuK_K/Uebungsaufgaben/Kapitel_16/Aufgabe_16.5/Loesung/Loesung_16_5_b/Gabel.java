// Datei: Gabel.java

public class Gabel
{
   private boolean belegt = false;

   public Gabel()
   {
   }

   public synchronized void aufheben() throws GabelBelegtException
   {
      if (belegt == true) 
         throw new GabelBelegtException();
      belegt = true;
   }

   public synchronized void hinlegen()
   {
      belegt = false;
   }
}
