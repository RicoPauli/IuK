// Datei: KontoTest.java 
public class KontoTest 
{ 
   public static void kontoVergleich ( . . . . . ) 
   { 
      if ( . . . . . ) 
      { 
         System.out.println (k1.getName() 
                      + " hat mehr Geld auf dem Konto als " 
                      + k2.getName()); 
      } 
      else 
      { 
         System.out.println (k2.getName() 
                      + " hat mehr Geld auf dem Konto als "  
                      + k1.getName()); 
      } 
   } 
 
   public static void main (String[] args) 
   { 
      Konto konto1 = new Konto ("M�ller", "Hans", 500); 
      Konto konto2 = new Konto ("Krause", "Peter", 1500); 
      Konto konto3 = new Konto ("B�hm", "Harald", 330); 
      kontoVergleich (konto1, konto2); 
      kontoVergleich (konto2, konto3); 
      kontoVergleich (konto1, konto3); 
   } 
} 