/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collections;

/**
 * Node.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Nov-2018
 */
public class Node<T> {
    
    public T data;
    
    public Node next;
    
    public Node previous;

    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
    public Node(T data, Node next) {
        this(data, next, null);
    }
    public Node(T data) {
        this(data, null, null);
    }
    public Node() {
        this(null, null, null);
    }

    @Override
    public String toString() {
        return data.toString();
    }
   
    public boolean equals(Node node) {
        return node.data.equals(this.data);
    }
    
    @Override
    public Node clone() {
        return new Node(this.data, this.next, this.previous);
    }
    @Override
    public void finalize() {
        data = null;
        next = previous = null;
    }

}
