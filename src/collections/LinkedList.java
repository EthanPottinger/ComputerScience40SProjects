package collections;

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
        if(isEmpty()) return "Empty List";
        else {
            String text = "[";
            Node current = head;
            while(current.next != null) {
                text += current + ", ";
                current = current.next;
            }
            return text + current + "]";
        }
    }
   
    public boolean equals(LinkedList list) {
        if(this.size() != list.size()) return false;
        Node current1 = this.head;
        Node current2 = list.getFirstNode();
        while(current1 != null) {
            if(current1.equals(current2) == false) return false;
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
    public void addBack(T data) {
        Node<T> node = new Node<>(data);
        if(isEmpty()) head = tail = node;
        else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        length++;
    }
    private boolean inRange(int index) {
        if(isEmpty()) return false;
        else if(index < 0) return false;
        else if(index >= length) return false;
        return true;
    }
    protected Node getFirstNode() {
        return head;
    }
    protected Node getLastNode() {
        return tail;
    }
    protected Node getNode(int index) {
        if(inRange(index) == false) return null;
        else if(index == 0) return getFirstNode();
        else if(index == length - 1) return getLastNode();
        else {
            Node current = head;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
    }
    public T get(int index) {
        if(inRange(index) == false) return null;
        else return (T)getNode(index).data;
    }
    public boolean set(int index, T data) {
        Node current = getNode(index);
        if(current == null) return false;
        else {
            current.data = data;
            return true;
        }
    }
    public T front() {
        return get(0);
    }
    public T back() {
        return get(length - 1);
    }
    public T removeFront() {
        if(isEmpty()) return null;
        else {
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
    }

}
