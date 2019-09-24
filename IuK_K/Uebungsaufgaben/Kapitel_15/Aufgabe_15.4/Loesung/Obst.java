// Datei: Obst.java

public interface Obst
{
   public abstract String getObstname();
   public abstract int getAnzahl();

   public static class Obstmengenausgabe
   {
      public static void print (Obst obst)
      {
         System.out.println ("Obstname: " + obst.getObstname() + " Anzahl: " + obst.getAnzahl());
      }
   }
}