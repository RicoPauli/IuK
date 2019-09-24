//Datei: ZahlenVergleich.java

public class ZahlenVergleich
{
	public int eingabeZahl()
	{
	   try
	   {
	      java.util.Scanner scanner = 
	         new java.util.Scanner (System.in);
	      System.out.print ("Gib einen Wert ein: ");
	      return scanner.nextInt();
	   }
	   catch (Exception e)
	   {
	      System.out.println (e);
	   }
	   return -1;
	}
	. . . . .
}
