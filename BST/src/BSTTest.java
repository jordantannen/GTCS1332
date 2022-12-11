import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;


class BSTTest {

    private static final BST<Integer> testBST = new BST<>();
    private static final BSTNode<Integer> root = new BSTNode<>(15);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        // Left
        root.setLeft(new BSTNode<>(10));
        root.getLeft().setLeft(new BSTNode<>(9));
        root.getLeft().setRight(new BSTNode<>(12));
        // Right
        root.setRight(new BSTNode<>(20));
        root.getRight().setLeft(new BSTNode<>(18));
        root.getRight().setRight(new BSTNode<>(28));
        /*
                    15
                /       \
               10       20
              /  \     /  \
             9   12   18  28
         */
    }

//    @org.junit.jupiter.api.Test
//    void add() {
//        ArrayList<Integer> testList = new ArrayList<>();
//        Collections.addAll(testList, 15, 10, 8, 20);
//        testBST.add(15);
//        testBST.add(10);
//        testBST.add(20);
//        testBST.add(8);
//        assertEquals(testList, testBST.preorder(testBST.getRoot()));
//    }

    @org.junit.jupiter.api.Test
    void remove() {
    }
}