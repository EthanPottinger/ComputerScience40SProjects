/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Box.java - 
 * 
 * @author Ethan Pottinger
 * @since 8-Nov-2018
 */
public class Box <T> {

    private T stuff;

    public T open() {
        return stuff;
    }
    
    public void wrap(T item) {
        this.stuff = item;
    }
    
    public void peek() {
        System.out.println(stuff.toString());
    }
    
}
