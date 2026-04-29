class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        long val = 1; // first element is always 1
        row.add((int) val);
        
        for (int i = 0; i < rowIndex; i++) {
            val = val * (rowIndex - i) / (i + 1);
            row.add((int) val);
        }
        
        return row;
    }
}