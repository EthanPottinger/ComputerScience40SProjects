/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.collections;

/**
 * LinkedList.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Nov-2018
 */
public class LinkedList<T> {

    private int length;
    private Node head;
    private Node tail;
    
    public LinkedList() {
        finalize();
    }

    @Override
    public String toString() {
        return "LinkedList " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public LinkedList clone() {
        return this;
    }
    @Override
    public final void finalize() {
        length = 0;
        head = tail = null;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public int size() {
        return length;
    } 
    public void addFront(T data) {
        Node<T> node = new Node<>(data);
        if(isEmpty()) head = tail = node;
        else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        length++;
    }

}
