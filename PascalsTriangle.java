//Time Complexity = O(m+n)
//space Complexity = O(n)
//Stitch Fix
// Here we will be moving on to every row and fix the value of each column in that particular row. we will be inserting those values in the list for every row and in the end we will be inserting that list for every row in the final list and return that list
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        for(int i = 0; i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) row.add(1);
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