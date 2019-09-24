// Datei: ThreadTest1.java
public class ThreadTest1
{
   public static void main (String[] args)
   {
      EigenerThread meinThread = new EigenerThread();
      System.out.println ("Hier ist main(), ich starte Thread.");
      meinThread.start();
      System.out.println ("Hier ist main(), ich bin fertig.");
   }
}
