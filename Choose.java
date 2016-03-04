import java.util.Scanner;

public class Choose-your-own-adventure{
	
public static void main( String[] args ){
	    Scanner keyboard = new Scanner(System.in);	

String Go, Soccer, Field, Nascar, Enemy;

System.out.println(" WELCOME TO MY TINY ADVENTURE");
System.out.println("  ");
System.out.println(" Would you like to play a sport? [s] soccer [f] football [r] raquetball ");
System.out.print("> ");
Go = keyboard.next();

if (Go.equals("s")) {
    System.out.println("You can either play a the [sf] soccer fields or in your [bd] backyard");
    System.out.print(">  ");
    Soccer = keyboard.next();

    if (Soccer.equals("sf")) {
        System.out.println("You walk to the soccer field and see some of your friends, you can either [ch] challenge them to a game or [pa] play alone");
        System.out.print(">  ");
        Field = keyboard.next();

        if (Field.equals("ch")) {
            System.out.println("  ");
            System.out.println("Your friends beat you up and you leave, very sad");
        } else if (Field.equals("pa")) {
            System.out.println("  ");
            System.out.println("You go home and kick the ball against the garage.");
        }
      }
    else if (Soccer.equals("bd")){
  	  System.out.println("  ");
  	  System.out.println("You go home and cry because you choose to play by yourself");
} 
}
      if (Go.equalsIgnoreCase("f")) {
        System.out.println("You ride your bike to the park, and see a reincarnation of Dale Erhnart. You can either [b] for bow down or [h] high five");
        System.out.print(">  ");
        Nascar = keyboard.next();

        if (Nascar.equals("b")) {
            System.out.println("  ");
            System.out.println("He kicks you in the stomach for the disrespect and you go home and cry to mother");
        } else if (Nascar.equals("h")) {
            System.out.println("  ");
            System.out.println("He respects the high five and you guys go get trashed at the local dive.");
       
        }
    }
      else if (Go.equals("r")) {
    	  System.out.println("   ");
    	  System.out.println("You get to the raquetball courts and there are plenty of people to play. You must pick an opponent.");
    	  System.out.println("You could choose, [a] for Andrea, [b] Brittany, [c] for Christopher, [d] for a live donkey, or [e] for Eddy.");
    	  Enemy = keyboard.next();
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
      keyboard.close();}
}
}


