/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
public class Vegtable extends Plant 
{
     private String flavour;
     private String plantUse;
     private String botanicalName;
     
     
     public static void main(String[] args)
     {
          
     }
     
    
     public Vegtable()
     {
          super();
          flavour = "undeclared flavour";
          plantUse = "no usage";
          botanicalName = "unknown botanical name";
          
          
     }
     
     public Vegtable(String name, int lifespan, String flavour, String plantuse, String botanicalName)
     {
          super(name, lifespan);
          this.flavour = flavour;
          this.plantUse = plantuse;
          this.botanicalName = botanicalName;
     }
     
     
     
     public String getFlavour()
     {
          return flavour;
     }
     
     public void setFlavour(String flavour)
     {
          this.flavour = flavour;
          
     }
     
     public String getPlantUse()
     {
          return plantUse;
     }
     
     
     public void setPlantUse(String plantuse)
     {
          this.plantUse = plantuse;

     }
     @Override
     
     public String getBotanicalName()
     {
          return botanicalName;

     }
     @Override
     public void setBotanicalName(String botanicalName)
     {
          this.botanicalName = botanicalName;
     }

     
     
     @Override
     public void plantUsage()
     {
          System.out.println("Plant use: " + plantUse);
    
     }
     @Override
     public void botanicalName()
     {
          System.out.println("Botanical name: " + botanicalName);
          
     }
     
     @Override
     public String toString()
     {
         return String.format(super.toString() + " " + flavour + " " + plantUse + " " +  botanicalName );
     }
     
     
}
