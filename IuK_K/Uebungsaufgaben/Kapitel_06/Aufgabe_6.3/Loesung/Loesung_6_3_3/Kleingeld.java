// Datei: Kleingeld.java
public class Kleingeld
{
   public static void main (String [] args)
   {
      System.out.println ("Es gibt die folgenden Muenzen:");
      Muenze[] euroMuenzen = Muenze.values();
      for (int i = 0; i < euroMuenzen.length; i++)
      {
         System.out.print (euroMuenzen [i] + " ");
      }
      System.out.println();

      for (int i = 0; i < euroMuenzen.length; i++)
      {
         switch (euroMuenzen[i])
         {
            case EinCent:
            case ZweiCent:
            case FuenfCent:
            {
               System.out.println ("Die Muenze " + 
                                   euroMuenzen[i].name() + 
                                   " ist aus " +
                                   Metall.Kupfer.name() + 
                                   " und hat den Wert " + 
                                   euroMuenzen[i].value() + 
                                   " Cent");
               break;
            }

            case ZehnCent:
            case ZwanzigCent:
            case FuenfzigCent:
            {
               System.out.println ("Die Muenze " + 
                                   euroMuenzen[i].name() + 
                                   " ist aus " +
                                   Metall.Messing.name() + 
                                   " und hat den Wert " + 
                                   euroMuenzen[i].value() + 
                                   " Cent");
               break;
            }

            case EinEuro:
            case ZweiEuro:
            {
               System.out.println ("Die Muenze " + 
                                   euroMuenzen[i].name() + 
                                   " ist aus " +
                                Metall.MessingUndNickel.name() + 
                                   " und hat den Wert " + 
                                   euroMuenzen[i].value() + 
                                   " Cent");
               break;
            }
         }
      }
   }
}
