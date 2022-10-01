import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinHeap<Integer> testHeap = new MinHeap<>();
        testHeap.add(5);
        testHeap.add(8);
        testHeap.add(6);
        testHeap.add(3);
        testHeap.add(10);
        testHeap.add(11);
        testHeap.add(4);


        System.out.println(Arrays.toString(testHeap.getBackingArray()));
        System.out.println("Size: " + testHeap.size());
        System.out.println();



        System.out.println("Removed: " + testHeap.remove());

        System.out.println(Arrays.toString(testHeap.getBackingArray()));
        System.out.println("Size: " + testHeap.size());
    }
}
