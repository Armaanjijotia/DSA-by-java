import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        // Start from second last row and move upwards
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int down = triangle.get(i + 1).get(j);
                int diagonal = triangle.get(i + 1).get(j + 1);

                int current = triangle.get(i).get(j);
                triangle.get(i).set(j, current + Math.min(down, diagonal));
            }
        }

        // Top element contains the answer
        return triangle.get(0).get(0);
    }
}