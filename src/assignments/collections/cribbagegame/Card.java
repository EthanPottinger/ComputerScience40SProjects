package assignments.collections.cribbagegame;

/**
 * Card.java - 
 * 
 * @author Ethan Pottinger
 * @since 30-Nov-2018
 */
public class Card {

    private int card;
    
    public Card() {
        
    }
    public Card(int card) {
        this.card = card;
    }
    public boolean equals(Card card) {
        return this.card == card.getCard();
    }
    public int getCard() {
        return card;
    }

}
