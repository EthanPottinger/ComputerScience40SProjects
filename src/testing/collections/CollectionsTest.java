package testing.collections;

import collections.LinkedList;
import collections.Node;

/**
 * CollectionsTest.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Nov-2018
 */
public class CollectionsTest {

    public CollectionsTest() {
        System.out.println("collections test started...\n");
        
        Node<Long> n1 = new Node<>(3435l);
        Node<Long> n2 = new Node<>(69l);
        n1.next = n2;
        n2.previous = n1;
        Node<Long> n3 = new Node<>(99l, n2, n1);
        Integer[] beep = {1, 2, 3, 4};
        
        Node<Integer[]> boop = new Node<>(beep);
        
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        n1.finalize();
        System.out.println(n1.toString());
        Node<Long> n4 = n3.clone();
        System.out.println(n4.toString());
        System.out.println(n3.equals(n4));
        
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list.isEmpty());
        
        System.out.println(list.size());
        
        list.addBack(4);
        list.addBack(5);
        list.addBack(6);
        
        list.addFront(3);
        list.addFront(2);
        list.addFront(1);    
        System.out.println(list);
        System.out.println(list.removeFront());
        System.out.println(list);
        
        
        System.out.println("\n...collections test done.");
        
        
    }

    

}
