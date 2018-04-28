package oopfundamentals;

public class DiceGame {

	public static void main(String[] args) {
		
		
		
		
		// create the Dice Objects
		
		Dice d1;
		d1=new Dice();
		Dice d2=new Dice();
		
		// creare Player
		
		Player p1=new Player();
		Player p2=new Player();
		
		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);
		
	if(p1.value>p2.value)
	{
		System.out.println("P1 Wins The Game");
	}
	else
	{
		System.out.println("p2 Wins The Game");
	}
	}

}
