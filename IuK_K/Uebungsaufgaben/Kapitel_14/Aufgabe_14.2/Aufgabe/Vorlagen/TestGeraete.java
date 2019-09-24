// Datei: TestGeraete.java

public class TestGeraete
{
   public static void main (String[] args) 
      throws CloneNotSupportedException
   {
      Laserdrucker l1 = new Laserdrucker(120);
      Laserdrucker l2 = l1.clone();

      l1.drucken ("Dies ist ein Test");
      l1.drucken ("Dies ist ein Test");

      // Das geklonte Objekt besitzt vor dem folgenden       
      // Druckvorgang weiterhin 120 Druckpapiere und ist somit
      // keine Referenz auf den ersten Laserdrucker.
      l2.drucken ("Dies ist ein Test");
   }
}
