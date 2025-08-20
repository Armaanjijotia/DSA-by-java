public class moveX {
    public static String moveAllX(String str, int idx, int count, String newString) {
        // Base case: if we've gone through the whole string
        if (idx == str.length()) {
            // Add all 'x' characters at the end
            for (int i = 0; i < count; i++) {
                newString = newString + 'x';
            }
            return newString;
        }
        char currChar = str.charAt(idx); // Get current character

        if (currChar == 'x') {
            // Count 'x' but don't add to newString yet
            return moveAllX(str, idx + 1, count + 1, newString);
        } else {
            // Add non-'x' characters directly to newString
            newString += currChar;
            return moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxdr";
        String result = moveAllX(str, 0, 0, "");
        System.out.println("Result: " + result);  // Output should be: abcdrxxx
    }
}
