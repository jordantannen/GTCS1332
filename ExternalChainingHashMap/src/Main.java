import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExternalChainingHashMap<Integer, Integer> testMap = new ExternalChainingHashMap<>();

        testMap.put(1, 12);
        System.out.println(testMap.put(1, 14));
        System.out.println(testMap.put(27, 3));
        System.out.println(testMap.put(14, 53));
        System.out.println(testMap.put(6, 5));
        System.out.println(testMap.put(8, 8));

//        System.out.println(testMap.size());
        System.out.println(Arrays.toString(testMap.getTable()));
//
        ExternalChainingMapEntry<Integer, Integer>[] table = testMap.getTable();

        ExternalChainingMapEntry<Integer, Integer> entry = table[1].getNext();

        System.out.println(entry);
        System.out.println(entry.getNext());

        System.out.println(testMap.remove(8));
        System.out.println(Arrays.toString(testMap.getTable()));

        System.out.println(testMap.remove(14));
        System.out.println(Arrays.toString(testMap.getTable()));

        System.out.println(testMap.remove(27));
        System.out.println(Arrays.toString(testMap.getTable()));

        System.out.println(testMap.remove(1));
        System.out.println(Arrays.toString(testMap.getTable()));

//        System.out.println(testMap.remove(40));
//        System.out.println(Arrays.toString(testMap.getTable()));

//        System.out.println();
//
//        System.out.println(testMap.put(18, 3));
//        System.out.println(testMap.put(7, 83));
//        System.out.println(testMap.put(0, 3));
//        System.out.println(testMap.put(17, 23));
//        System.out.println();
//
//        System.out.println(Arrays.toString(testMap.getTable()));

    }
}
