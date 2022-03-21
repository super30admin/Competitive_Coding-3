// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        result.add(tmp);
        for(int i = 1; i < numRows; i++){
            tmp = new ArrayList<>();
            for(int j=0; j <=result.get(i-1).size(); j++){
                if(j==0 || j== result.get(i-1).size()){
                    tmp.add(1);
                }else{
                    tmp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(tmp);
        }
        return result;
    }
}
