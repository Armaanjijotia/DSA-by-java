import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> path, List<String> result) {
        // If 4 parts formed and string is fully used
        if (path.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        // Try 1 to 3 digits
        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;

            String part = s.substring(index, index + len);

            // Skip invalid parts
            if (isValid(part)) {
                path.add(part);
                backtrack(s, index + len, path, result);
                path.remove(path.size() - 1); // backtrack
            }
        }
    }

    private boolean isValid(String part) {
        // No leading zero
        if (part.length() > 1 && part.charAt(0) == '0') return false;

        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}