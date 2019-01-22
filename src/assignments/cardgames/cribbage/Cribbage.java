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
            Card choice1 = new Card();
            Card choice2 = new Card();
            int maxScore = 0;
            for(int i = 0; i < player2.getHand().size(); i++) {
                for(int j = i + 1; j < player2.getHand().size(); j++) {
                    Card card1 = player2.getHand().getCard(i);
                    Card card2 = player2.getHand().getCard(j);
                    player2.returnCard(card1);
                    player2.returnCard(card2);
                    if(player2.getScore() >= maxScore) {
                        choice1 = card1;
                        choice2 = card2;
                    }
                    player2.draw(card1);
                    player2.draw(card2);
                }
            }
            player2.returnCard(choice1);
            player2.returnCard(choice2);
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
            Card choice1 = new Card();
            Card choice2 = new Card();
            int maxScore = 0;
            for(int i = 0; i < player2.getHand().size(); i++) {
                for(int j = i + 1; j < player2.getHand().size(); j++) {
                    Card card1 = player2.getHand().getCard(i);
                    Card card2 = player2.getHand().getCard(j);
                    player2.returnCard(card1);
                    player2.returnCard(card2);
                    if(player2.getScore() >= maxScore) {
                        choice1 = card1;
                        choice2 = card2;
                    }
                    player2.draw(card1);
                    player2.draw(card2);
                }
            }
            player2.returnCard(choice1);
            player2.returnCard(choice2);
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
            while(cards.size() != 8);
        }
        if(turn == 2) {
            
        }
    }
    
    /**
     * Counts the points earned from runs in pegging
     * 
     * @param cards The sublist for the cards being played
     * @return The amount of points gotten
     */
    public int getPegRun(LinkedList<Card> cards) {
        int score = 0;
        for (int i = 3; i <= cards.size(); i++) {
            int[] array = new int[i];
            for(int j = cards.size() - 1; j >= 0; j++) {
                array[i] = player2.getHand().getCard(j).value();
            }
            array = GlobalMethods.sort(array);
            int run = 1;
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] + 1 == array[j + 1]) run++;
                else run = 1;
            }
            if(run >= 3) score = run;
        }
        return score;
    }
 
}
