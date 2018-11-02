/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
