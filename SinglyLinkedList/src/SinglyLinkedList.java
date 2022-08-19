import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> implements Iterable<T>{

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the element to the front of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        isValidData(data);
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);

        if (size == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    /**
     * Adds the element to the back of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!

        isValidData(data);

        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        if (size == 0){
            head = newNode;
        }
        else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0){
            throw new NoSuchElementException();
        }

        SinglyLinkedListNode<T> temp = head;
        if (size == 1){
            head = null;
            tail = null;
        }
        else {
            head = head.getNext();
        }
        size--;
        return temp.getData();
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0){
            throw new NoSuchElementException();
        }

        SinglyLinkedListNode<T> temp = head;
        if (size == 1){
            head = null;
            tail = null;
        }
        else {
            SinglyLinkedListNode<T> current = head;
            while (current.getNext().getNext() != null){
                current = current.getNext();
            }
            tail = current;
            temp = current.getNext();
            current.setNext(null);
        }
        size--;
        return temp.getData();
    }

    private void isValidData(T data){
        if (data == null)
            throw new IllegalArgumentException();
    }


    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LLIterator();
    }

    private class LLIterator implements Iterator<T> {
        private SinglyLinkedListNode<T> curr;
        LLIterator () {curr = head;}

        public boolean hasNext() { return curr != null; }

        public T next(){
            if (hasNext()){
                T temp = curr.getData();
                curr = curr.getNext();
                return temp;
            }
            return null;
        }
    }
}
