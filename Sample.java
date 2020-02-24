// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// Problem 1 - Pascal Triangle
class Solution {
    
    //  Time complexity - O(numRows^2)
    //  Space complexity - O(numRows) for curr list
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        //edge case
        if(numRows == 0)
            return res;
        
        for(int i = 0; i < numRows; i++){
            List<Integer> curr = new ArrayList<>(); 
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    //Step 1: add first and last value as 1 for each row
                    curr.add(1);
                }else{
                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    //Step 2: middle values are sum of last rows j - 1 & j  value
                    curr.add(left + right);
                }
            } 
            res.add(curr);
            
        }
        
        return res;
    }
}


// Problem 2 - 532. K-diff Pairs in an Array
class Solution {
    // Time complexity - O(n)
    // Space complexity - O(n)
    public int findPairs(int[] nums, int k) {
        //edge case
        if(k < 0 || nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        //Step 1: create the count for case when k == 0
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        //Step 2: if num + k exists in the map increment count
        for(Integer key: map.keySet()){
            if(k == 0){
                //special case if k == 0 then [3,1, 1, 4, 5] only duplicates should contribute to the count
                if(map.get(key) > 1)
                    count += 1;
            }else{
                if(map.containsKey(key + k)) count += 1;
            }
        }
        
        return count;
    }
}