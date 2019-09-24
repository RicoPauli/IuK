// Datei: DurchschnittTest.java

import java.util.Scanner;

public class DurchschnittTest
{
   public static void main (String[] args)
   {
      Scanner eingabe = new Scanner (System.in);

      System.out.print ("Geben Sie die erste Zahl ein: ");
      float zahl1 = eingabe.nextFloat();
      System.out.print ("Geben Sie die zweite Zahl ein: ");
      float zahl2 = eingabe.nextFloat();
      System.out.print ("Geben Sie die dritte Zahl ein: ");
      float zahl3 = eingabe.nextFloat();
      
      float durchschnitt = (zahl1 + zahl2 + zahl3) / 3;
      System.out.println ("Der DurchschnittTest betraegt: " + durchschnitt);
   }
}
