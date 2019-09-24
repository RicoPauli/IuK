// Datei: Tank.java

public class Tank
{
   private int maxVolumen;
   private int tankinhalt;
   private FuellstandSensor fuellstandSensor;

   public Tank (int volumen)
   {
      this.maxVolumen = volumen;
      tankinhalt = 0;
   }

   public void anmeldenFuellstandSensor (FuellstandSensor fuellstandSensor)
   {
      this.fuellstandSensor = fuellstandSensor;
   }

   public int fuellen()
   {
      tankinhalt++;
      fuellstandSensor.meldeFuellstand (tankinhalt, maxVolumen);
      return tankinhalt;
   }
}
