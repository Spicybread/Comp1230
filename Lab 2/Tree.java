import java.io.*;

/**
*
*
*
* 
**/

class Tree extends Plant 
{
	private double height;
	public static void main(String[] args) 
	{
		

	}
	//unparameterized constructor
	public Tree()
	{
		super();
		height = 0.0;

	}
	//parmaitized constructor
	public Tree(String name, int lifespan, double height)
	{
		
		super(name,lifespan);	
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
		
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	} 
	
	public String toString()
	{
		return String.format(super.toString() + " " + height);
	}
	
	
}