// Datei: Person.java  
 
. . . . . 
import java.util.*;  
 
public class Person  
{ 
   private String name;  
   private String vorname;  
 
   public Person()  
   {  
      Scanner eingabe = new Scanner (System.in);  
      System.out.print ("Geben Sie den Nachnamen ein: ");  
      name = eingabe.next();  
 
      System.out.print ("Geben Sie den Vornamen ein: ");  
      vorname = eingabe.next();  
   }  
 
   public void print()  
   {  
      System.out.println ("Nachname: " + name);  
      System.out.println ("Vorname: " + vorname);  
   }  
}