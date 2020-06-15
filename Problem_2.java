// Time complexity - O(n^2)
// Space complexity - O(1) 

// Get the previous row and add element above and left element.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i< numRows; i++){
            List<Integer> row  = new ArrayList<>();
            for(int j = 0; j<= i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            res.add(row);
        }
        return res;
    }
}
