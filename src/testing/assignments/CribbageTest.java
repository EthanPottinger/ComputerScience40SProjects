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
        
        Deck deck = new Deck();
        System.out.println(deck);
        
        for(int i = 0; i < 56; i++) {
            System.out.println(deck.drawRandom());
            System.out.println(deck);
        }
        
        System.out.println("\n\n...Cribbage test ends");
    }

}
