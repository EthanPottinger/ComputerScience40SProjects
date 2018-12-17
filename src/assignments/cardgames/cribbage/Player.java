package assignments.cardgames.cribbage;

import cardtoolkit.*;
import collections.LinkedList;

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
    public int sort() {
        int[] array = getTypeIndicies();
        return 69;
    }
    public static int minimum(int[] array) {
        return minimum(array, array.length - 1, array[0]);
    }
    private static int minimum(int[] array, int i, int min) {

        if(array[i] < min) min = array[i];

        if(i == 0) return min;
        
        else return minimum(array, i - 1, min);
    }
    
}
