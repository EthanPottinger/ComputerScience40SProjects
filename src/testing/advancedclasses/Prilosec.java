/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Prilosec.java - 
 * 
 * @author Ethan Pottinger
 * @since 2-Nov-2018
 */
public class Prilosec extends Food {

    public Prilosec() {
        super("Medicine");
    }

    @Override
    public void eat() {
        System.out.println("CONSUMES PRILOSEC");
    }

    @Override
    public boolean shouldCook() {
        return true;
    }

}
