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
        Player player = new Player(4);
        System.out.println(player.getHand());
        System.out.println("Fifteens: " + player.countFifteens() * 2);
        System.out.println("Flush: " + player.flush());
        System.out.println("Run: " + player.runScore());
        System.out.println("Pairs: " + player.countPairs() * 2);
        System.out.println(player.getScore());
    }
    
}
