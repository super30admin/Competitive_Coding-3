//Time Complexity: O(n^2) where n is numRows
//Space Complexiy: O(n) where n is numRows. (Since we are creating extra prev and cur with max size n) Considering we cannot avoid the space cost which require us to return list of list.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//We will run a loop of numRows as this many rows are required.
//We will run a nested loop of size i as the current size would be starting from 1 and will keep increasing
//First and last element of each row would be 1.
//All the middle element would be sum of corresponding element in previous row and the element left to that.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  res = new ArrayList<List<Integer>>(); 
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        res.add(prev);
        if(numRows == 1)
            return res;
        for(int i = 1; i < numRows; i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j = 1; j < i; j++){
                cur.add(prev.get(j-1) + prev.get(j));
            }
            cur.add(1);
            prev = cur;
            res.add(prev);
        }
        return res;
    }
}