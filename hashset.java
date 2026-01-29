import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {

        // Create a HashSet (it stores unique values only)
        HashSet<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);   // duplicate value, it will NOT be added

        // Print the size of the set
        System.out.println("Size of set is " + set.size());

        // Check if element 1 is present
        if (set.contains(1)) {
            System.out.println("Element 1 is present");
        }

        // Check if element 6 is NOT present
        if (!set.contains(6)) {
            System.out.println("Element 6 is not present");
        }

        // Print all elements of the set
        System.out.println("Set is " + set);

        // Remove element 1 from the set
        set.remove(1);

        // Check again after removing
        if (!set.contains(1)) {
            System.out.println("Element 1 is deleted");
        }

        // Print set after deletion
        System.out.println("Set is " + set);

        // Iterator is used to go through each element one by one
        Iterator<Integer> it = set.iterator();

        // Loop runs until all elements are printed
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
