import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        int[] testArr = {0, -2147483648};
        System.out.println(Arrays.toString(testArr));

        Sorting.lsdRadixSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }
}