package move;

public class Health {
	private double sleepHours;
	private int bloodPressure;
	private int heartRate;
	
	public Health() {
		this.sleepHours = 0.0;
		this.bloodPressure = 0;
		this.heartRate = 0;
	}
	
	public double getSleep() {
		return sleepHours;
	}
	public void setSleep(double sleepTime) {
		this.sleepHours = sleepTime;
	}
	
	public int getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int rate) {
		this.heartRate = rate;
	}
	
	public void printSleep() {
		System.out.println("You are sleeping " + this.sleepHours + " many hours");
	}
	
	public void printBloodPressure() {
		System.out.println("Your average blood pressure is " + this.bloodPressure);
	}
	
	public void printHeartRate() {
		System.out.println("Your average heart rate is " + this.heartRate);
	}
}
