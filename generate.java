// Time Complexity :O(n^2) where n is numRows;
// Space Complexity : O(n) n is the number of elements in the list. (Will it be O(1)? since the need to produce a list on line 12 for the output)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        
        for(int i =0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j == i){
                    list.add(1);
                }
                else{
                    list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
                
                
                
            }
            result.add(list);
            System.out.println(result);
        }
        
        return result;
    }
}