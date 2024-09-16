// Time Complexity O(n^2)
// Space Complexity O(n)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if(numRows == 0){
            return pascal;
        }
        List<Integer> row_one = new ArrayList<>();
        row_one.add(1);
        pascal.add(row_one);
        
        for(int i=1;i<numRows;i++){
            List<Integer> temp_list = new ArrayList<>();
            List<Integer> previous = new ArrayList<>();
            previous = pascal.get(i-1);
            temp_list.add(1);
            for(int j = 1; j<i; j++){
                temp_list.add(previous.get(j-1)+previous.get(j));
            }
            temp_list.add(1);
            pascal.add(temp_list);
        }
        return pascal;
    }
}