//Datei: Arzneimittellager.java

public class Arzneimittellager {

   public static void main (String[] args)
   {
      Arzneimittel mittel = new Arzneimittel ("Schmerzmittel");
      Tablette tablette = new Tablette ("Schmerztablette", 12);
      Salbe salbe = new Salbe ("Wundsalbe", 200);
      Augensalbe augensalbe = new Augensalbe ("Augensalbe", 50);

      mittel.print();
      tablette.print();
      salbe.print();
      augensalbe.print();
   }
}
