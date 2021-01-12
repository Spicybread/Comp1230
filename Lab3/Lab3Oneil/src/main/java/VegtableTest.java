/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
public class VegtableTest 
{
     
     public static void main(String[] args) 
     {
          
         
          
          
          //testing vegtable constructors 
          Vegtable veg1 = new Vegtable();
          Vegtable veg2 = new Vegtable("Squash", 13, "creamy", "Cooking", "Cucurbita");
          
          
          
          //Testing toString methods
          System.out.println("Testing veg1 toString " + veg1.toString());
          System.out.println("Testing veg2 toString " + veg2.toString());
          
          
          //Testing mutator and accessor methods from both parent and subclass
          veg1.setName("Melon");
          veg1.setLifespan(22);
          veg1.setFlavour("Sweet");
          veg1.setPlantUse("eating");
          veg1.setBotanicalName("Cucumis melo");
          
          System.out.printf("Testing veg1 get and set methods: %s , %d , %s , %s , %s", 
                    veg1.getName(), veg1.getLifespan(),veg1.getFlavour(), 
                    veg1.getPlantUse(), veg1.getBotanicalName());
          
          System.out.println();
          //Testing abstract method from parent
          System.out.println("\nTesting veg1 abstract method: ");
          veg1.botanicalName();
          veg1.plantUsage();
          
          
          System.out.println("\nTesting veg2 abstract method: ");
          veg2.botanicalName();
          veg2.plantUsage();
          
          
          
          
     }
                                                                      
     
}
