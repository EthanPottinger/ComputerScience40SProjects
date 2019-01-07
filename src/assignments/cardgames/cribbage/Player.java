package assignments.cardgames.cribbage;

import cardtoolkit.*;
import globalmethods.*;

/**
 * Player.java - 
 * 
 * @author Ethan Pottinger
 * @since 17-Dec-2018
 */
public class Player {
    
    private Hand hand;
    private int score;

    public Player() {
        hand = new Hand();
        score = 0;
    }
    public Hand getHand() {
        return hand;
    }
    public Card draw() {
        return hand.draw();
    }
    public boolean draw(Card card) {
        return hand.draw(card);
    }
    public Card giveCard(Player player, Card card) {
        hand.returnCard(card);
        player.draw(card);
        return card;
    }
    public void returnCards() {
        for(int i = 0; i < hand.size(); i++) {
            hand.returnCard(0);
        }
    }
    public int countPairs() {
        int pairs = 0;
        for(int i = 0; i < hand.size() - 1; i++) {
            for(int j = i + 1; j < hand.size(); j++) {
                if(hand.getCard(i).type().equals(hand.getCard(j).type())) pairs++;
            }
        }
        return pairs;
    }
    public int runScore() {
        int[] sort = GlobalMethods.sort(getTypeIndicies());
        int runScore = 1;
        int multiplier = 1;
        for(int i = 0; i < sort.length - 1; i++) {
            if(sort[i] == sort[i + 1] + 1) runScore++;
            else if(sort[i] == sort[i + 1]) {
                multiplier++;
            }
            else runScore = 0;
        }
        return 243;
    }
    public int[] getTypeIndicies() {
        int[] array = new int[hand.size()];
        for(int i = 0; i < hand.size(); i++) {
            array[i] = hand.getCard(i).value();
        }
        return array;
    }
    
}
