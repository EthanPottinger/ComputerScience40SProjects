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

        System.out.println(Hand.deck);
        
        System.out.println(new Hand(4));
        System.out.println(Hand.deck);
        System.out.println(new Hand(4));
        System.out.println(Hand.deck);
        
        System.out.println("\n\n...Cribbage test ends");
    }

}
