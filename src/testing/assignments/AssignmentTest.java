package testing.assignments;

import assignments.cardgames.cribbage.*;

/**
 * AssignmentTest.java - 
 * 
 * @author Ethan Pottinger
 * @since 6-Dec-2018
 */
public class AssignmentTest {

    public AssignmentTest() {
        Player player = new Player();
        for(int i = 0; i < 10; i++) {
            player.draw();
        }
        player.getTypeIndicies();
        player.sort();
    }
    
}
