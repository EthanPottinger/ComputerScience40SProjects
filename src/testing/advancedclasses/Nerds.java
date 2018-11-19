package testing.advancedclasses;

/**
 * Nerds.java - 
 * 
 * @author Ethan Pottinger
 * @since 2-Nov-2018
 */
public class Nerds extends Food {

    public Nerds() {
        super("Candy");
    }

    @Override
    public void eat() {
        System.out.println("by the handfull");
    }

    @Override
    public boolean shouldCook() {
        return false;
    }

}
