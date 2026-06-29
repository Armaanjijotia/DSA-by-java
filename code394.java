import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(num);
                strStack.push(curr);
                num = 0;
                curr = "";
            } else if (ch == ']') {
                int k = countStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());

                while (k-- > 0) {
                    temp.append(curr);
                }

                curr = temp.toString();
            } else {
                curr += ch;
            }
        }

        return curr;
    }
}