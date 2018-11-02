/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * IceCream.java - 
 * 
 * @author Ethan Pottinger
 * @since 2-Nov-2018
 */
public class IceCream extends Food {

    public IceCream() {
        super("Dairy");
    }

    @Override
    public void eat() {
        System.out.println("with spoon");
    }

    @Override
    public boolean shouldCook() {
        return true;
    }

    

}
