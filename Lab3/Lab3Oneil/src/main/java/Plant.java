import java.io.*;

/**
 * Name: Vu Nguyen
 * Student Number: T00612390
 * Due Date : September 24, 2019
 * Seminar number : 2
 * 
 * Program Description: This programs main function is to create Plants/Flowers/Trees objects. 
 *                       This file class is the parent class for the Tree and Flower class
 * 
 */

abstract class Plant 
{
	private String name;
     
     //lifespan is in weeks
	private int lifespan;
	
	public static void main(String[] args)
	{
	
	}
	//default plant constructor
	public Plant()
	{
		name = "Undeclared name";
		lifespan = 0;
		 
	}
	//parameterized plant constructor
	public Plant (String name, int lifespan)
	{
	this.name = name;
	this.lifespan = lifespan;
	
	}
     
     
     //abstract method to be used to describe the plant's useage
     abstract public void plantUsage();
     
     //abstract method to be used to return botanical name of plant
     abstract public void botanicalName();
     

     
     
	//getName returns name
	public String getName()
	{
		return name;
		
	}
	//getLifespan returns lifespan
	public int getLifespan()
	{
		return lifespan;
		
	}
	
	//setName sets the name
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	//setLifespan sets the plants lifespan
	public void setLifespan(int lifespan)
	{
          //lifespan is in weeks
		this.lifespan = lifespan;
	}
	
     //toString displays plant() data
	public String toString()
	{
		return String.format(getName() + " " + getLifespan());
	}
	
}