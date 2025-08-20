public class occrOfElement {
    public static int first = -1;  // -1 means not found yet
    public static int last = -1;   // -1 means not found yet

    // Recursive function to find first and last occurrence of 'element' in 'str'
    public static void findOccurrence(String str, int idx, char element) {
        // Base case: If index reaches the length of the string, stop recursion
        if (idx == str.length()) {
            // Print the results when finished searching
            System.out.println("First occurrence: " + first);
            System.err.println("Last occurrence: " + last);
            return;
        }

        // Get the character at the current index
        char currChar = str.charAt(idx);

        // Check if current character matches the element we are looking for
        if (currChar == element) {
            // If first occurrence is not set, set it to current index
            if (first == -1) {
                first = idx;
            } else {
                // If first occurrence is already set, update last occurrence to current index
                last = idx;
            }
        }

        // Call the function recursively with the next index
        findOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";  // The string to search
        char element = 'a';            // The character to find first and last occurrences of
        findOccurrence(str, 0, element);  // Start recursion from index 0
    }
}