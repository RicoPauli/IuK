// Datei: Login.java

public class Login {

   private boolean angemeldet;
   
   public void anmelden (String benutzer, String passwort) 
      throws ZugriffUngueltigException
   {
      assert (benutzer.equals ("user") && 
              passwort.equals ("pass")) : "Falsche Zugangsdaten";
      
      if (benutzer.equals ("user") && passwort.equals ("pass"))
      {
         this.angemeldet = true;
      } 
      else 
      {
         throw new ZugriffUngueltigException ("Ungueltige Zugangsdaten");
      }
   }
   
   public void abmelden()
   {
      this.angemeldet = false;
   }
   
   public void bearbeiten() throws KeineBerechtigungException 
   {
      if(!angemeldet)
      {
         throw new KeineBerechtigungException("Keine Berechtigung");
      }
      
      System.out.println("Bearbeitung erfolgreich");
   }
}
