public class insertionsort {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int array[] = {2, 4, 8, 9, 9};
        // Insertion Sort
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            // Move elements greater than key to one position ahead
            while (j >= 0 && array[j] >array[i]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = array[i];
        }
        // Print sorted array
        printArray(array);
    }
}
