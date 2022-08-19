import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> test = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();


//        test.addToFront(5);

//        test.addToFront(7);
        for (int i = 5; i >= 0; i--){
            test.addToFront(i);
        }
        System.out.println(Arrays.toString(test.getBackingArray()));
        System.out.println(test.removeFromFront());
        System.out.println(Arrays.toString(test.getBackingArray()));
//        System.out.println(test.removeFromFront());
//        test.addToBack(33);
//        System.out.println(Arrays.toString(test.getBackingArray()));
//        System.out.println(test.size());
//        System.out.println(test.removeFromFront());
//        System.out.println(test.size());
//        System.out.println(test.removeFromBack());
//        System.out.println(Arrays.toString(test.getBackingArray()));
//        System.out.println(test.size());
    }
}
