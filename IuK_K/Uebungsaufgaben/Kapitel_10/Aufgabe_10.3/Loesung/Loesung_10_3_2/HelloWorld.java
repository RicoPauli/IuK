//HelloWorld.java

public class HelloWorld
{
   public static void main (String[] args)
   {
      //this.print();       //FALSCH! Die this-Referenz kann nicht mit statischen Methoden 
                            //bzw. statischen Datenfeldern verwendet werden.
      HelloWorld.print();   //Richtig!
   }
   
   public static void print()
   {
      System.out.println ("Hello World!");
   }
}