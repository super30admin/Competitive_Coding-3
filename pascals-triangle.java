// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :i have resolved this problem by using nested loop because we have to return kind of a 2d array if we have to fill row first and last position i just fill it with 1 as required and in the middle case i just took sum of previous row current col element plus previous row previous col elemeent as shown in the in picture finally i am able to get output.


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> newList=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    newList.add(1);
                }else{
                    int prevCol=result.get(i-1).get(j-1);
                    int currentCol=result.get(i-1).get(j);
                    newList.add(prevCol+currentCol);
                }
            }
            result.add(newList);
        }
        return result;
    }
}