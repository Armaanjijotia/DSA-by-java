public class linearSearch {
    // ---------- 4. Linear Search ----------
    // Method to perform Linear Search
    public static int linearSearchs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i; // Return index if found
        }
        return -1; // Not found
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Array to search in
        int target = 3;                       // Element to search for

        int result = linearSearchs(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
         
        }
    }
}

    

