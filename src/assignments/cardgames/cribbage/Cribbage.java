package assignments.cardgames.cribbage;

import cardtoolkit.*;
import globalmethods.*;
import collections.*;

/**
 * Cribbage.java - 
 * 
 * @author Ethan Pottinger
 * @since 15-Jan-2019
 */
public class Cribbage {

    private Player player1;
    private Player player2;
    
    private Hand crib;
    
    private Card cut;
    
    private int turn;
    
    private boolean autoCount;
    private boolean muggins;
            
    public Cribbage(boolean autoCount, boolean muggins) {
        player1 = new Player();
        player2 = new Player();
        crib = new Hand();
        cut = new Card();
        autoCount = this.autoCount;
        if(autoCount) muggins = this.muggins;
        else muggins = false;
    }
    
    public void play() {
        int cut = 0;
        do {
            cut = cut();
        }
        while(cut == 0);
        turn = cut;
        deal();
        chooseCards();
        getCutCard();
        
    }
    public int cut() {
        Card p1Card = Hand.deck.drawRandom();
        Card p2Card = Hand.deck.drawRandom();
        if(p1Card.value() > p2Card.value()) return 1;
        if(p2Card.value() > p1Card.value()) return 2;
        else return 0;
    }
    public void deal() {
        for(int i = 0; i < 6; i++) {
            player2.draw();
            player1.draw();
        }
    }
    public void chooseCards() {
        if(turn == 1) {
            for(int i = 0; i < 2; i++) {
                String[] options = new String[player1.getHand().size()];
                for(int j = 0; j < player1.getHand().size(); j++) {
                    options[j] = player1.getHand().getCard(j).toString();
                }
                String choice = GlobalMethods.choose("Choose a card to go into your crib\n\n" + player1.getHand().toString(), "Cribbage Player 1", options);
                for(int j = 0; j < player1.getHand().size(); j++) {
                    if(player1.getHand().getCard(j).toString().equals(choice)) {
                        Card card = player1.getHand().getCard(j);
                        player1.returnCard(j);
                        crib.draw(card);
                    }
                }
            }
            for(int i = 0; i < 2; i++) {
                String[] options = new String[player2.getHand().size()];
                for(int j = 0; j < player2.getHand().size(); j++) {
                    options[j] = player2.getHand().getCard(j).toString();
                }
                String choice = GlobalMethods.choose("Choose a card to go into your opponents crib\n\n" + player2.getHand().toString(), "Cribbage Player 2", options);
                for(int j = 0; j < player2.getHand().size(); j++) {
                    if(player2.getHand().getCard(j).toString().equals(choice)) {
                        Card card = player2.getHand().getCard(j);
                        player2.returnCard(j);
                        crib.draw(card);
                    }
                }
            }
        }
        if(turn == 2) {
            for(int i = 0; i < 2; i++) {
                String[] options = new String[player1.getHand().size()];
                for(int j = 0; j < player1.getHand().size(); j++) {
                    options[j] = player1.getHand().getCard(j).toString();
                }
                String choice = GlobalMethods.choose("Choose a card to go into your opponents crib\n\n" + player1.getHand().toString(), "Cribbage Player 1", options);
                for(int j = 0; j < player1.getHand().size(); j++) {
                    if(player1.getHand().getCard(j).toString().equals(choice)) {
                        Card card = player1.getHand().getCard(j);
                        player1.returnCard(j);
                        crib.draw(card);
                    }
                }
            }
            for(int i = 0; i < 2; i++) {
                String[] options = new String[player2.getHand().size()];
                for(int j = 0; j < player2.getHand().size(); j++) {
                    options[j] = player2.getHand().getCard(j).toString();
                }
                String choice = GlobalMethods.choose("Choose a card to go into your crib\n\n" + player2.getHand().toString(), "Cribbage Player 2", options);
                for(int j = 0; j < player2.getHand().size(); j++) {
                    if(player2.getHand().getCard(j).toString().equals(choice)) {
                        Card card = player2.getHand().getCard(j);
                        player2.returnCard(j);
                        crib.draw(card);
                    }
                }
            }
        }
    }
    public void getCutCard() {
        cut = Hand.deck.drawRandom();
    }
    public void pegging() {
        LinkedList<Card> cards = new LinkedList<>();
        int num = 0;
        if(turn == 1) {
            do {
                do {
                    
                }
                while(num <= 31);
            }
            while(player1.getHand().size() != 0 || player2.getHand().size() != 0);
        }
        if(turn == 2) {
            
        }
    }
 
}
