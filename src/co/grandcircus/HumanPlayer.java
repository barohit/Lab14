package co.grandcircus;
import java.util.Scanner;

public class HumanPlayer extends Player {


	public Roshambo generateRoshambo () {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Rock, paper, or scissors? (R/P/S)"); 
		String userInput = Validator.validateGameChoice(scan); 
		userInput = userInput.toLowerCase(); 
		Roshambo ro = null; 
		
		switch (userInput) {
		case "rock": 
			ro = Roshambo.ROCK; 
			break;
		case "paper": 
			ro = Roshambo.PAPER; 
			break;
		case "scissors": 
			ro = Roshambo.SCISSORS;
			break;
		default: 
			break; 
		}
		return ro; 
		
	}
}
