// Datei: BenutzerLogin.java

import java.io.*;

public class BenutzerLogin implements Externalizable
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
   
   public void readExternal (ObjectInput in) throws IOException,
         ClassNotFoundException 
   {
      name = (String) in.readObject();
      passwort = (String) in.readObject();
   }

   public void writeExternal (ObjectOutput out) throws IOException 
   {
      out.writeObject (name);
      out.writeObject (passwort);
   }
}
