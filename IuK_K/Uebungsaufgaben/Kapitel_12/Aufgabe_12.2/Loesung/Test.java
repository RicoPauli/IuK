// Datei: Test.java 

import pers.Person; 
import pers.Professor;
import studi.Student;

public class Test 
{ 
   public static void main (String args[]) 
   { 
      System.out.println ("Start des Progamms"); 
      System.out.println(); 
      System.out.println ("Person"); 
      
      Person person = new Person();
       
      System.out.println(); 
      System.out.println ("Student"); 
      
      Student student = new Student();
      
      System.out.println(); 
      System.out.println ("Professor");
      
      Professor prof = new Professor();
 
      System.out.println(); 
      System.out.println ("Ausgabe Person"); 
      
      person.print();

      System.out.println();
      System.out.println ("Ausgabe Student"); 
      
      student.print();
      
      System.out.println();
      System.out.println("Ausgabe Professor");
      
      prof.print();
   } 
}
