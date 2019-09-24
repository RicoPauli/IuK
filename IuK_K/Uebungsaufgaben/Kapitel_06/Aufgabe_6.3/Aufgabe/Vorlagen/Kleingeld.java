// Datei: Kleingeld.java

public class Kleingeld
{
   public static void main (String[] args)
   {
      System.out.println ("Es gibt die folgenden Muenzen:");
      Muenze[] euroMuenzen = . . . . .;
      for (int i = 0; i < euroMuenzen.length; i++)
      {
         System.out.print (euroMuenzen [i] + " ");
      }
      System.out.println();

      for (int i = 0; i < euroMuenzen.length; i++)
      {
         switch (. . . . .)
         {
            case . . . . .:
            case . . . . .:
            case . . . . .:
            {
               System.out.println ("Die Muenze " + 
               euroMuenzen[i]. . . . .  + " ist aus " +
               Metall.Kupfer. . . . . + " und hat den Wert " +
               euroMuenzen[i]. . . . . + " Cent");
               break;
            }
            case . . . . .:
            case . . . . .:
            {
               System.out.println ("Die Muenze " +
               euroMuenzen[i]. . . . . + " ist aus " +
               Metall.Messing. . . . . +" und hat den Wert " +
               euroMuenzen[i]. . . . . +  " Cent");
               break;
            }
            case . . . . .:
            case . . . . .:
            {
               System.out.println ("Die Muenze " +
               euroMuenzen[i]. . . . . + " ist aus " +
               Metall.MessingUndNickel. . . . . +
               " und hat den Wert " + 
               euroMuenzen[i]. . . . . + " Cent");
               break;
            }
         }
      }
   }
}
