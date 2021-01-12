/**
*
*
*
* 
**/

class Flower extends Plant
{
	private String colour;
	
	public static void main(String[] args) 
	{


	}
	
	public Flower()
	{
		super();
		colour = "Undecalred colour";
		
	}
	
	public Flower(String name, int lifespan, String colour)
	{
		super(name, lifespan);
		this.colour = colour;
	}
	
	public String getColour()
	{
		return colour;
		
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}


	@Override
	 public void plantUsage()

	{
	
	}
				
	 @Override
	 public void botanicalName()
	 {
								
	 }
	
	@Override
	public boolean equals(Object f)	
		{
		super.equals(f);
			
		
		Flower flower = (Flower)f;	
			
		return this.getColour().equals(flower.getColour());
			
		}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + " " + colour);

	}
}