// Datei: TestBenutzerLogin.java

import java.io.*;

public class TestBenutzerLogin
{
   public static final String DATEI = "anmeldedaten.txt";
   
   public static void main (String[] args)
   {
      BenutzerLogin benutzerLogin = new BenutzerLogin ("admin", "geheim");
      
      benutzerLogin.print();
      benutzerLogin.anmelden ("geheim");
      benutzerLogin.print();
      
      try
      {
         ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream (TestBenutzerLogin.DATEI));
         out.writeObject (benutzerLogin);
         out.close();
         
         ObjectInputStream in = new ObjectInputStream (new FileInputStream (TestBenutzerLogin.DATEI));
         ((BenutzerLogin) in.readObject()).print();
         in.close();
      }
      catch (IOException e)
      {
         System.err.println ("Fehler beim Dateizugriff");
      }
      catch (ClassNotFoundException e) 
      {
         System.err.println ("Das eingelesene Objekt enstpricht einem unbekannten Typ");
      }
   }
}
