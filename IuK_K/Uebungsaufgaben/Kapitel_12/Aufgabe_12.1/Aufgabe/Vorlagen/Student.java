// Datei: Student.java 
. . . . .  
. . . . .  
import java.util.*; 
 
public class Student . . . . .  
{  
   private String matrikelnummer;  
 
   public Student()  
   {  
      super();  
 
      Scanner eingabe = new Scanner (System.in); 
      System.out.print ("Geben Sie die Matrikelnummer ein: ");  
      matrikelnummer = eingabe.next(); 
      System.out.println();  
   }  
 
   public void print()  
   {  
      . . . . .  
      System.out.println ("Matrikelnummer: " + matrikelnummer);  
   }  
}  