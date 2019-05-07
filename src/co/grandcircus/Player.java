package co.grandcircus;

public abstract class Player {

	protected String name; 
	
	enum Roshambo {ROCK, PAPER, SCISSORS; 
		
		public String toString() {
			String result = ""; 
			if (this == Roshambo.ROCK) {
				result = "Rock"; 
			} else if (this == Roshambo.PAPER) {
				result = "Paper"; 
			} else if (this == Roshambo.SCISSORS) {
				result = "Scissors"; 
			}
			return result; 
		}
		
	}
	
	public abstract Roshambo generateRoshambo(); 
}
