package org.move.system;

public class Driver1 {
	
	public static void main(String[] args) {
		
		//Initialize Move
		Move moveTest = new Move();
		
		//Create an account
		Account accountTest = new Account();
		
		//Create user
		User userTest = new User();
		
		//Create day
		Day dayOne = new Day();
		
		//Create fitness
		Fitness fitnessTest = new Fitness();
		
		//Create Health
		Health healthTest = new Health();
		
		//Create Goal
		Goal goalTest = new Goal();
		
		//Create Progress
		//Progress progressTest = new Progress();
		
		//Set attributes
		accountTest.setUsername("popcicle97");
		accountTest.setPassword("dogsarecute53");
		
		userTest.setName("Stitch");
		userTest.setAge(22);
		userTest.setLocation("Tucson, Az");
		userTest.setWeight(120);
		userTest.setHeight(62);
		
		accountTest.newUser(userTest);
		
		fitnessTest.setCalories(200);
		fitnessTest.setDistance(3);
		fitnessTest.setFlightofStairs(40);
		fitnessTest.setPathName("Three Mile Run");
		fitnessTest.setSteps(120);
		
		dayOne.setFitness(fitnessTest);
		userTest.setFitness(fitnessTest);
		
		healthTest.setSleep(8);
		healthTest.setBloodPressure(120);
		healthTest.setHeartRate(60);
		
		userTest.setHealth(healthTest);
		
		goalTest.setGoalCalories(300);
		goalTest.setGoalDistance(5);
		goalTest.setGoalSteps(150);
		
		userTest.setGoals(goalTest);
		
		//Printing Information
		System.out.println("Printing account information:");
		
		accountTest.printUsername();
		accountTest.printPassword();
		
		System.out.println("\nPrinting user information:");
		userTest.printUserInfo();
		userTest.printFitness();
		
		System.out.println("\nPrinting user health information:");
		healthTest.printBloodPressure();
		healthTest.printHeartRate();
		healthTest.printSleep();
		
		System.out.println("\nPrinting fitness information:");
		fitnessTest.printPath();
		
		System.out.println("\nPrinting goal information:");
		goalTest.printGoal();
		goalTest.printRemainingGoal(userTest);
		
	}
	
}
