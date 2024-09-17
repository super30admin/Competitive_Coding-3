/* Time Complexity :  O(n^2)
   Space Complexity :  O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int i=1;
        List<Integer> row= new ArrayList<>();
        row.add(1);
        res.add(row);
        while(i<numRows){
            row= new ArrayList<>();
            row.add(1);
           // List<Integer> prev = res.get(res.size()-1);
            for(int j=0;j<i-1;j++)
            {
                row.add(res.get(res.size()-1).get(j) + res.get(res.size()-1).get(j+1));
            }
            row.add(1);
            res.add(row);
            i++;
        }
        return res;
    }
        
}