// Datei Taschenrechner.java

import java.util.Scanner;

public class Taschenrechner
{
   public static void main (String[] args) 
   {
      Scanner eingabe = new Scanner (System.in);
      int a, b, auswahl, prgEnde;
      float ergebnis;
      
      do
      {
         System.out.println ("\n=========================");
         System.out.println ("Einfacher Taschenrechner");
         System.out.println ("=========================\n");
         System.out.println ("\nFolgende Operationen sind verfuegbar:");
         System.out.println ("Addition...............[1]");
         System.out.println ("Subtraktion............[2]");
         System.out.println ("Multiplikation.........[3]");
         System.out.println ("Division...............[4]");
         System.out.print ("Treffen Sie Ihre Auswahl: ");
         auswahl = eingabe.nextInt();

         System.out.print ("Bitte geben Sie die erste Zahl ein: ");
         a = eingabe.nextInt();
         System.out.print ("Bitte geben Sie die zweite Zahl ein: ");
         b = eingabe.nextInt();
         
         Rechner rechner = new Rechner();
         if (auswahl == 1) 
         {
            ergebnis = rechner.addition (a, b);
            System.out.println ( a + " + " + b + " = " + ergebnis);
         }
         else if (auswahl == 2)
         {
            ergebnis = rechner.subtraktion (a, b);
            System.out.println ( a + " - " + b + " = " + ergebnis);
         }
         else if (auswahl == 3)
         {
            ergebnis = rechner.multiplikation (a, b);
            System.out.println ( a + " * " + b + " = " + ergebnis);
         }
         else if (auswahl == 4)
         {
            ergebnis = rechner.division (a, b);
            System.out.println ( a + " / " + b + " = " + ergebnis);
         }
         else 
         {
            System.out.println ("\nUnbekannte Auswahl getroffen !");
         }
         System.out.println ("\nWollen Sie den Taschenrechner beenden?");
         System.out.print ("So geben Sie '0' ein: ");
         prgEnde = eingabe.nextInt();   
      }while ( prgEnde != 0 );
   }
}

class Rechner
{
   public int addition (int a, int b) 
   {
      return a + b;
   }
   
   public int subtraktion (int a, int b)
   {
      return a - b;
   }
   
   public int multiplikation (int a, int b)
   {
      return a * b;
   }
   
   public float division (float a, float b) 
   {
      return a / b;
   }
}
