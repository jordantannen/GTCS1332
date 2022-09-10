public class Main {
    public static void main(String[] args) {
        BST<Integer> testBST = new BST<>();
        testBST.add(15);
        System.out.println(testBST.getRoot().getData());
        testBST.add(10);
        System.out.println(testBST.getRoot().getLeft().getData());
    }
}
