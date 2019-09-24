// Datei: Start.java

public class Start 
{
   public static void main (String[] args) 
   {
      int gewicht = 80;
      String[] an  = {"Thomas Vollmer",
                      "Flandernstrasse 101", "73730 Esslingen"};
      String[] von = {"Bernhard Hirschmann",
                      "Hölderlinweg 161", "73728 Esslingen"};
      Sendung brief = new Sendung (an, von, gewicht);
      Postamt post  = new Postamt();
      post.versende (brief);
   }
}
