class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                absent++;
                late = 0;      // Late streak breaks
                if (absent >= 2) {
                    return false;
                }
            } 
            else if (ch == 'L') {
                late++;
                if (late >= 3) {
                    return false;
                }
            } 
            else { // 'P'
                late = 0;      // Late streak breaks
            }
        }

        return true;
    }
}