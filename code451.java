class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Convert map to list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency (descending)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}