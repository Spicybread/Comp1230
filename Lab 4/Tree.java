import java.io.*;

/**
*
*
*
* 
**/

public class Tree extends  Plant implements  Comparable<Tree>
{
	private Double height = 0.0;
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
	public Tree(String name, int lifespan, Double height)
	{
		
		super(name,lifespan);	
		this.height = height;
	}
	
	public Double getHeight()
	{
		return height;
		
	}
	
	public void setHeight(double height)
	{
		this.height = height;
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
	public int compareTo(Tree t)
	{
		if(this.getHeight() < t.getHeight())
			return -1;
			
		if(this.getHeight() > t.getHeight())
			return 1;
			
		else {
			return 0;
		}
	}
	
	
	@Override
	public boolean equals(Object t)	
	{
		super.equals(t);
		
	
	Tree tree = (Tree)t;	
		
		return this.getHeight().equals(tree.getHeight());
		
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + " " + height);
	}
	
	
	
	
}