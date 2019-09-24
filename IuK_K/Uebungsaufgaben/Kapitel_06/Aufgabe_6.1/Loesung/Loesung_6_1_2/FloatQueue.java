// Datei: FloatQueue.java

public class FloatQueue
{
   private int position;

   private float[] queue;

   public FloatQueue(int laenge)
   {
      queue = new float[laenge];
      
      position = 0;
   }

   public boolean isEmpty()
   {
      if (position == 0)
      {
         return true;
      }

      return false;
   }

   public void enqueue(float wert)
   {
      queue[position] = wert;
      
      position++;
   }

   public float dequeue()
   {
      float wert;
      
      if (isEmpty() == false)
      {
         wert = queue[0];
         
         for (int i = 1; i < position; i++)
         {
            queue[i - 1] = queue[i];
         }
         
         position--;
      } 
      
      else
      {
         wert = -1;
      }
      
      return wert;
   }

   public void clear()
   {
      position = 0;
   }

   public void queuePrint()
   {
      if (isEmpty() == false)
      {
         System.out.println("\nQueue:");
         
         for (int i = 0; i < position; i++)
         {
            System.out.println("Wert an Position [" + i + "] = " + queue[i]);
         }
      }
      
      else
      {
         System.out.println("\nQueue ist leer!");
      }
   }
}
