package testing.collections;

import collections.*;

/**
 * CollectionsTest.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Nov-2018
 */
public class CollectionsTest {

    public CollectionsTest() {
        System.out.println("collections test started...\n");
        
        String[] gread = {"Thankns", "man", "Good", "Job"};
        
        LinkedList<String> list = new LinkedList<>(gread);
        list.add("sajkdg");
        list.add(2, "hksdavfb");
        System.out.println(list);
        
        System.out.println("\n...collections test done.");
        
        
    }

    

}
