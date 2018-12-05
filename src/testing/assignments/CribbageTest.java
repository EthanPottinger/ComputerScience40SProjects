package testing.assignments;
import assignments.collections.cribbagegame.*;

/**
 * CribbageTest.java - 
 * 
 * @author Ethan Pottinger
 * @since 3-Dec-2018
 */
public class CribbageTest {

    public CribbageTest() {
        System.out.println("Cribbage test starts...\n\n");

        Hand hand  = new Hand();
        
        hand.draw();
        System.out.println(hand);
        System.out.println(Hand.deck);
        hand.returnCard(hand.getCard(0));
        System.out.println(hand);
        System.out.println(hand.deck);
        
        System.out.println("\n\n...Cribbage test ends");
    }

}
