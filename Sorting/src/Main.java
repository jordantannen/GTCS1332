import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        int[] testArr = {4, 3, 6, 1, -15, 23, 7, 10, 9, 2};
        System.out.println(Arrays.toString(testArr));

        Sorting.lsdRadixSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }
}