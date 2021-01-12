/**
*
*
*
* 
**/

class plantTester {
	public static void main(String[] args) 
	{
		
		System.out.println();
		
		Plant [] plantArray = new Plant[6];
		
		plantArray[0] = new Tree("Oak", 12, 22.2);
		plantArray[1] = new Tree("Pine", 10, 10.11);
		
		plantArray[2] = new Flower("Daisy", 5, "Yellow");
		plantArray[3] = new Flower("Lily", 12, "Blue");

		plantArray[4] = new Vegtable("Squash", 8, "soft", "soup", "Squashitous");
		plantArray[5] = new Vegtable("Carrot", 12, "gritty", "Cake", "Carrotius");	
		
		System.out.println("Listing array elements: ");	
		for(int i = 0; i < plantArray.length; i++)
		{
			System.out.println(plantArray[i]);


		}		
		
		
		//casting from plantArray to Tree, Flower, or Vegtable

		Tree tree1 = (Tree)plantArray[0];
		Tree tree2 = (Tree)plantArray[1];
		
		Flower flower1 = (Flower)plantArray[2];
		Flower flower2 = (Flower)plantArray[3];
		
		Vegtable veg2 = (Vegtable)plantArray[4];
		Vegtable veg1 = (Vegtable)plantArray[5];
		
		
		//Testing set and get for Tree class
		
		tree1.setName("Mahagony");
		tree1.setLifespan(45);
		tree1.setHeight(45.9);
		
		System.out.printf("%nTesting get and set for tree1: %s, %d , %f%n", 
						tree1.getName(), tree1.getLifespan(), tree1.getHeight());

		tree2.setName("Redwood");
		tree2.setLifespan(900);
		tree2.setHeight(200.5);

		System.out.printf("%nTesting get and set for tree2: %s, %d , %f%n", 
						tree2.getName(), tree2.getLifespan(), tree2.getHeight());		
		
		
		//Testing set and get for Flower class
		
		flower1.setName("Petunias");
		flower1.setLifespan(3);
		flower1.setColour("Red");
		
		
		System.out.printf("%nTesting get and set for flower1: %s, %d, %s%n", 
					flower1.getName(), flower2.getLifespan(), flower1.getColour());
					
		flower2.setName("Tulips");
		flower2.setLifespan(3);
		flower2.setColour("purple");
					
					
		System.out.printf("%nTesting get and set for flower2: %s, %d, %s%n", 
			flower2.getName(), flower2.getLifespan(), flower2.getColour());					
		
		
		
		//Testing set and get for Vegtable class
		veg1.setName("Cabbage");
		veg1.setLifespan(2);
		veg1.setFlavour("Bland");
		veg1.setPlantUse("Sandwich");
		veg1.setBotanicalName("Letticuse");
	
		System.out.printf("%nTesting set and get for veg1: %s, %d, %s, %s , %s%n", 
						veg1.getName(), veg1.getLifespan(), veg1.getFlavour(), 
						veg1.getPlantUse(), veg1.getBotanicalName());
	
	
		veg2.setName("Corn");
		veg2.setLifespan(9);
		veg2.setFlavour("Ew");
		veg2.setPlantUse("soup");
		veg2.setBotanicalName("Cornucous");
	
		System.out.printf("%nTesting set and get for veg2: %s, %d, %s, %s , %s%n", 
					veg2.getName(), veg2.getLifespan(), veg2.getFlavour(), 
					veg2.getPlantUse(), veg2.getBotanicalName());	
					
		
		//Testing Tree compareTo method
		
		System.out.println("\nTesting Tree compareTo method, tree1 compareTo tree2: expected outcome is -1  real out come: " + tree1.compareTo(tree2));
		
		System.out.println("\nTesting Tree compareTo method, tree2 compareTo tree1: expected outcome is 1  real out come: " + tree2.compareTo(tree1));
		
		System.out.println("\nTesting Tree compareTo method, tree2 compareTo tree2: expected outcome is 0  real out come: " + tree2.compareTo(tree2));
		
		
		
		//Testing Equals method


		//Tree test
		System.out.println("\n\nTesting equals method for Tree class");
		System.out.println("tree1 equals tree2 expected output: false  real output:" + tree1.equals(tree2));

		Tree tree3 = tree2;
		
		System.out.println("tree2 equals tree2 expected output: true  real output:" + tree2.equals(tree2));



		//Flower test
		System.out.println("\n\nTesting equals method for Flower class");
		System.out.println("flower1 equals flower2 expected output: false  real output:" + flower1.equals(flower2));		

		Flower flower3 = flower2;
		
		System.out.println("flower2 equals flower3 expected output: true  real output:" + flower2.equals(flower3));		
		
		
		//Vegtable test
		System.out.println("\n\nTesting equals method for Vegtable class");
		System.out.println("veg1 equals veg2 expected output: false  real output:" + veg1.equals(veg2));
		
		Vegtable veg3 = veg2;
		System.out.println("veg2 equals veg3 expected output: true  real output:" + veg2.equals(veg3));
		
		
		
		//Testing tostring
		
		//tree toString
		System.out.println("\n testing tostring for Tree:\n" + tree1.toString() +"\n " + tree2.toString());
		
		//flower toString
		System.out.println("\n testing tostring for Flower:\n" + flower1.toString() +"\n " + flower2.toString());
		
		//vegetable toString
			System.out.println("\n testing tostring for Vegtable:\n" + veg1.toString() +"\n " + veg2.toString());
	}
}