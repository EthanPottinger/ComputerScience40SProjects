package assignments.cardgames.gofish;

import cardtoolkit.*;
import collections.*;
import globalmethods.*;
/**
 * Player.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Dec-2018
 */
public class Player {

    private Hand hand;
    private int score;
    
    public Player() {
        hand = new Hand(7);
        for(int i = 0; i < hand.size(); i++) {
            if(hand.firstIndex(hand.getCard(i).type()) != i) {
                String type = hand.getCard(i).type();
                hand.returnCard(type);
                hand.returnCard(type);
                score += 2;
                i = -1;
            }
        }
    }
    public Hand getHand() {
        return hand;
    }
    public String chooseCard(String title) {
        return GlobalMethods.choose("Your Hand: " + hand + "\nYour Score: " + score + "\nGot any...?", title, getTypes());
    }
    public LinkedList<String> getTypes() {
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < hand.size(); i++) {
            if(!list.contains(hand.getCard(i).type())) {
                list.add(hand.getCard(i).type());
            }
        }
        return list;
    }
    public Card goFish() {
        return hand.draw();
    }
    public void returnCard(String type) {
        if(hand.containsType(type)) {
            hand.returnCard(type);
        }
    }
    public void increaseScore(int increase) {
        score += increase;
    } 

}
