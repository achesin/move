package alli;

public class Goal {
	
	private int goalCalories;
	private double goalDistance;
	private int goalSteps;
	
	public Goal()
	{
		goalCalories = 0;
		goalDistance = 0;
		goalSteps = 0;
	}
	
	public int getGoalCalories()
	{
		return goalCalories;
	}
	public void setGoalCalories(int cal)
	{
		goalCalories = cal;
	}
	
	public double getGoalDistance()
	{
		return goalDistance;
	}
	public void setGoalDistance(double dis)
	{
		goalDistance = dis;
	}
	
	public int getGoalSteps()
	{
		return goalSteps;
	}
	public void setGoalSteps(int steps)
	{
		goalSteps = steps;
	}
	
	public int calculateRemainingCalories(User user)			
	{
		int temp = user.getCalories();
		return goalCalories - temp;
	}
	public double calculateRemainingDistance(User user)			
	{
		double temp = user.getDistance();
		return goalDistance - temp;
	}
	public double calculateRemainingSteps(User user)			
	{
		double temp = user.getSteps();
		return goalSteps - temp;
	}
	

}
