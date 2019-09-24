// Datei: Tanksaeule.java

public class Tanksaeule
{
   private Tank tank;
   private boolean stopFuellen;

   public Tanksaeule()
   {
      stopFuellen = false;
   }

   public void tankstutzenEntnehmen (Tank tank)
   {
      this.tank = tank;
   }

   public void startTanken()
   {
      FuellstandSensor fuellstandSensor = new FuellstandSensor() 
      {
         public void meldeFuellstand (int fuellstand, int maxVolumen)
         {
            if (fuellstand >= maxVolumen)
            {
               stopFuellen = true;
            }
            System.out.println ("Fuellstand: " + fuellstand + " Liter / " 
                                + fuellstand*100/maxVolumen + "%");
         }
      };

      tank.anmeldenFuellstandSensor (fuellstandSensor);

      while (stopFuellen == false)
      {
         tank.fuellen();
      }
      System.out.println ("Tankvorgang beendet.");
   }
}
