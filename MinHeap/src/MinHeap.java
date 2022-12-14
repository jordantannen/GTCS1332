import java.util.NoSuchElementException;

/**
 * Your implementation of a MinHeap.
 */
public class MinHeap<T extends Comparable<? super T>> {

    /**
     * The initial capacity of the MinHeap.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 13;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new MinHeap.
     *
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast a Comparable[] to a T[] to get the generic typing.
     */
    public MinHeap() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Comparable[INITIAL_CAPACITY];
    }

    /**
     * Adds an item to the heap. If the backing array is full (except for
     * index 0) and you're trying to add a new item, then double its capacity.
     *
     * Method should run in amortized O(log n) time.
     *
     * @param data The data to add.
     * @throws java.lang.IllegalArgumentException If the data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!

        if (data == null)
            throw new IllegalArgumentException();

        // Increase size if needed
        if (size == backingArray.length - 1){
            T[] newArr = (T[]) new Comparable[backingArray.length * 2];
            for (int i = 1; i <= size; i++){
                newArr[i] = backingArray[i];
            }
            backingArray = newArr;
        }
        // Add to backing array
        size++;
        backingArray[size] = data;

        // Heapify
        if (size != 1) {
            addHelper(size);
        }
    }

    private void addHelper(int index){
        // Base Case
        if (index == 1 || backingArray[index].compareTo(backingArray[index / 2]) > 0) {
            return;
        }
        else{
            T temp = backingArray[index / 2];
            backingArray[index / 2] = backingArray[index];
            backingArray[index] = temp;
            addHelper(index / 2);
        }
    }

    /**
     * Removes and returns the min item of the heap. As usual for array-backed
     * structures, be sure to null out spots as you remove. Do not decrease the
     * capacity of the backing array.
     *
     * Method should run in O(log n) time.
     *
     * @return The data that was removed.
     * @throws java.util.NoSuchElementException If the heap is empty.
     */
    public T remove() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0)
            throw new NoSuchElementException();


        T returnVal = backingArray[1];
        backingArray[1] = backingArray[size];
        backingArray[size] = null;
        size--;
        removeHelper(1);
        return returnVal;
    }

    private void removeHelper(int index){
        int left = 2 * index;
        int right = 2 * index + 1;
        int minVal = index;

        if (left <= size && backingArray[left].compareTo(backingArray[minVal]) < 0) {
            minVal = left;
        }
        if (right <= size && backingArray[right].compareTo(backingArray[minVal]) < 0) {
            minVal = right;
        }

        if (minVal != index) {
            T parent = backingArray[index];
            T child = backingArray[minVal];
            backingArray[index] = child;
            backingArray[minVal] = parent;
            removeHelper(minVal);
        }

    }

    /**
     * Returns the backing array of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}