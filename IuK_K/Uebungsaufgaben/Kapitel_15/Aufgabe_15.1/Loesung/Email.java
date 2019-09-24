// Datei: Email.java

public class Email
{
   private String empfaenger;
   private String absender;
   private String betreff;
   private String text;

   public Email (String empfaenger, String absender, String betreff, String text)
   {
      this.empfaenger = empfaenger;
      this.absender = absender;
      this.betreff = betreff;
      this.text = text;
   }

   public void senden()
   {
      //Inner class (local class)
      class InternetMailAddress
      {
         protected StringBuffer mailAddress;

         protected InternetMailAddress()
         {
            mailAddress = new StringBuffer();
         }

         protected boolean isValid (String address)
         {
            boolean valid = false;

            // Zur Ueberpruefung der Mailadresse werden regulaere Ausdruecke
            // verwendet.
            // Siehe Java Dokumentation fuer Klasse 'String', Methode
            // 'matches()'.
            if (address.matches ("[a-zA-Z_.0-9]+@[a-zA-Z_.0-9]+"))
            {
               // Die Mailadresse enthaelt ein '@'-Zeichen, das den Namen vom
               // Server trennt.
               // Sowohl der Namen als auch der Server koennen aus einem oder
               // mehreren Buchstaben
               //oder Ziffern bestehen.
               valid = true;
               mailAddress.delete (0, mailAddress.length());
               mailAddress.append (address);
            }
            else if (address.matches ("[a-zA-Z_.0-9]+\\*"))
            {
               // Die Mailadresse enthaelt kein '@'-Zeichen, besteht aber aus
               // einer Zeichenkette, die einen oder mehrere Buchstaben bzw.
               // Ziffern
               // enthaelt und mit einem '*'-Zeichen endet.
               valid = true;
               mailAddress.delete (0, mailAddress.length());
               mailAddress.append (address);
               mailAddress.replace (mailAddress.length() - 1, mailAddress.length(), "@it-designers.de");
            }

            return valid;
         }
      }// end of inner class InternetMailAddress

      try
      {
         InternetMailAddress addressVerifier;
         addressVerifier = new InternetMailAddress();

         if (addressVerifier.isValid (empfaenger) == true)
         {
            this.empfaenger = addressVerifier.mailAddress.toString();
         }
         else
         {
            throw new Exception ("Die Email-Adresse des Empfaengers ist ungueltig.\n");

         }
         if (addressVerifier.isValid (absender) == true)
         {
            this.absender = addressVerifier.mailAddress.toString();
         }
         else
         {
            throw new Exception ("Die Email-Adresse des Absenders ist ungueltig.\n");
         }

         System.out.println ("\n--------------------------------------------------------");
         System.out.println ("Mail von: " + absender);
         System.out.println ("An: " + empfaenger);
         System.out.println ("Betreff: " + betreff);
         System.out.println ("Text: ");
         System.out.println (text);
         System.out.println ("--------------------------------------------------------\n");
      }
      catch (Exception ex)
      {
         System.out.println ("\nDie Email konnte nicht verschickt werden!");
         System.out.println (ex.getMessage());
         System.out.println();
      }
   }

}// end of class Email
