public class quicksort {
// best or average = n log n 
// worst = n^2

    // Main quicksort method (recursive)
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the left and right subarrays
            quickSort(array, low, pivotIndex - 1);  // Left part
            quickSort(array, pivotIndex + 1, high); // Right part
        }
    }

    // Partition method: places pivot in correct position and arranges smaller elements to the left
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choosing last element as pivot
        int i = low - 1;          // i tracks index for smaller elements

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap pivot with element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return pivot index
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] array = {6, 3, 9, 5, 2, 8};
        int n = array.length;

        quickSort(array, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
