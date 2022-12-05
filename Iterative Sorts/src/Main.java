import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] testArray = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        System.out.println(Arrays.toString(testArray));

        for (int i = 1; i < testArray.length; i++){
            int innerLoopIndex = i;
            while (innerLoopIndex > 0 && testArray[innerLoopIndex] < testArray[innerLoopIndex - 1]){
                int placeholder = testArray[innerLoopIndex];
                testArray[innerLoopIndex] = testArray[innerLoopIndex - 1];
                testArray[innerLoopIndex - 1] = placeholder;
                innerLoopIndex--;
            }
        }
        System.out.println(Arrays.toString(testArray));
        System.out.println();
        int[] testArrayTwo = {4,3,1,5,2,6,7};
        System.out.println(Arrays.toString(testArrayTwo));

        int stopIndex = testArrayTwo.length - 1;
        while (stopIndex != 0){
            int i = 0;
            int lastSwapped = 0;
            while (i < stopIndex){
                if (testArrayTwo[i] > testArrayTwo[i + 1]){
                    int placeHolder = testArrayTwo[i];
                    testArrayTwo[i] = testArrayTwo[i + 1];
                    testArrayTwo[i + 1] = placeHolder;
                    lastSwapped = i;
                }
                i++;
            }
            stopIndex = lastSwapped;
        }
        System.out.println(Arrays.toString(testArrayTwo));

    }
}
