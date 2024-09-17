// Time Complexity : O(n^2)
// Space Complexity : O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                //first and last elememt in the row is 1
                if(j == 0 || j == i)
                    list.add(1);
                //jth element of current row is equal to sum of jth and j-1th element from previous row
                else
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(list);
        }
        return res;
    }
}