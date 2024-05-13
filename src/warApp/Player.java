package warApp;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
        score = 0;
    }

    // Method to describe the player and their hand
    public void describe() {
        System.out.println("Player: " + name);
        System.out.println("Hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Method to flip a card from the player's hand
    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        } else {
            return null;
        }
    }

    // Method to draw a card from the deck and add it to the player's hand
    public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    // Method to increment the player's score
    public void incrementScore() {
        score++;
    }

    // Getter for the player's score
    public int getScore() {
        return score;
    }
}

