import java.io.*;

/**
*
*
*
* 
**/

class Plant 
{
	private String name;
	private int lifespan;
	
	public static void main(String[] args)
	{
	
	}
	
	public Plant()
	{
		name = "Undeclared name";
		lifespan = 0;
		 
	}
	
	public Plant (String name, int lifespan)
	{
	this.name = name;
	this.lifespan = lifespan;
	
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public int getLifespan()
	{
		return lifespan;
		
	}
	
	
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public void setLifespan(int lifespan)
	{
		this.lifespan = lifespan;
	}
	
	public String toString()
	{
		return String.format(getName() + " " + getLifespan());
	}
	
}