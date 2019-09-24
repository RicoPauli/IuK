// Datei: ZwischenspeicherTest.java

public class ZwischenspeicherTest
{
   public static void main (String[] args)
   {
      Zwischenspeicher speicher = new Zwischenspeicher();

      ZahlThread thread1 = new ZahlThread (speicher, "Thread 1");
      
      ZahlThread thread2 = new ZahlThread (speicher, "Thread 2");
      
      ZahlThread thread3 = new ZahlThread (speicher, "Thread 3");
      
      System.out.println ("*** Main() startet thread1 ***");
      
      thread1.start();
      
      System.out.println ("*** Main() startet thread2 ***");
      
      thread2.start();
      
      System.out.println ("*** Main() startet thread3 ***");
      
      thread3.start();
   }
}