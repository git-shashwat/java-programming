import java.io.*; 

interface Voting { 
	
	void changeBallot(int a); 
	void boostCount(int a); 
	void stopCount(int a); 
} 

class Biden implements Voting{ 
	
	int votes; 
	int ballot; 
	
	// to change ballot 
	@Override
	public void changeBallot(int newBallot){ 
		
		ballot = newBallot; 
	} 
	
	// to increase votes 
	@Override
	public void boostCount(int increment){ 
		
		votes = votes + increment; 
	} 
	
	// to decrease votes 
	@Override
	public void stopCount(int decrement){ 
		
		votes = votes - decrement; 
	} 
	
	public void printStates() { 
		System.out.println("votes: " + votes 
			+ " ballot: " + ballot); 
	} 
} 

class Main { 
	
	public static void main (String[] args) { 
	
		// creating an instance of Biden 
		// doing some operations 
		Biden biden = new Biden(); 
		biden.changeBallot(2); 
		biden.boostCount(3); 
		biden.stopCount(1); 
		
		System.out.println("Biden present state :"); 
		biden.printStates(); 
	} 
} 

