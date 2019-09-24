// Datei Taschenrechner2.java

import java.util.Scanner;

public class Taschenrechner2
{
   public static void main (String[] args) 
   {
      Scanner eingabe = new Scanner (System.in);
      int auswahl, prgEnde;
      float a = 0;
      float b = 0;
      int c = 0;
      float ergebnis = 0;
      
      do
      {
         System.out.println ("\n=============================");
         System.out.println ("Erweiterter Taschenrechner");
         System.out.println ("=============================\n");
         System.out.println ("\nFolgende Operationen sind verfuegbar:");
         System.out.println ("Addition...............[1]");
         System.out.println ("Subtraktion............[2]");
         System.out.println ("Multiplikation.........[3]");
         System.out.println ("Division...............[4]");
         System.out.println ("Zinseszins-Berechnung..[5]");
         System.out.print ("Treffen Sie Ihre Auswahl: ");
         auswahl = eingabe.nextInt();
         
         Rechner2 rechner = new Rechner2();
         
         if (auswahl == 5)
         {
            System.out.print ("Bitte geben Sie das Anfangskapital ein: ");
            a = eingabe.nextFloat();
            System.out.print ("Bitte geben Sie den Zinssatz ein: ");
            b = eingabe.nextFloat();
            System.out.print ("Bitte geben Sie die Laufzeit der"
                              + " Verzinsung in Jahren ein: ");
            c = eingabe.nextInt();
         }
         else
         {
            System.out.print ("Bitte geben Sie die erste Zahl ein: ");
            a = eingabe.nextFloat();
            System.out.print ("Bitte geben Sie die zweite Zahl ein: ");
            b = eingabe.nextFloat();
         }
         
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
         else if (auswahl == 5)
         {
            ergebnis = rechner.zinseszinsBerechnung (a, b, c);
            System.out.println ( a + " Euro Anfangskapital, ergeben bei " 
                                 + "einer Verzinsung von " + b + " %, "
                                 + "und einer Laufzeit von " + c + " Jahren "
                                 + "ein Endkapital von " + ergebnis + " Euro");
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

class Rechner2
{
   public float addition (float a, float b) 
   {
      return a + b;
   }
   
   public float subtraktion (float a, float b)
   {
      return a - b;
   }
   
   public float multiplikation (float a, float b)
   {
      return a * b;
   }
   
   public float division (float a, float b) 
   {
      return a / b;
   }
   
   public float zinseszinsBerechnung (float anfangskapital, float zinssatz, int laufzeit) 
   {
      float endkapital = 0;
      float x = (1 + (zinssatz/100));
      float y = potenzieren (x, laufzeit);
      endkapital = anfangskapital * y;
      return endkapital;
   }
   
   public float potenzieren (float basis, int potenz)
   {
      float tmp = 1;
      for (int i = 1; i <= potenz; i = i + 1)
      {
         tmp = tmp * basis;
      }
      return tmp;
   }
}
