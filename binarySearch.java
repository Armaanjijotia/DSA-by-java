public class binarySearch {
    // ---------- 5. Binary Search ----------

    // Method to perform Binary Search
    public static int binarySearchs(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (right>=left) {
            int mid = left + (right - left) / 2; // Prevents overflow

            if (arr[mid] == target)
                return mid; // Found

            if (arr[mid] < target)
                left = mid + 1; // Search in right half
            else
                right = mid - 1; // Search in left half
        }
        return -1; // Not found
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70}; // Array must be sorted
        int target = 40; // Element to search for

        int result = binarySearchs(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }
}


