package testing.advancedclasses;

/**
 * Athlete.java - 
 * 
 * @author Ethan Pottinger
 * @since 6-Nov-2018
 */
public class Athlete extends Husky implements Sports, Golf, LoL, PermissionForm {

    private String playerName;
    private String opponentName;
    
    private int playerScore;
    private int opponentScore;
    private int playerHealth;
    private int opponentHealth;
    
    private boolean isSigned;
    
    public Athlete(int age, String name, boolean isMale ,int studentNumber) {
        super(age, name, isMale, studentNumber);
        isSigned = PermissionForm.NOT_SIGNED;
        playerHealth = 100;
        opponentHealth = 100;
    }

    @Override
    public String toString() {
        return "Athlete " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Athlete clone() {
        return this;
    }

    @Override
    public void setPlayer(String name) {
        playerName = name;
    }

    @Override
    public void setOpponent(String name) {
        opponentName = name;
    }

    @Override
    public void play(int hole, int score) {
        playerScore += score;
    }

    @Override
    public void playOpponent(int hole, int score) {
        opponentScore += score;
    }

    @Override
    public void end(int hole) {
        System.out.println("Player " + playerName + " Has a score of " + playerScore + " at Hole " + hole + " with " + opponentScore + " as an opponent");
    }

    @Override
    public void playerFight(int damage) {
        opponentHealth -= damage;
    }

    @Override
    public void opponentFight(int damage) {
        playerHealth -= damage;
    }

    @Override
    public void results() {
        if(playerHealth > opponentHealth) System.out.println("Player wins");
        else System.out.println("opponent wins");
    }

    @Override
    public void signature() {
        isSigned = PermissionForm.SIGNED;
    }

    @Override
    public boolean signed() {
        return isSigned;
    }

}
