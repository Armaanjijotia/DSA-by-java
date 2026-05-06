import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);

        // If endWord not present → no solution
        if (!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String word = queue.poll();

                // If reached endWord
                if (word.equals(endWord)) return level;

                char[] arr = word.toCharArray();

                // Try all possible one-letter changes
                for (int j = 0; j < arr.length; j++) {
                    char original = arr[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[j] = c;
                        String newWord = new String(arr);

                        if (set.contains(newWord)) {
                            queue.offer(newWord);
                            set.remove(newWord); // mark visited
                        }
                    }

                    arr[j] = original; // restore
                }
            }

            level++;
        }

        return 0;
    }
}