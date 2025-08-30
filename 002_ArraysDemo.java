import java.util.*;  
import java.util.stream.*;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] intArr = {5, 2, 9, 1, 7};                 // Primitive array
        Integer[] integerArr = {5, 2, 9, 1, 7};         // Wrapper (object) array

        System.out.println("Original intArr: " + Arrays.toString(intArr));
        System.out.println("Original integerArr: " + Arrays.toString(integerArr));
        System.out.println("------------------------------------------------");

        // SINGLE DIMENSION ARRAY METHODS

        // 1. asList() -> converts object array into fixed-size List
        List<Integer> list = Arrays.asList(integerArr);
        System.out.println("asList(integerArr): " + list);

        // 2. sort() -> sorts entire array (ascending order)
        Arrays.sort(intArr);
        Arrays.sort(integerArr);
        System.out.println("sort(intArr): " + Arrays.toString(intArr));
        System.out.println("sort(integerArr): " + Arrays.toString(integerArr));

        // 3. sort() with range [start, end) -> sorts only a portion
        int[] arrRange = {9, 7, 5, 3, 1};
        Arrays.sort(arrRange, 1, 4);
        System.out.println("sort() with range [1,4): " + Arrays.toString(arrRange));

        // 4. parallelSort() -> uses multiple threads for faster sorting (large data)
        int[] arrParallel = {5, 1, 8, 3, 2};
        Arrays.parallelSort(arrParallel);
        System.out.println("parallelSort: " + Arrays.toString(arrParallel));

        // 5. binarySearch() -> returns index of key (array must be sorted)
        int index = Arrays.binarySearch(intArr, 7);
        System.out.println("binarySearch for 7: index = " + index);

        // 6. binarySearch with range
        int indexRange = Arrays.binarySearch(intArr, 1, 4, 7);
        System.out.println("binarySearch in range [1..4) for 7: index = " + indexRange);

        // 7. compare() -> lexicographic comparison (-ve,0,+ve)
        int cmp = Arrays.compare(intArr, new int[]{1, 2, 5, 7, 9});
        System.out.println("compare result: " + cmp);

        // 8. copyOf(arr, len) -> copy entire array with new length
        int[] copy = Arrays.copyOf(intArr, 7); // padding with 0 if larger
        System.out.println("copyOf (len=7): " + Arrays.toString(copy));

        // 9. copyOfRange(arr, start, end) -> copy subarray
        int[] copyRange = Arrays.copyOfRange(intArr, 1, 4);
        System.out.println("copyOfRange(1,4): " + Arrays.toString(copyRange));

        // 10. equals() -> element-wise equality check (shallow for nested arrays)
        boolean eq = Arrays.equals(intArr, new int[]{1, 2, 5, 7, 9});
        System.out.println("equals(): " + eq);

        // 11. fill() -> fills array with same value
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 42);
        System.out.println("fill(): " + Arrays.toString(fillArr));

        // 12. mismatch() -> returns first index where arrays differ (-1 if same)
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 9, 4, 5};
        System.out.println("mismatch(): " + Arrays.mismatch(a1, a2));

        // 13. spliterator() -> advanced iterator for parallel traversal
        Spliterator<Integer> spliterator = Arrays.spliterator(integerArr);
        System.out.print("spliterator(): ");
        spliterator.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // 14. stream() -> converts array to Stream API
        int sum = Arrays.stream(intArr).sum(); // only for primitive int[]
        System.out.println("stream() sum of intArr: " + sum);

        // Stream for object arrays
        Stream<Integer> stream = Arrays.stream(integerArr);
        System.out.print("stream() forEach: ");
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 15. toString() -> prints array nicely (instead of memory address)
        System.out.println("toString(intArr): " + Arrays.toString(intArr));
        System.out.println("toString(integerArr): " + Arrays.toString(integerArr));

        // MULTI-DIMENSIONAL ARRAYS SECTION (SPECIAL NOTES)

        // Normal equals() fails for nested arrays, because it only checks top-level references
        int[][] multi1 = {{1, 2}, {3, 4}};
        int[][] multi2 = {{1, 2}, {3, 4}};

        System.out.println("\nMULTI-DIMENSIONAL ARRAY COMPARISON:");
        System.out.println("multi1: " + Arrays.toString(multi1));
        System.out.println("multi2: " + Arrays.toString(multi2));
        // Above prints weird memory addresses because toString() on 2D array = shallow

        // equals() -> compares only row references, not actual content
        System.out.println("equals(multi1, multi2): " + Arrays.equals(multi1, multi2)); // false

        // deepEquals() -> compares content inside nested arrays
        System.out.println("deepEquals(multi1, multi2): " + Arrays.deepEquals(multi1, multi2)); // true

        // toString() -> only prints top-level references
        System.out.println("toString(multi1): " + Arrays.toString(multi1));

        // deepToString() -> pretty prints nested array content
        System.out.println("deepToString(multi1): " + Arrays.deepToString(multi1));

        // hashCode() vs deepHashCode()
        System.out.println("hashCode(multi1): " + Arrays.hashCode(multi1));
        System.out.println("deepHashCode(multi1): " + Arrays.deepHashCode(multi1));
    }
}
