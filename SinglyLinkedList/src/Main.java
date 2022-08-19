public class Main {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> testList = new SinglyLinkedList<>();

        for (int i = 0; i < 3; i++){
            testList.addToFront(i);
        }
        testList.addToBack(6);

        for (int item : testList){
            System.out.print(item + ", ");
        }

        System.out.println("\nRemoved: " + testList.removeFromFront());
        System.out.println("\nRemoved: " + testList.removeFromBack());

        for (int item : testList){
            System.out.print(item + ", ");
        }



        System.out.println("\nSize: " + testList.size());
        System.out.println("Head: " + testList.getHead().getData());
        System.out.println("Tail: " + testList.getTail().getData());

    }
}
