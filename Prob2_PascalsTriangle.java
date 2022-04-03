// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i< numRows; i++){
            List<Integer> temp = new ArrayList<>();
            
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)    temp.add(1); //Adding 1 as first and last element in each row of triangle
                else{
                    int p = list.get(i-1).get(j-1); //T[p,j] = T[p-1,j-1] + T[p-1,j] // P = row, j = column 
                    int q = list.get(i-1).get(j);                    
                    
                    temp.add(p + q); //Add those 2 numbers and insert it into list
                }
            }
            list.add(temp); //After each level, add temp list in result list
        }
        
        return list;
    }
}
