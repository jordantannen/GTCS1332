import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TraversalsTest {

    private static final Traversals<Integer> testTraversal = new Traversals<>();
    private static final TreeNode<Integer> root = new TreeNode<>(15);

    @BeforeEach
    void setUp() {
        // Left
        root.setLeft(new TreeNode<>(10));
        root.getLeft().setLeft(new TreeNode<>(9));
        root.getLeft().setRight(new TreeNode<>(12));
        // Right
        root.setRight(new TreeNode<>(20));
        root.getRight().setLeft(new TreeNode<>(18));
        root.getRight().setRight(new TreeNode<>(28));
        /*
                    15
                /       \
               10       20
              /  \     /  \
             9   12   18  28
         */
    }

    @Test
    void preorder() {
        ArrayList<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 15, 10, 9, 12, 20, 18, 28);
        assertEquals(testList, testTraversal.preorder(root));
    }

    @Test
    void inorder() {
        ArrayList<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 9, 10, 12, 15, 18, 20, 28);
        assertEquals(testList, testTraversal.inorder(root));
    }

    @Test
    void postorder() {
        ArrayList<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 9, 12, 10, 18, 28, 20, 15);
        assertEquals(testList, testTraversal.postorder(root));
    }
}