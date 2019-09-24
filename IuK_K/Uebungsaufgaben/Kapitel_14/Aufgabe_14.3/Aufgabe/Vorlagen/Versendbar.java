// Datei: Versendbar.java

public interface Versendbar extends Adressierbar 
{
   public void setAbsender (String[] absender);
   public String[] getAbsender();
   public int getGewicht();
}
