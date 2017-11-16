package alli;

public class Fitness {
	
	private String pathName;
	private double distance;
	private int steps;
	private int flightOfStairs;
	private double caloriesBurned;
	
	public Fitness()
	{
		pathName = "";
		distance = 0;
		steps = 0;
		flightOfStairs = 0;
		caloriesBurned = 0;
	}
	
	public String getPathName()
	{
		return pathName;
	}
	public void setPathName(String name)
	{
		pathName = name;
	}
	
	public double getDistance()
	{
		return distance;
	}
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	public int getSteps()
	{
		return steps;
	}
	public void setSteps(int steps)
	{
		this.steps = steps;
	}
	
	public int getFlightofStairs()
	{
		return flightOfStairs;
	}
	public void setFlightofStairs(int stairs)
	{
		flightOfStairs = stairs;
	}
	
	public double getCalories()
	{
		return caloriesBurned;
	}
	public void setCalories(double calories)
	{
		caloriesBurned = calories;
	}

}
