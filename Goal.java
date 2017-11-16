package move;

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
		int temp = 0;
		for (int i = 0; i < user.getFitness().size(); i++)
		{
			temp += user.getFitness().get(i).getCalories();
		}
		return goalCalories - temp;
	}
	public double calculateRemainingDistance(User user)			
	{
		double temp = 0;
		for (int i = 0; i < user.getFitness().size(); i++)
		{
			temp += user.getFitness().get(i).getDistance();
		}
		return goalDistance - temp;
	}
	public double calculateRemainingSteps(User user)			
	{
		int temp = 0;
		for (int i = 0; i < user.getFitness().size(); i++)
		{
			temp += user.getFitness().get(i).getSteps();
		}
		return goalSteps - temp;
	}
	
	public void printGoal() {
		System.out.println("Your goal is to burn " + this.goalCalories + " calories and to walk " + this.goalDistance);
	}

}

