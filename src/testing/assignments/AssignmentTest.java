package testing.assignments;

import assignments.cardgames.cribbage.*;
import cardtoolkit.*;
import globalmethods.GlobalMethods;

/**
 * AssignmentTest.java - 
 * 
 * @author Ethan Pottinger
 * @since 6-Dec-2018
 */
public class AssignmentTest {

    public AssignmentTest() {
        Player player = new Player();
        player.draw(new Card(1, Card.SUITS[Card.CLUBS]));
        player.draw(new Card(2, Card.SUITS[Card.SPADES]));
        player.draw(new Card(3, Card.SUITS[Card.HEARTS]));
        player.draw(new Card(8, Card.SUITS[Card.HEARTS]));
        Card cut = new Card(1, Card.SUITS[Card.HEARTS]);
        System.out.println(player.getHand());
        System.out.println(player.getScore(cut));
    }
    
}
