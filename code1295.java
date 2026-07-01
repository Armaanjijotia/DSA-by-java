class Solution {
    public int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];   // Copy the value
            int numOfDigits = 0;

            while (num != 0) {
                num = num / 10;
                numOfDigits++;
            }

            if (numOfDigits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}