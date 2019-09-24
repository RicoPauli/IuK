// Datei: Punkt2.java 
 
public class Punkt2 
{ 
   private int x; 
   private int y; 
 
   public Punkt2() 
   { 
      System.out.println ("Konstruktor ohne Parameter"); 
      . . . . . 
   } 
 
   public Punkt2 (int u) 
   { 
      System.out.println  
         ("Konstruktor mit einem Parameter: x = " + u); 
      . . . . . 
   } 
 
   public Punkt2 (int u, int v) 
   { 
      System.out.print ("Konstruktor mit zwei Parametern: "); 
      System.out.println ("x = " + u + " y = " + v); 
      . . . . . 
   } 
 
   public int getX() 
   { 
      return x; 
   } 
 
   public int getY() 
   { 
      return y; 
   } 
 
   public void print() 
   { 
      System.out.println ("x = " + x); 
      System.out.println ("y = " + y); 
   } 
} 