/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Wanton.java - 
 * 
 * @author Ethan Pottinger
 * @since 2-Nov-2018
 */
public class Wanton extends Food {

    public Wanton() {
        super("Mixture");
    }

    @Override
    public void eat() {
        System.out.println("With Chopsticks");
    }

    @Override
    public boolean shouldCook() {
        return true;
    }

    

}
