// Datei: TestFloatQueue.java

public class TestFloatQueue
{
   public static void main(String[] args)
   {
      FloatQueue queue = new FloatQueue(5);
      
      queue.enqueue(2.45f);
      queue.enqueue(1.29f);
      queue.enqueue(4.31f);
      queue.enqueue(7.85f);

      queue.queuePrint();

      System.out.println ("\nAusgabe der Zahlen: ");
      
      while (queue.isEmpty() == false)
      {
         float rueckgabe;
         
         rueckgabe = queue.dequeue();
         
         System.out.println ("Die Zahl war " + rueckgabe);
      }

      queue.enqueue(1.11f);
      
      queue.queuePrint();
      
      queue.clear();
      
      queue.queuePrint();
   }
}
