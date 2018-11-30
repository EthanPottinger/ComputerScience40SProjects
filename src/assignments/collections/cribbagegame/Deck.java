package assignments.collections.cribbagegame;

import collections.LinkedList;
import globalmethods.GlobalMethods;
/**
 * Deck.java - 
 * 
 * @author Ethan Pottinger
 * @since 30-Nov-2018
 */
public class Deck {

    LinkedList<Card> cards;
    
    public Deck() {
        cards = new LinkedList<>();
        for(int i = 1; i < 52; i++) {
            cards.addFront(new Card(i));
        }
    }
    public Card draw() {
        Card card = new Card();
        while(!cards.contains(card)) {
            card = cards.get(GlobalMethods.randInt(1, 52));
        }
        return card;
    }
    
}
