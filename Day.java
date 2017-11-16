package org.move.system;

import java.util.ArrayList;

public class Day {
	private ArrayList<Fitness> fitness;
	private double totalCalories;
	private double totalDistance;
	private int totalSteps;
	private int totalFlightsOfStairs;
	
	public Day() {
		fitness = new ArrayList<Fitness> ();
		totalCalories = 0.0;
		totalDistance = 0.0;
		totalSteps = 0;
		totalFlightsOfStairs = 0;
	}
	
	public ArrayList<Fitness> getFitness() {
		return fitness;
	}
	
	public void setFitness(Fitness newFitness) {
		fitness.add(newFitness);
	}
	
	public double getCalories() {
		return totalCalories;
	}
	
	public void setCalories(double calories) {
		totalCalories = calories;
	}
	
	public double getDistance() {
		return totalDistance;
	}
	
	public void setDistance(double distance) {
		totalDistance = distance;
	}
	
	public int getSteps() {
		return totalSteps;
	} 
	
	public void setSteps(int steps) {
		totalSteps = steps;
	}
	
	public int getFlightofStairs() {
		return totalFlightsOfStairs;
	} 
	
	public void setFlightofStairs(int stairs) {
		totalFlightsOfStairs = stairs;
	}
	
}
