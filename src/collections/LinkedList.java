package collections;

import java.lang.reflect.Array;

/**
 * LinkedList.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Nov-2018
 */
public class LinkedList<T> {

    public static final int NOT_FOUND = -1;
    
    private int length;
    private Node head;
    private Node tail;
    
    public LinkedList() {
        finalize();
    }
    public LinkedList(T[] array) {
        fromArray(array);
    }
    public LinkedList(LinkedList list) {
        fromLinkedList(list);
    }
    @Override
    public String toString() {
        if(isEmpty()) return "Empty List";
        String text = "[";
        Node current = head;
        while(current.next != null) {
            text += current + ", ";
            current = current.next;
        }
        return text + current + "]";
    }
    @Override
    public boolean equals(Object object) {
        LinkedList<T> that = (LinkedList<T>)object;
        if(this.size() != that.size()) return false;
        Node current1 = this.head;
        Node current2 = that.getFirstNode();
        while(current1 != null) {
            if(!current1.equals(current2)) return false;
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }
    
    @Override
    public LinkedList clone() {
        LinkedList<T> list = new LinkedList<>();
        for(int i = 0; i < length; i++) {
            list.addBack((T)this.getNode(i).data);
        }
        return list;
    }
    @Override
    public final void finalize() {
        length = 0;
        head = tail = null;
        System.gc();
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public int size() {
        return length;
    } 
    public boolean addFront(T data) {
        if(data == null) return false;
        Node<T> node = new Node<>(data);
        if(isEmpty()) head = tail = node;
        else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        length++;
        return true;
    }
    public boolean addBack(T data) {
        if(data == null) return false;
        Node<T> node = new Node<>(data);
        if(isEmpty()) head = tail = node;
        else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        length++;
        return true;
    }
    private boolean inRange(int index) {
        if(isEmpty()) return false;
        if(index < 0) return false;
        if(index >= length) return false;
        return true;
    }
    protected Node getFirstNode() {
        return head;
    }
    protected Node getLastNode() {
        return tail;
    }
    protected Node getNode(int index) {
        if(!inRange(index)) return null;
        if(index == 0) return getFirstNode();
        if(index == length - 1) return getLastNode();
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public T get(int index) {
        if(!inRange(index)) return null;
        return (T)getNode(index).data;
    }
    public boolean set(int index, T data) {
        Node current = getNode(index);
        if(current == null) return false;
        current.data = data;
        return true;
    }
    public T front() {
        return get(0);
    }
    public T back() {
        return get(length - 1);
    }
    public T removeFront() {
        if(isEmpty()) return null;
        T data = (T)head.data;
        if(length == 1) finalize();
        else {
            head = head.next;
            head.previous.next = null;
            head.previous = null;
            length--;
            System.gc();
        }
        return data;
    }
    public T removeBack() {
        if(isEmpty()) return null;
        else {
            T data = (T)tail.data;
            if(length == 1) finalize();
            else {
                tail = tail.previous;
                tail.next.previous = null;
                tail.next = null;
                length--;
                System.gc();
            }
            return data;
        }
    }
    public boolean contains(T data) {
        Node current = head;
        while(current != null) {
            if(current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean addAfter(T data, int index) {
        if(data == null) return false;
        if(!inRange(index)) return false;
        if(index == length - 1) addBack(data);
        else {    
            Node<T> node = new Node<>(data);
            Node current = getNode(index);
            node.next = current.next;
            current.next.previous = node;
            current.next = node;
            node.previous = current;
            length++;
        }
        return true;
    }
    public boolean addBefore(T data, int index) {
        if(data == null) return false;
        if(!inRange(index)) return false;
        if(index == 0) addFront(data);
        else {    
            Node<T> node = new Node<>(data);
            Node current = getNode(index);
            node.previous = current.previous;
            current.previous.next = node;
            current.previous = node;
            node.next = current;
            length++;
        }
        return true;
    }
    public boolean add(T data) {
        return addBack(data);
    }
    public boolean add(int index, T data) {
        return addAfter(data, index);
    }
    public T remove(int index) {
        if(inRange(index)) return null;
        if(index == 0) return removeFront();
        else if(index == length - 1) return removeBack();
        Node current = getNode(index);
        current.previous.next = current.next;
        current.next.previous = current.previous;
        current.next = current.previous = null;
        length--;
        System.gc();
        return (T)current.data;
    }
    public int firstIndexOf(T data) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return NOT_FOUND;
    } 
    public int lastIndexOf(T data) {
        Node current = tail;
        int index = length - 1;
        while(current != null) {
            if(current.data.equals(data)) {
                return index;
            }
            current = current.previous;
            index--;
        }
        return NOT_FOUND;
    }
    public boolean remove(T data) {
        if(data == null) return false;
        int index = firstIndexOf(data);
        if(index == NOT_FOUND) return false;
        remove(index);
        return true;
    }
    public boolean removeLast(T data) {
        if(data == null) return false;
        int index = lastIndexOf(data);
        if(index == NOT_FOUND) return false;
        remove(index);
        return true;
    }
    public void removeAll(T data) {
        while(contains(data)) remove(data);
    }
    public void removeAll(T[] items) {
        for(T item : items) removeAll(item);
    }
    public void clear() {
        Node current = head;
        while(current != null) {
            Node next = current.next;
            current.finalize();
            current = next;
        }
        finalize();
    }
    public void retainAll(T[] itemsToRetain) {
        clear();
        for(int i = 0; i < itemsToRetain.length; i++) {
            add(itemsToRetain[i]);
        }
    }
    public boolean containsAll(T[] items) {
        if(items == null) return false;
        if(items.length == 0) return false;
        for(int i = 0; i < items.length; i++) {
            if(!contains(items[i])) return false;
        }
        return true;
    }
    public int numberOf(T data) {
        int count = 0;
        Node current = head;
        while(current != null) {
            if(current.data.equals(data)) count++;
            current = current.next;
        }
        return count;
    }
    public void addAll(T[] items) {
        for (T item : items) add(item); 
    }
    public void addAll(LinkedList list) {
        for(int i = 0; i < list.size(); i++) add((T)list.get(i));
    }
    
    public void addAll(LinkedList list, int index) {
        for(int i = 0; i < list.size(); i++) {
            addAfter((T)list.get(i), index);
            index++;
        }
    }
    public void addAll(T[] items, int index) {
        for(T item : items) {
            add(item);
            index++;
        }
    }
    public LinkedList subList(int from, int to) {
        if(!inRange(from) || !inRange(to) || from > to) return null;
        LinkedList<T> list = new LinkedList<>();
        for(int i = from; i <= to; i++) {
            list.add(this.get(i));
        }
        return list;
    }
    public int[] addIndices(T data) {
        if(data == null) return null;
        if(!contains(data)) return null;
        int size = numberOf(data);
        int[] array = new int[size];
        Node current = head;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if(current.data.equals(data)) {
                array[counter] = i;
                counter++;
                if(counter >= size) return array;
            }
            current = current.next;
        }
        return array;
    }
    public final void fromArray(T[] array) {
        finalize();
        for(T data : array) add(data);
    }
    public final void fromLinkedList(LinkedList list) {
        finalize();
        for(int i = 0; i < list.size(); i++) add((T)list.get(i));
    }
    public T[] toArray(T[] data) {
        data = (T[])Array.newInstance(data.getClass().getComponentType(), length);
        for(int i = 0; i < length; i++) {
            data[i] = get(i);
        }
        return data;
    }

}
