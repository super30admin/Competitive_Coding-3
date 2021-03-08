// Time Complexity : O(n^2)
// Since we are traversing through the temperory stored list and again the same list in the next iteration
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        result.add(list);
        while(numRows > 1){
            list = result.get(result.size()-1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
          // add from the previous list of result list, this is similar to dynamic programming approach
            for(int i=1;i<list.size();i++){
                newList.add(list.get(i-1)+list.get(i));
            }
            newList.add(1);
            result.add(newList);
            numRows--;
        }
        return result;
    }
}
