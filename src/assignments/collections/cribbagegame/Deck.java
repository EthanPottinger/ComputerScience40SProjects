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
        for(int i = 1; i <= 52; i++) {
            cards.addBack(new Card(i));
        }
    }
    public Card draw() {
        int index = GlobalMethods.randInt(1, cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }
    
    public void returnCard(Card card) {
        
    }
    
}
