// Datei: BoxingUnboxing2.java

public class BoxingUnboxing2
{

   public static void main(String[] args)
   {
      Integer i1 = 5;
      Integer i2 = 0;

      i1--;
      i2++;

      int i3 = i1 - i2;
      System.out.println("Der Wert von i3 ist: " + i3);

      System.out.println("i1 > i2 : " + (i1 > i2)); // Okay
      System.out.println("i1 < i2 : " + (i1 < i2)); // Okay

      // Die folgenden beiden Vergeleiche sind nicht okay,
      // weil mit den Operatoren == und != die Referenzen
      // und nicht die in den Objekten der Wrapperklassen
      // enthaltenen Werte verglichen werden.
      System.out.println("i1 == i2 : " + (i1 == i2));
      System.out.println("i1 != i2 : " + (i1 != i2));

      System.out.println("i1 vor der Bit-Operation: " + i1);
      i1 = (Integer) i1 << 1;
      System.out.println("i1 nachher: " + i1);

      Boolean b = true;
      System.out.println("b ist " + (b ? "wahr" : "falsch"));

      Character letter = 'c';
      System.out.print("Der Ausdruck der switch-Anweisung hat den Wert ");
      switch (letter)
      {
         case 'a':
            System.out.println("'a'");
            break;
         case 'b':
            System.out.println("'b'");
            break;
         case 'c':
            System.out.println("'c'");
            break;
      }
   }
}
