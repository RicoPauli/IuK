// Datei: Stack.java

public class Stack
{
   private int position;
   private int [] stack;

   public Stack (int groesse)
   {
      stack = new int [groesse];
      
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

   public void push (int wert)
   {
      stack [position] = wert;
      
      position++;
   }

   public int pop()
   {
      position--;
      
      return stack [position];
   }

   public void stackPrint()
   {
      System.out.println ("Stack:");
      
      for (int i = 0; i < position; i++)
      {
         System.out.println ("Wert an Position [" + i + "] = " + stack [i]);
      }
   }
}