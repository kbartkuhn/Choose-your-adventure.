import java.util.Scanner;

public class Choose{

	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);	

		String Go, Soccer, Field, Nascar, Enemy;

		Main.StartingText();
		Go = keyboard.next();

		if (Go.equals("s")) {
			Main.ChooseSoccer();
			Soccer = keyboard.next();

			if (Soccer.equals("sf")) {
				Main.SoccerField();
				Field = keyboard.next();

				if (Field.equals("ch")) {
					Main.Challenge();	
				}
				else if (Field.equals("pa")) {
					Main.PlayAlone();
				}
			}
			else if (Soccer.equals("bd")){
				Main.Backyard();
			} 
		}
		if (Go.equalsIgnoreCase("f")) {
			Main.Football();
			Nascar = keyboard.next();

			if (Nascar.equals("b")) {
				Main.Bow();
			} else if (Nascar.equals("h")) {
				Main.HighFive();

			}
		}
		else if (Go.equals("r")) {
			Main.Raquetball();		
			Enemy = keyboard.next();
			Main.Opponents(Enemy);
			}

		}

		/////keyboard.close();
	
}


