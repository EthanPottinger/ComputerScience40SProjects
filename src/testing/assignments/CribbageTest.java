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
        
        for (int i = 0; i < 56; i++) {
            hand.draw();
            System.out.println(hand);
            System.out.println(Hand.deck);
            System.out.println("\n\n");
        }
        for (int i = 0; i < 56; i++) {
            hand.returnCard(i);
            System.out.println(hand);
            System.out.println(Hand.deck);
            System.out.println("\n\n");
        }
        
        System.out.println("\n\n...Cribbage test ends");
    }

}
