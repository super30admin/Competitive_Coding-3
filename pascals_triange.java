// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows >= 1){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            result.add(list);
        }
        if(numRows >= 2){
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);

            result.add(list2);
        }

        for(int i = 2; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1; j < i; j++){
                List<Integer> subList = result.get(result.size() - 1);
                int num = subList.get(j) + subList.get(j - 1);
                list.add(num);
            }
            list.add(1);
            result.add(list);
        }

        return result;
    }
}
