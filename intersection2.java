import java.util.*;
public class intersection2 {

    public static int intersection(int arr1[], int arr2[]) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1 to set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        // Check elements of arr2
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]); // avoid duplicate counting
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, 4};
        int arr2[] = {1, 4, 6, 7, 8, 9};
        System.out.println(intersection(arr1, arr2));
    }       // OUTPUT 1 (because 1 element repeat)
}
