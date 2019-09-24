// Datei Taschenrechner.java 
 
import java.util.Scanner; 
 
public class Taschenrechner 
{ 
   public static void main (String[] args)  
   { 
      Scanner eingabe = . . . . . ; 
      int . . . . . ; 
      float . . . . . ; 
       
      do 
      { 
         System.out.println ("\n======================="); 
         System.out.println ("Einfacher Taschenrechner"); 
         System.out.println ("=========================\n"); 
         System.out.println ("\nFolgende Operationen sind " 
                             + "verfuegbar:"); 
         System.out.println ("Addition...............[1]"); 
         System.out.println ("Subtraktion............[2]"); 
         System.out.println ("Multiplikation.........[3]"); 
         System.out.println ("Division...............[4]"); 
         System.out.print ("Treffen Sie Ihre Auswahl: "); 
         auswahl = eingabe.nextInt(); 
          
         System.out.print ("Bitte geben Sie die " 
                           + "erste Zahl ein: "); 
         a = eingabe.nextInt(); 
         System.out.print ("Bitte geben Sie die " 
                           + "zweite Zahl ein: "); 
         b = eingabe.nextInt(); 
          
         Rechner rechner = . . . . . ; 
          
         if (auswahl == 1)  
         { 
            ergebnis = . . . . . ; 
            System.out.println( a + " + " + b + " = " + ergebnis); 
         } 
         else if (auswahl == 2) 
         { 
            ergebnis = . . . . . ; 
            System.out.println( a + " - " + b + " = " + ergebnis); 
         } 
         else if (auswahl == 3) 
         { 
            ergebnis = . . . . . ; 
            System.out.println( a + " * " + b + " = " + ergebnis); 
         } 
         else if (auswahl == 4) 
         { 
            ergebnis = . . . . . ; 
            System.out.println( a + " / " + b + " = " + ergebnis); 
         } 
         else  
         { 
            System.out.println("\nUnbekannte Auswahl getroffen !"); 
         } 
         System.out.println  
               ("\nWollen Sie den Taschenrechner beenden?"); 
         System.out.print ("So geben Sie '0' ein: "); 
         prgEnde = eingabe.nextInt(); 
      } while (. . . . .); 
   } 
} 
 
class Rechner 
{ 
   public int addition (. . . . .)  
   { 
      . . . . .  
   } 
    
   public int subtraktion (. . . . .) 
   { 
      . . . . .  
   } 
    
   public int multiplikation (. . . . .) 
   { 
      . . . . .  
   } 
    
   public float division (. . . . .)  
   { 
      . . . . .  
   } 
}