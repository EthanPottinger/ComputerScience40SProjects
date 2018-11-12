/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Home.java - 
 * 
 * @author Ethan Pottinger
 * @since 8-Nov-2018
 */
public class  Home <T extends Person, U> {
    
    private T owner;
    private U[] contents;

   
    public Home(T owner, U[] contents) {
        this.owner = owner;
        this.contents = contents;
   }
    
    public void visit() {
        String text = "Owner " + owner.getName();
        text += " Has ";
        for(U item : contents) {
            if(item instanceof Object[]) {
                Object[] a = (Object[]) item;
                for (int i = 0; i < a.length; i++) {
                    text += "\n\t- " +a[i].toString();
                }
            }
            else text += "\n\t- " + item.toString();
        }
        System.out.println(text);
    }
}
