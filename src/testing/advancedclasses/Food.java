package testing.advancedclasses;

/**
 * Food.java - 
 * 
 * @author Ethan Pottinger
 * @since 1-Nov-2018
 */
public abstract class Food {

    protected String group;
    
    public Food(String group) {
        this.group = group;
    }
    
    public void spoil() {
        System.out.println("icky");
    }

    public abstract void eat();
    
    public abstract boolean shouldCook();
}
