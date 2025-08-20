import java.util.HashSet;

public class unisubseqn {
    public static void seqn(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (!set.contains(newString)) {
                set.add(newString);
                System.out.println(newString);
            }
            return;
        }
        char curm = str.charAt(idx);
        // Include the current character
        seqn(str, idx + 1, newString + curm, set);
        // Exclude the current character
        seqn(str, idx + 1, newString, set);
    }
    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        seqn(str, 0, "", set);
    }
}
