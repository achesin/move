package move;

import java.util.ArrayList;


public class User {
	private String name;
	private String location;
	private int age;
	private int height;
	private double weight;
	private ArrayList<Fitness> fitnessProfile = new ArrayList<Fitness>();
	private Health healthProfile;
	private Goal personalGoals;
	private Progress userProgress;
	
	public User() {
		this.name = "";
		this.location = "";
		this.age = 0;
		this.height = 0;
		this.weight = 0.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String residence) {
		this.location = residence;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int hgt) {
		this.height = hgt;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double wgt) {
		this.weight = wgt;
	}
	
	public ArrayList<Fitness> getFitness() {
		return fitnessProfile;
	}
	public void setFitness(Fitness exercise) {
		fitnessProfile.add(exercise);
	}
	
	public Health getHealth() {
		return healthProfile;
	}
	public void setHealth(Health userHealth) {
		this.healthProfile = userHealth;
	}
	
	public Goal getGoals() {
		return personalGoals;
	}
	public void setGoals(Goal newGoal) {
		this.personalGoals = newGoal;
	}
	
	public Progress getProgress() {
		return userProgress;
	}
	public void setProgress(Progress userProgress) {
		this.userProgress = userProgress;
	}
	
	//print function ALL OF IT
	public void printUserInfo() {
		System.out.println("Name: "+ this.name + "\nLocation: " + this.location + "\nAge: " + this.age + "\nHeight: " + this.height + "\nWeight: " + this.weight);
		
	}
	
	public void printFitness() {
		for (Fitness f: fitnessProfile) {
			System.out.println(f.getPathName() + f.getDistance());
		}
	}
}
