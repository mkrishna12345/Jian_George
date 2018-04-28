package oopfundamentals;

public class Player {

	
	String name;
	int value;

	void throwDice(Dice diceOne, Dice diceTwo){

	diceOne.roll();
	diceTwo.roll();
	value = diceOne.faceValue + diceTwo.faceValue;

	}

}
