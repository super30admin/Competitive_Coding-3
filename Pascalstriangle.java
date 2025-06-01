//Problem 118:Pascal's Triangle
//Solved Successfully on leetcode and faced no issues
//TC:O(n^2) SC = O(n^2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>output = new ArrayList<>();
        if(numRows == 0){
            return output;
        }
        for(int i = 0 ; i < numRows ; i++){
            List<Integer>row = new ArrayList<>();
            row.add(1);
       
         for(int j = 1 ; j<i ; j++){
                row.add(output.get(i-1).get(j-1) + output.get(i-1).get(j));
            }
        if(i>0){
        row.add(1);
        }
        output.add(row);
        }
        return output;


        
    }
}