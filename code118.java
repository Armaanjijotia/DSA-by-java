import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // First and last element is always 1
            row.add(1);

            // Fill middle elements
            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1) 
                        + triangle.get(i - 1).get(j);
                row.add(val);
            }

            // Add last 1 if row > 0
            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}