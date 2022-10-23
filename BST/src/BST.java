import java.util.NoSuchElementException;
import java.util.List;
import java.util.ArrayList;

/**
 * Your implementation of a BST.
 */
public class BST<T extends Comparable<? super T>> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private BSTNode<T> root;
    private int size;

    public boolean contains(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        return containsHelper(data, root);

    }

    private boolean containsHelper(T data, BSTNode<T> node){
        boolean doesContain = false;

        // Base cases
        if (node == null)
            return false;

        if (node.getData().equals(data))
            return true;

        if (data.compareTo(node.getData()) < 0)
            doesContain = containsHelper(data, node.getLeft());
        else if (data.compareTo(node.getData()) > 0)
            doesContain = containsHelper(data, node.getRight());

        return doesContain;
    }
    /*
     * Do not add a constructor.
     */

    /**
     * Adds the data to the tree.
     *
     * This must be done recursively.
     *
     * The new data should become a leaf in the tree.
     *
     * Traverse the tree to find the appropriate location. If the data is
     * already in the tree, then nothing should be done (the duplicate
     * shouldn't get added, and size should not be incremented).
     *
     * Should be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to add to the tree.
     * @throws java.lang.IllegalArgumentException If data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null)
            throw new IllegalArgumentException("No Data");
        if (root != null)
            root = addHelper(root, data);
        else {
            root = new BSTNode<>(data);
            size++;
        }
    }

    private BSTNode<T> addHelper(BSTNode<T> curr, T data){
        // Base Case
        if (curr == null){
            size++;
            return new BSTNode<>(data);
        }
        // Recursive Cases
        else if (data.compareTo(curr.getData()) < 0) { // data < curr.data
            curr.setLeft(addHelper(curr.getLeft(), data));

        }
        else if (data.compareTo(curr.getData()) > 0) { // data > curr.data
            curr.setRight(addHelper(curr.getRight(), data));

        }
        // Returns root back to method call
        return curr;
    }

    /**
     * Removes and returns the data from the tree matching the given parameter.
     *
     * This must be done recursively.
     *
     * There are 3 cases to consider:
     * 1: The node containing the data is a leaf (no children). In this case,
     * simply remove it.
     * 2: The node containing the data has one child. In this case, simply
     * replace it with its child.
     * 3: The node containing the data has 2 children. Use the SUCCESSOR to
     * replace the data. You should use recursion to find and remove the
     * successor (you will likely need an additional helper method to
     * handle this case efficiently).
     *
     * Do NOT return the same data that was passed in. Return the data that
     * was stored in the tree.
     *
     * Hint: Should you use value equality or reference equality?
     *
     * Must be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to remove.
     * @return The data that was removed.
     * @throws java.lang.IllegalArgumentException If data is null.
     * @throws java.util.NoSuchElementException   If the data is not in the tree.
     */
    public T remove(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null)
            throw new IllegalArgumentException("No Data");
        else if (root == null) {
            throw new NoSuchElementException("Tree is Empty");
        }
        BSTNode<T> removed = new BSTNode<>(null);
        root = removeHelper(root, data, removed);
        return removed.getData();
    }

    private BSTNode<T> removeHelper(BSTNode<T> curr, T data, BSTNode<T> dummy){
        if (curr == null)
            throw new NoSuchElementException("Data not found");
        else if (data.compareTo(curr.getData()) < 0) {
            curr.setLeft(removeHelper(curr.getLeft(), data, dummy));
        }
        else if (data.compareTo(curr.getData()) > 0) {
            curr.setRight(removeHelper(curr.getRight(), data, dummy));
        }
        else {
            dummy.setData(curr.getData());
            size--;

            if (curr.getRight() == null && curr.getLeft() == null)
                return null;
            else if (curr.getLeft() != null && curr.getRight() == null) {
                return curr.getLeft();
            }
            else if (curr.getRight() != null && curr.getLeft() == null) {
                return curr.getRight();
            }
            else {
                BSTNode<T> dummyTwo = new BSTNode<>(null);
                curr.setRight(removeSuccessor(curr.getRight(), dummyTwo));
                curr.setData(dummyTwo.getData());
            }
        }
        return curr;
    }

    private BSTNode<T> removeSuccessor(BSTNode<T> curr, BSTNode<T> dummy){
        if (curr.getLeft() == null){
            dummy.setData(curr.getData());
            return curr.getRight();
        }
        else {
            curr.setLeft(removeSuccessor(curr.getLeft(), dummy));
        }
        return curr;
    }

    /**
     * Returns the root of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The root of the tree
     */
    public BSTNode<T> getRoot() {
        // DO NOT MODIFY THIS METHOD!
        return root;
    }

    /**
     * Returns the size of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the tree
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

//    public List<T> preorder(BSTNode<T> root) {
//        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
//        List<T> data = new ArrayList<>();
//        preorderHelper(data, root);
//        return data;
//    }
//
//    private void preorderHelper(List<T> data, BSTNode<T> node){
//        if (node == null){
//            return;
//        }
//        else {
//            data.add(node.getData());
//            preorderHelper(data, node.getLeft());
//            preorderHelper(data, node.getRight());
//        }
//    }
}