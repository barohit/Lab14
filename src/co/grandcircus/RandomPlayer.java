package co.grandcircus;
import java.util.Random;

public class RandomPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		Random randGen = new Random(); 
		int hashKey = randGen.nextInt(); 
		int randomChoice = Math.abs((hashKey % 3));
		Roshambo ro = null;
		// done in two steps instead of just generating a random number from 0 to 3 by passing the argument 3 to 
		//randGen.nextInt() for a reason: a larger selection of random numbers means it is more likely to truly be random
		switch (randomChoice) {
		case 1: 
			ro = Roshambo.ROCK; 
			break;
		case 2: 
			ro = Roshambo.PAPER; 
			break;
		case 3: 
			ro = Roshambo.SCISSORS;
			break;
		default: 
			break; 
		}
		return ro; 
	}

}
