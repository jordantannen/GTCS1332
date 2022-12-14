import java.util.Comparator;

/**
 * Your implementation of various iterative sorting algorithms.
 */
public class Sorting {

    /**
     * Implement bubble sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * NOTE: You should implement bubble sort with the last swap optimization.
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        int stopIndex = arr.length - 1;
        while (stopIndex != 0){
            int i = 0;
            int lastSwapped = 0;
            while (i < stopIndex){
                if (comparator.compare(arr[i], arr[i + 1]) > 0){
                    T placeHolder = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = placeHolder;
                    lastSwapped = i;
                }
                i++;
            }
            stopIndex = lastSwapped;
        }
    }

    /**
     * Implement selection sort.
     *
     * It should be:
     * in-place
     * unstable
     * not adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n^2)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        for (int i = arr.length - 1; i > 0; i--){
            int maxVal = i;
            for (int j = 0; j < i; j++){
                if (comparator.compare(arr[j], arr[maxVal]) > 0){
                    maxVal = j;
                }
            }
            T placeHolder = arr[i];
            arr[i] = arr[maxVal];
            arr[maxVal] = placeHolder;
        }
    }

    /**
     * Implement insertion sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        for (int i = 1; i < arr.length; i++){
            int innerLoopIndex = i;
            while (innerLoopIndex != 0 && comparator.compare(arr[innerLoopIndex], arr[innerLoopIndex - 1]) < 0){
                T placeholder = arr[innerLoopIndex];
                arr[innerLoopIndex] = arr[innerLoopIndex - 1];
                arr[innerLoopIndex - 1] = placeholder;
                innerLoopIndex--;
            }
        }
    }
}