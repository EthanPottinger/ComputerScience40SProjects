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
    @Override
    public boolean equals(Object object) {
        Card that = (Card)object;
        return this.card == that.getCard();
    }
    public int getCard() {
        return card;
    }

}
