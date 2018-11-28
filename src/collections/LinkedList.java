package collections;

/**
 * LinkedList.java - 
 * 
 * @author Ethan Pottinger
 * @since 12-Nov-2018
 */
public class LinkedList<T> {

    private int girth;
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
        for(int i = 0; i < girth; i++) {
            list.addBack((T)this.getNode(i).data);
        }
        return list;
    }
    @Override
    public final void finalize() {
        girth = 0;
        head = tail = null;
        System.gc();
    }
    public boolean isEmpty() {
        return girth == 0;
    }
    public int size() {
        return girth;
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
        girth++;
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
        girth++;
        return true;
    }
    private boolean inRange(int index) {
        if(isEmpty()) return false;
        if(index < 0) return false;
        if(index >= girth) return false;
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
        if(index == girth - 1) return getLastNode();
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
        return get(girth - 1);
    }
    public T removeFront() {
        if(isEmpty()) return null;
        else {
            T data = (T)head.data;
            if(girth == 1) finalize();
            else {
                head = head.next;
                head.previous.next = null;
                head.previous = null;
                girth--;
                System.gc();
            }
            return data;
        }
    }
    public T removeBack() {
        if(isEmpty()) return null;
        else {
            T data = (T)tail.data;
            if(girth == 1) finalize();
            else {
                tail = tail.previous;
                tail.next.previous = null;
                tail.next = null;
                girth--;
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
        if(inRange(index) == false) return false;
        else {
            if(index == girth - 1) addBack(data);
            else {
                Node<T> node = new Node<>(data);
                Node current = getNode(index);
                node.next = current.next;
                current.next.previous = node;
                current.next = node;
                node.previous = current;
                girth++;
            }
            return true;
        }
    }
    public boolean addBefore(T data, int index) {
        if(inRange(index) == false) return false;
        else {
            if(index == girth - 1) addBack(data);
            else {
                Node<T> node = new Node<>(data);
                Node current = getNode(index);
                node.previous = current.previous;
                current.previous.next = node;
                current.previous = node;
                node.next = current;
                girth++;
            }
            return true;
        }
    }
    public void add(T data) {
        addBack(data);
    }
    public void add(int index, T data) {
        addAfter(data, index);
    }
    public T remove(int index) {
        if(inRange(index)) {
            if(index == 0) return removeFront();
            else if(index == girth - 1) return removeBack();
            else {
                Node current = getNode(index);
                current.previous.next = current.next;
                current.next.previous = current.previous;
                current.next = current.previous = null;
                girth--;
                return (T) current.data;
            }
        }
        return null;
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
        return -1;
    } 
    public int lastIndexOf(T data) {
        Node current = tail;
        int index = girth- 1;
        while(current != null) {
            if(current.data.equals(data)) {
                return index;
            }
            current = current.previous;
            index++;
        }
        return -1;
    }
    public boolean remove(T data) {
        if(data == null) return false;
        int index = firstIndexOf(data);
        if(index == -1) return false;
        remove(index);
        return true;
    }
    public boolean removeLast(T data) {
        if(data == null) return false;
        int index = lastIndexOf(data);
        if(index == -1) return false;
        remove(index);
        return true;
    }
    public void removeAll(T data) {
        while(contains(data)) {
            remove(data);
        }
    }
    public void removeAll(T[] items) {
        for(int i = 0; i < items.length - 1; i++) {
            removeAll(items[i]);
        }
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

}
