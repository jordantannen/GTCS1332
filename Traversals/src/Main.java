public class Main {
    public static void main(String[] args) {
        Traversals<Integer> testTraversal = new Traversals<>();

        // Tree nodes
        TreeNode<Integer> root = new TreeNode<>(15);
        // Left
        root.setLeft(new TreeNode<>(10));
        root.getLeft().setLeft(new TreeNode<>(9));
        root.getLeft().setRight(new TreeNode<>(12));
        // Right
        root.setRight(new TreeNode<>(20));
        root.getRight().setLeft(new TreeNode<>(18));
        root.getRight().setRight(new TreeNode<>(28));

        System.out.println("Full Tree");
        System.out.println("Pre: " + testTraversal.preorder(root));
        System.out.println("In: " + testTraversal.inorder(root));
        System.out.println("Post: " + testTraversal.postorder(root));

        root.getRight().getLeft().setLeft(new TreeNode<>(17));

        System.out.println("\nComplete Tree");
        System.out.println("Pre: " + testTraversal.preorder(root));
        System.out.println("In: " + testTraversal.inorder(root));
        System.out.println("Post: " + testTraversal.postorder(root));
    }
}
