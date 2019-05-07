package co.grandcircus;

import java.util.Scanner;

import co.grandcircus.Player.Roshambo;

public class RoshamboApp {

	public static void main(String[] args) {
		int winCount = 0; 
		int lossCount = 0; //  for the extended challenge. 
		
		System.out.println("Welcome to Rock Paper Scissors!"); 
		System.out.println("Enter your name: "); 
		Scanner scan = new Scanner(System.in); 
		String name = scan.next(); 

		HumanPlayer human = new HumanPlayer(); //
		
		System.out.println("Would you like to play against TheJets or TheSharks? (enter j or s for each respectively)");
		char userChoice = Validator.validateGameChoice2(scan); // a modification of the yes or no continue validator, but uses j or s instead of y or n
		Player opponent = null;   
		String opponentsName = ""; //jets or sharks
		if (userChoice == 'j') {
			opponent = new RockPlayer(); // assuming Jets is the Rock only player.
			opponentsName = "TheJets"; 
		} else if (userChoice == 's') {
			opponent = new RandomPlayer(); 
			opponentsName = "TheSharks"; 
		}
		
		char playAgain = 'y'; 
		Roshambo humanChoice = null; // these will generate the Roshambo values
		Roshambo opponentChoice = null; 
		
		while (playAgain == 'y') {
			humanChoice = human.generateRoshambo(); 
			opponentChoice = opponent.generateRoshambo(); 
			System.out.println(name + ": " + humanChoice); 
			System.out.println(opponentsName + ": " + opponentChoice);   
			if (humanChoice == opponentChoice) {
				System.out.println("Draw!"); 
			}
			if ((humanChoice == Roshambo.PAPER && opponentChoice == Roshambo.ROCK) || (humanChoice == Roshambo.ROCK && opponentChoice == Roshambo.SCISSORS) || (humanChoice == Roshambo.SCISSORS && opponentChoice == Roshambo.PAPER)) {
				System.out.println(name + " wins!"); 
				winCount++; 
			}
			
			if ((humanChoice == Roshambo.PAPER && opponentChoice == Roshambo.SCISSORS) || (humanChoice == Roshambo.ROCK && opponentChoice == Roshambo.PAPER)|| (humanChoice == Roshambo.SCISSORS && opponentChoice == Roshambo.ROCK)) {
				System.out.println(opponentsName + " wins!"); 
				lossCount++; 
			}
			
			System.out.println("Would you like to play again?");
			playAgain = Validator.validateChar(scan); 
			if (playAgain == 'n') {
				System.out.println("Thank you for playing! Your score was: ");
				System.out.println(winCount + " wins."); 
				System.out.println(lossCount + " losses."); 
			}
		}
		
	}

}
