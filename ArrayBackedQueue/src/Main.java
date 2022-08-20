import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> testQueue = new ArrayQueue<>();



//        for (int i = 0; i < 9; i++) {
//            testQueue.enqueue(i);
//        }
//
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
//
//        System.out.println(testQueue.dequeue());
//        System.out.println(testQueue.dequeue());
//        System.out.println(testQueue.dequeue());
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
//        testQueue.enqueue(9);
//        testQueue.enqueue(10);
//        testQueue.enqueue(11);
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
//
//        for (int i = 0; i < 9; i++) {
//            System.out.println(testQueue.dequeue());
//        }
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
//        for (int i = 0; i < 9; i++) {
//            testQueue.enqueue(i + 13);
//        }
////        testQueue.enqueue(11);
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
////        System.out.println(testQueue.dequeue());
////        System.out.println(testQueue.dequeue());
//        System.out.println(testQueue.dequeue());
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
//        testQueue.enqueue(11);
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));
//        testQueue.enqueue(31);
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));

        for (int i = 0; i < 3; i++) {
            testQueue.enqueue(i);
        }
        System.out.println(Arrays.toString(testQueue.getBackingArray()));
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(Arrays.toString(testQueue.getBackingArray()));

//        testQueue.enqueue(9);
//        System.out.println(Arrays.toString(testQueue.getBackingArray()));

        for (int i = 0; i < 9; i++) {
            testQueue.enqueue(i);
        }
        System.out.println(Arrays.toString(testQueue.getBackingArray()));
        testQueue.enqueue(9);
        System.out.println(Arrays.toString(testQueue.getBackingArray()));
    }
}
