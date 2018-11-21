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
        if(data == null) return "Fcuk";
        return data.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        Node node = (Node)object;
        return this.data.equals(node.data);
    }
    
    @Override
    public Node clone() {
        return new Node(this.data, this.next, this.previous);
    }
    @Override
    public void finalize() {
        data = null;
        next = previous = null;
        System.gc();
    }

}
