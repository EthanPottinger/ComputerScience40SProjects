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

    private Hand player1;
    private Hand player2;
    private int player1Score = 0;
    private int player2Score = 0;
    
    public GoFish() {
        drawCards(player1);
        drawCards(player2);
        while(Hand.deck.getCount() != 0 && player1.size() != 0 && player2.size() != 0) {
            if(player1.size() != 0) goPlayer1();
            if(player2.size() != 0) goPlayer2();
        }
    }
    public void goPlayer1() {
        String dialog = player1.toString() + "\n\nGot any...?";
        String type = GlobalMethods.choose(dialog, "Go Fish", getTypes(player1));
        if(player2.containsType(type)) {
            player2.returnCard(player2.firstIndex(type));
            player1.returnCard(player1.firstIndex(type));
            player1Score += 2;
        }
    }
    public void goPlayer2() {
        String dialog = player2.toString() + "\n\nGot any...?";
        String type = GlobalMethods.choose(dialog, "Go Fish", getTypes(player2));
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
    public void drawCards(Hand player) {
        player = new Hand(7);
        for(int i = 0; i < player.size(); i++) {
            if(player.containsType(player.getCard(i).type()) && player.firstIndex(player.getCard(i).type()) != i) {
                player.returnCard(player.firstIndex(player.getCard(i).type()));
                player.returnCard(player.firstIndex(player.getCard(i).type()));
                player.draw();
                player.draw();
                i = 0;
            }
        }
    }
    
}
