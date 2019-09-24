// Datei: Person.java 

package pers;

import java.io.*; 

public class Person 
{
   private String name; 
   private String vorname; 

   public Person() 
   { 
      try 
      { 
         byte[] eingabe = new byte[80]; 

         System.out.print ("Geben Sie den Nachnamen ein: "); 
         System.in.read (eingabe); 
         name = new String (eingabe).trim(); 

         eingabe = new byte[80]; 
         System.out.print ("Geben Sie den Vornamen ein: "); 
         System.in.read (eingabe); 
         vorname = new String (eingabe).trim(); 
      } 
      catch (IOException e) 
      { 
         System.out.println ("Fehler bei der Eingabe: " + 
                             e.toString()); 
      } 
   } 

   public void print() 
   { 
      System.out.println ("Nachname: " + name); 
      System.out.println ("Vorname: " + vorname); 
   } 
}
