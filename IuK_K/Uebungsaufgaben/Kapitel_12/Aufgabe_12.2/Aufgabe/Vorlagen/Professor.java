// Datei: Professor.java

package . . . . .; 

import java.util.*;
import . . . . .; 
import . . . . .; 

public class Professor . . . . . 
{ 
   private String fb; 
   private Student stud;

   public Professor() 
   { 
      super(); 
      Scanner eingabe = new Scanner (System.in); 
      System.out.print ("Geben Sie den Fachbereich ein: "); 
      fb = eingabe.next();
      System.out.println(); 
      System.out.println ("Professor erstellt Student"); 
      stud = new Student(); 
   } 

   public void print() 
   { 
      // Ausgabe der geerbten Instanzvariablen 
      . . . . . 
      System.out.println ("Fachbereich: " + fb); 
      System.out.println ("Ausgabe des Studenten"); 
      . . . . . 
   } 
} 
