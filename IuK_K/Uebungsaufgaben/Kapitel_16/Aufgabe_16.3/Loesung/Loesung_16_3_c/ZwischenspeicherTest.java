// Datei: ZwischenspeicherTest.java

public class ZwischenspeicherTest
{
   public static void main (String [] args)
   {
      Zwischenspeicher speicher = new Zwischenspeicher();

      ZahlThread thread = new ZahlThread (speicher, "Thread");
      
      System.out.println ("*** Main() startet thread ***");
      
      thread.start();
   }
}