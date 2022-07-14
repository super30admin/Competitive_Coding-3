// Time Complexity : o(n^2)
// Space Complexity : o(n^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
     
        List<List<Integer>> result = new ArrayList<>();
        
        // result.add(Arrays.asList(1));
        // result.add(Arrays.asList(1,1));
        
        for(int i=0;i<numRows;i++){
            List<Integer> curr = new ArrayList<>(); 
           // int size=result(i-1).sizeOf()+1;
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    curr.add(1);
                }else{
                    curr.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
                }
            }
            result.add(curr);
        }
    return result;
    }
}