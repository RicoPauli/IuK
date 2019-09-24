// Datei: TestTanken.java

public class TestTanken
{
   public static void main (String [] args)
   {
      Tanksaeule tanksaeule = new Tanksaeule();
      Tank tank = new Tank (50);
      tanksaeule.tankstutzenEntnehmen (tank);
      tanksaeule.startTanken();
   }
}