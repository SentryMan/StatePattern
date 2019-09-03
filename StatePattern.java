package com.collabera.state;

//Java program to demonstrate working of 
//State Design Pattern 

interface AmericaState {
	
	public void punch(); 
} 

class TheUnitedStatesOfAmerica { 
	
	private AmericaState currentMood; 

	public TheUnitedStatesOfAmerica(){ 
		
		currentMood = new Happy(); 
	} 

	public void setState(AmericaState state){ 
		
		currentMood = state; 
		
	} 

	public void punch() { 
		
		currentMood.punch(); // what this does will change depending on what state america is in
	} 
} 

class Happy implements AmericaState { 
	
	public void punch() { 
		
		System.out.println("\nThe United States of America is so happy that it has decide to clean Russia's clock"); 
	} 

} 

class Sad implements AmericaState { 
	

	public void punch(){
		
		System.out.println("\nThe United States of America has just punched out China in its sadness"); 
	} 

} 

class StatePattern { 
	
	public static void main(String[] args){ 
		
		TheUnitedStatesOfAmerica stateContext = new TheUnitedStatesOfAmerica(); 
		stateContext.punch(); 
		stateContext.setState(new Sad()); 
		stateContext.punch(); 
			 
	} 
} 
