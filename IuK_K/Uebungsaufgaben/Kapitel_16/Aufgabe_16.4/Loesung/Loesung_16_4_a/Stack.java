// Datei: Stack.java

public class Stack
{
   private int[] stack;
   private int index;

   public Stack()
   {
      stack = new int [5];
      index = 0;
   }

   public synchronized void push (int zahl) throws InterruptedException
   {
      if(index >= stack.length)
         wait();
   
      stack [index] = zahl;
      index++;
      notify();  
   }

   public synchronized int pop() throws InterruptedException
   {
      if (index == 0)
         wait();
      
      int ret = stack [--index];
      notify();
      return ret;
   }

   public void stackDump()
   {
      for (int i = 0; i < stack.length; i++)
      {
         System.out.println ("Stack bei Index " + i + ": " + stack [i]);
      }
   }
}
