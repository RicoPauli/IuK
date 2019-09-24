// Datei Fibonacci.java

public class Fibonacci
{
   public static void main (String[] args) 
   {
      final int COUNT = 10;    // Anzahl der Fibonacci-Zahlen
      int vorgaenger_1 = 1;    // entspricht n-1
      int vorgaenger_2 = 0;    // entspricht n-2
      int next_n;              // naechste Fibonacci-Zahl

      System.out.println ("Fibonacci-Folge:\n");
      System.out.print (vorgaenger_2 + ", " + vorgaenger_1);

      for (int lv = 0; lv < COUNT; lv = lv + 1) 
      {
         next_n = vorgaenger_2 + vorgaenger_1;
         // naechsten Fibonacci-Wert ausgeben
         System.out.print (", " + next_n);	
         // zu merkende Werte weiterschieben
         vorgaenger_2 = vorgaenger_1;
         vorgaenger_1 = next_n;
      }
   }
}
