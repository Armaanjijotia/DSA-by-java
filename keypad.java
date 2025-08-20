public class keypad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void generateCombinations(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return; // Important to stop recursion here
        }

        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            generateCombinations(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        generateCombinations(str, 0, "");
    }
}
