// Datei: Student.java 

package studi;

import pers.Person; 
import java.io.*; 

public class Student extends Person
{ 
   private String matrikelnummer; 

   public Student() 
   { 
      super(); 

      try 
      { 
         byte[] eingabe = new byte[80]; 
         System.out.print ("Geben Sie die Matrikelnummer ein: "); 
         System.in.read (eingabe); 
         matrikelnummer = new String (eingabe).trim(); 
         System.out.println(); 
      } 
      catch (IOException e) 
      { 
         System.out.println ("Eingabefehler" + e.toString()); 
      } 
   } 

   public void print() 
   { 
      super.print(); 
      System.out.println ("Matrikelnummer: " + matrikelnummer); 
   } 
} 
