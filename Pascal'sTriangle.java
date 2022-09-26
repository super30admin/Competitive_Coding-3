// Time Complexity : O(numRows^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> out = new ArrayList<>();

        for(int i = 0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){
                    list.add(1);
                } else {
                    int r = out.get(i-1).get(j-1);
                    int l = out.get(i-1).get(j);
                    list.add(r+l);
                }
            }
            out.add(list);
        }
        return out;
    }
}