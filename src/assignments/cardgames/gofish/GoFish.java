package assignments.cardgames.gofish;

import cardtoolkit.*;
import collections.LinkedList;
import globalmethods.GlobalMethods;

/**
 * GoFish.java - 
 * 
 * @author Ethan Pottinger
 * @since 6-Dec-2018
 */
public class GoFish {

    public GoFish() {
        
        Hand player1 = new Hand(7);
        Hand player2 = new Hand(7);
        int player1Score = 0;
        int player2Score = 0;
        
        while(Hand.deck.getCount() != 0) {
            
        }
    }
    public void go(Hand player) {
    }
    public<T> boolean contains(T[] array, T data) {
        boolean contains = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == data) contains = true;
        }
        return contains;
    }
    public LinkedList<String> getTypes(Hand player) {
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < player.size(); i++) {
            if(!list.contains(player.getCard(i).type())) {
                list.add(player.getCard(i).type());
            }
        }
        return list;
    }
    
}
