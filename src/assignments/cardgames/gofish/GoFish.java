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

    private Player player1;
    private Player player2;
    
    public GoFish() {
        boolean stillPlaying1 = true;
        boolean stillPlaying2 = true;
        player1 = new Player();
        player2 = new Player();
//        while(stillPlaying1 || stillPlaying2) {
//            if(player1.getHand().size() != 0) goPlayer1();
//            else stillPlaying1 = false;
//            if(player2.getHand().size() != 0) goPlayer2();
//            else stillPlaying2 = false;
//        }
    }
    public void goPlayer1() {
    }
    public void goPlayer2() {
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
    public void goFish(Hand player) {
        player.draw();
    }
    
}
