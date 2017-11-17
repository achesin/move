package move;

public class Progress {
	private double dailyProgress;
	private double monthlyProgress;
	private double yearlyProgress;
	private double lifetimeProgress;
	
	public Progress() {
		this.dailyProgress = 0.0;
		this.monthlyProgress = 0.0;
		this.yearlyProgress = 0.0;
		this.lifetimeProgress = 0.0;
	}
	
	public double getDaily() {
		return dailyProgress;
	}
	public void setDaily(double daily) {
		this.dailyProgress = daily;
	}
	
	public double getMonthly() {
		return monthlyProgress;
	}
	public void setMonthly(double monthly) {
		this.monthlyProgress = monthly;
	}
	
	public double getYearly() {
		return yearlyProgress;
	}
	public void setYearly(double yearly) {
		this.yearlyProgress = yearly;
	}
	
	public double getLifetime() {
		return lifetimeProgress;
	}
	public void setLifetime(double lifetime) {
		this.lifetimeProgress = lifetime;
	}
}
