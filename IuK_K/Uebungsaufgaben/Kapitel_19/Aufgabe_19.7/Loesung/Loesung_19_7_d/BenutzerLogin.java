// Datei: BenutzerLogin.java

import java.io.Serializable;

public class BenutzerLogin implements Serializable
{
   private String name;
   private String passwort;
   private transient boolean online;
   private static final long serialVersionUID = 1L;
   
   public BenutzerLogin (String name, String passwort)
   {
      this.name = name;
      this.passwort = passwort;
   }
   
   public void anmelden (String passwort)
   {
      if (this.passwort.equals (passwort))
      {
         online = true;
      }
   }
   
   public void print()
   {
      System.out.println ("Benutzername: " + name);
      System.out.println ("Online: " + online);
      System.out.println();
   }
}
