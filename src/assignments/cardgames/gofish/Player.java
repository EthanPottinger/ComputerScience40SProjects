package assignments.cardgames.gofish;

import cardtoolkit.*;
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
        System.out.println(hand);
        for(int i = 0; i < hand.size(); i++) {
            System.out.println(hand.firstIndex(hand.getCard(i).type()));
            if(hand.firstIndex(hand.getCard(i).type()) != i) {
                System.out.println(i);
//                System.out.println(hand);
                hand.returnCard(i);
                System.out.println(hand);
                hand.returnCard(hand.firstIndex(hand.getCard(i).type()));
//                System.out.println(hand);
                i = -1;
            }
        }
    }
    public Hand getHand() {
        return hand;
    }

}
