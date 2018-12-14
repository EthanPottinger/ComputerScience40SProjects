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

    private Player player;
    private Player opponent;
    
    public GoFish() {
        boolean stillPlaying1 = true;
        boolean stillPlaying2 = true;
        player = new Player();
        opponent = new Player();
        System.out.println(player.getHand());
        System.out.println(opponent.getHand());
        while(stillPlaying1 || stillPlaying2) {
            if(player.getHand().size() != 0) goPlayer1();
            else if(Hand.deck.getCount() != 0){
                for(int i = 0; i < 7; i++) {
                    player.goFish();
                }
            }
            else stillPlaying1 = false;
            System.out.println(player.getHand());
            if(opponent.getHand().size() != 0) goPlayer2();
            else if(Hand.deck.getCount() != 0){
                for(int i = 0; i < 7; i++) {
                    opponent.goFish();
                }
            }
            else stillPlaying2 = false;
            System.out.println(opponent.getHand());
        }
    }
    public void goPlayer1() {
        boolean stillPlaying = true;
        while(stillPlaying) {
            String choice = player.chooseCard("Player");
            if(opponent.getHand().containsType(choice)) {
                player.returnCard(choice);
                opponent.returnCard(choice);
                player.increaseScore(2);
                System.out.println("has a ");
            }
            else {
                System.out.println("does not have a ");
                Card card = player.goFish();
                GlobalMethods.output("Go Fish!\n\nYou got a..." + card);
                if(card.type().equals(choice)) {
                    player.returnCard(choice);
                    player.returnCard(choice);
                    player.increaseScore(2);
                }
                else {
                    System.out.println("FUCK");
                    stillPlaying = false;
                }
            }
        }
    }
    public void goPlayer2() {
        boolean stillPlaying = true;
        while(stillPlaying) {
            String choice = opponent.chooseCard("Player");
            if(player.getHand().containsType(choice)) {
                player.returnCard(choice);
                opponent.returnCard(choice);
                player.increaseScore(2);
                System.out.println("has a ");
            }
            else {
                System.out.println("does not have a ");
                Card card = opponent.goFish();
                GlobalMethods.output("Go Fish!\n\nYou got a..." + card);
                if(card.type().equals(choice)) {
                    opponent.returnCard(choice);
                    opponent.returnCard(choice);
                    opponent.increaseScore(2);
                }
                else {
                    System.out.println("FUCK");
                    stillPlaying = false;
                }
            }
        }
    }
    public<T> boolean contains(T[] array, T data) {
        boolean contains = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == data) contains = true;
        }
        return contains;
    }
    
}
