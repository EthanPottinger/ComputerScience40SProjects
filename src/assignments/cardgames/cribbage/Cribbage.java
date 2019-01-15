package assignments.cardgames.cribbage;

import cardtoolkit.*;

/**
 * Cribbage.java - 
 * 
 * @author Ethan Pottinger
 * @since 15-Jan-2019
 */
public class Cribbage {

    private Player player1;
    private Player player2;
    
    private int turn;
    
    private boolean twoPlayers;
    private boolean autoCount;
    private boolean muggins;
            
    public Cribbage(boolean twoPlayers, boolean autoCount, boolean muggins) {
        player1 = new Player();
        player2 = new Player();
        twoPlayers = this.twoPlayers;
        autoCount = this.autoCount;
        if(autoCount) muggins = this.muggins;
        else muggins = false;
    }
    
    public void play() {
        if(cut() != 0) turn = cut();
        
    }
    public int cut() {
        Card p1Card = Hand.deck.drawRandom();
        Card p2Card = Hand.deck.drawRandom();
        if(p1Card.value() > p2Card.value()) return 1;
        if(p2Card.value() > p1Card.value()) return 2;
        else return 0;
    }
    public void deal() {
        if(turn == 1) {
            for(int i = 0; i < 6; i++) {
                player2.draw();
                player1.draw();
            }
        }
        if(turn == 2) {
            for(int i = 0; i < 6; i++) {
                player1.draw();
                player2.draw();
            }
        }   
    }

}
