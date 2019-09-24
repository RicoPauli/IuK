// Datei: Konto.java

public class Konto
{
   private Person person;
   private double kontostand;

   public Konto (String name, String vorname, float kontostand)
   {
      person = new Person();
      person.setName (name);
      person.setVorname (vorname);
      this.kontostand = kontostand;
   }

   public double getKontostand()
   {
      return kontostand;
   }

   public void setKontostand (double kontostand)
   {
      this.kontostand = kontostand;
   }

   public String getName()
   {
      return person.getName();
   }

   public void setName (String name)
   {
      person.setName (name);
   }
}
