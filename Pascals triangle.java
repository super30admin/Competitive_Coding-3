// Time Complexity :O(m*n) m=number of rows n=number f elements in each row
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//approach: add 1 to left and iterating to add right side elements in each row except first element because it will always be 1

class Solution {
    public List<List<Integer>> generate(int k) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        for(int i=0; i<k;i++){
            row.add(0,1);
            for (int j=1; j<row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            result.add(new ArrayList(row));
        }
        return result; 
    }
}