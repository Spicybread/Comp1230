/**
*
*
*
* 
**/

class PlantTest 
{
	public static void main(String[] args) 
	{
		
		//Testing Plant parameterized and default constructor
		Plant plant1 = new Plant();
		Plant plant2 = new Plant("Cedar", 10);
		
		//Testing Plant mutator and accessor 
		System.out.println("Testing plant1 toString\n" + plant1.toString());
		System.out.println("\nTesting plant2 toString\n" + plant2.toString());
		
		plant1.setName("Oak");
		plant1.setLifespan(100);
		System.out.print("\nTesting plant1 get and set method: " + 
						plant1.getName() + ", " + plant2.getLifespan());
		
		

		
		

	}
}