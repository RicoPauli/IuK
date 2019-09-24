// Datei: KreiseckTest.java

/**
 * @author Java Buch
 * 
 */
public class KreiseckTest
{
   /**
    * 
    * @param args
    */
   public static void main (String[] args)
   {
      Kreiseck kreiseckRef = new Kreiseck(1);
      System.out.println ("Radius = " + kreiseckRef.getKreis().getRadius());
      System.out.println ("Die Flaechendifferenz ist "
            + kreiseckRef.flaechendifferenz());
      kreiseckRef.skaliere (2);
      System.out.println ("Es wurde um den Faktor 2 skaliert");
      System.out.println ("Radius = " + kreiseckRef.getKreis().getRadius());
      System.out.println ("Die Flaechendifferenz ist "
            + kreiseckRef.flaechendifferenz());
   }
}
