package warApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    //  makes a full set of cards
    public Deck() {
        cards = new ArrayList<>();
        //loop to iterate through card values 2 - 14 
        for (int value = 2; value <= 14; value++) {
            
        	// Creates cards for each each face card
        	for (String suit : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
                String name;
                switch (value) {
                    case 11:
                        name = "Jack of " + suit;
                        break;
                    case 12:
                        name = "Queen of " + suit;
                        break;
                    case 13:
                        name = "King of " + suit;
                        break;
                    case 14:
                        name = "Ace of " + suit;
                        break;
                    default:
                        name = value + " of " + suit;
                }
                cards.add(new Card(value, name));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to draw a card from the top of the deck
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null;
        }
    }
}

