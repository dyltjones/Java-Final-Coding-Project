package warApp;

public class App {
    public static void main(String[] args) {
       
    	//  Create a deck of cards and two players for the game
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();

        // Deal cards to each player
        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Play the game
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println("Player 1 plays: " + card1.getName());
            try {
            	Thread.sleep(500);           
            } catch (InterruptedException e) {
				System.out.println("Game interrupted.");
			}
            System.out.println("Player 2 plays: " + card2.getName());
            try {
            	Thread.sleep(500);           
            } catch (InterruptedException e) {
				System.out.println("Game interrupted.");
			}

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(" \n Player 1 receives a point");
                try {
                	Thread.sleep(500);           
                } catch (InterruptedException e) {
    				System.out.println("Game interrupted.");
    			}
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("\n Player 2 receives a point." );
                try {
                	Thread.sleep(500);           
                } catch (InterruptedException e) {
    				System.out.println("Game interrupted.");
    			}
            } else {
                System.out.println(" \n It's a tie. No point awarded.");
                try {
                	Thread.sleep(500);           
                } catch (InterruptedException e) {
    				System.out.println("Game interrupted.");
    			}
            }
           
            try {
            	System.out.println("\n"); Thread.sleep(500);
            }  catch (InterruptedException e) {
				System.out.println("Game interrupted.");
            }
            
         // Display the current score after each round
            System.out.println("Current Score:");
            System.out.println(" Player 1: " + player1.getScore());
            System.out.println(" Player 2: " + player2.getScore());
            System.out.println(" \n");
            try {
            	Thread.sleep(1000);
            } catch (InterruptedException e) {
				System.out.println("Game interrupted.");
			}
            }
        
        

        // Determine the winner
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        System.out.println("Final Score:");
        System.out.println("Player 1: " + score1);
        System.out.println("Player 2: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score1 < score2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
