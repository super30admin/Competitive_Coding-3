//Time Complexity: O(N*N) where N is numRows
//Space Complexity: O(1);
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        triangle.add(new ArrayList<>(Arrays.asList(1)));
        for(int i= 1;i<numRows;i++){
            List<Integer> newRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i-1);

            newRow.add(1);
            for(int j=1;j<i;j++){
                newRow.add(previousRow.get(j-1)+previousRow.get(j));
            }
            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }
}