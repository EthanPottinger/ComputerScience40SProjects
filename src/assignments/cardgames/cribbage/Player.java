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
        return 69;
    }
    public int[] getTypeIndicies() {
        int[] array = new int[hand.size()];
        for(int i = 0; i < hand.size(); i++) {
            array[i] = hand.getCard(i).typeIndex() + 1;
        }
        return array;
    }
    public int[] sort() {
        int[] array = getTypeIndicies();
        int[] sort = new int[array.length];
        final int DONE = GlobalMethods.maximum(array) + 1;
        System.out.println(DONE);
        GlobalMethods.outputArray(array);
        for(int i = 0; i < array.length; i++) {
            sort[GlobalMethods.minimumIndex(array)] = GlobalMethods.minimum(array);
            GlobalMethods.outputArray(sort);
            System.out.println(GlobalMethods.minimumIndex(array));
            array[GlobalMethods.minimumIndex(array)] = DONE; 
            GlobalMethods.outputArray(array);
        }
        return sort;
    }
    
}
