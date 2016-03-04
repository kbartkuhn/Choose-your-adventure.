
public class Main {
	
	
	public static void Challenge(){
		System.out.println("  ");
		System.out.println("Your friends beat you up and you leave, very sad");
	}
	public static void	SoccerField(){
		System.out.print(">  ");
		System.out.println("You walk to the soccer field and see some of your friends, you can either [ch] challenge them to a game or [pa] play alone");
	}

	public static void StartingText(){
		System.out.println(" Welcome to the story of strange oppurtunity");
		System.out.println("  ");
		System.out.println(" Would you like to play a sport? [s] soccer [f] football [r] raquetball ");
		System.out.print("> ");
	}

	public static void ChooseSoccer(){
		System.out.println("You can either play a the [sf] soccer fields or in your [bd] backyard");
		System.out.print(">  ");
	}

	public static void PlayAlone() {
		System.out.println("  ");
		System.out.println("You go home and kick the ball against the garage.");
	}
	public static void Backyard(){
		System.out.println("  ");
		System.out.println("You go home and cry because you choose to play in your backyard alone.");
	}

	public static void Football(){
		System.out.println("You ride your bike to the park, and see a reincarnation of Dale Erhnart on the football field. You can either [b] for bow down or [h] high five");
		System.out.print(">  ");
	}

	public static void Bow(){
		System.out.println("  ");
		System.out.println("He kicks you in the stomach for the disrespect and you go home and cry to mother");
	}
	public static void HighFive(){
		System.out.println("  ");
		System.out.println("He respects the high five and you guys go get trashed at the local dive.");
	}
	public static void Raquetball(){
		System.out.println("   ");
		System.out.println("You get to the raquetball courts and there are plenty of people to play. You must pick an opponent.");
		System.out.println("You could choose, [a] for Andrea, [b] Brittany, [c] for Christopher, [d] for a live donkey, or [e] for Eddy.");
	}
	
	public static void Opponents(String Enemy){
		switch (Enemy){       
		case "a":
			System.out.println("Andrea get mads and beats you with her raquet and leaves your for dead.");
			break;
		case "b":
			System.out.println("Brittany does not consider you a worthy opponent and walks away in disgust.");
			break;
		case "c":
			System.out.println("You and Christopher play a good, clean match but he ends up the victor.");
			break;
		case "d":
			System.out.println("You and the donkey understand each other on a primal level and you ride him into the sunset.");
			break;
		case "e":
			System.out.println("You play Eddy and its a close match but you squeek out a win and then go for ice cream.");
			break;
		default: 
			System.out.println("President Obama appoints you to his cabinet.");
			break;

	}
	
	
}

}
