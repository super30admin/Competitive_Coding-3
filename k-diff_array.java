// Time Complexity : O(N) best case, O(N^2) worst case
// Space Complexity : O(N) used hashmap to store all the array elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to look at the solution


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        //base checks
        if (nums == null || nums.length == 0 || k < 0) {
        return 0;
    }
        
        //store all elements and the number of occurance in hashmap
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    for (int n : nums) {
        //System.out.println(map.getOrDefault(n,0)+1);
        map.put(n, map.getOrDefault(n, 0)+1);
    }
        
        //initialize count
    int count = 0;
        
        //if k==0, then we just need to see if there exits more than 2 elements
    if (k == 0) {
        for (Integer key: map.keySet()) {
            if (map.get(key) >= 2) {
                count++;
            }
        }
    } else { //else, we need to see whether there exists elements which is equivalent to key and addition of target value (k), so that their diff is equivalent to 0
        for (Integer key: map.keySet()) {
            if (map.containsKey(key+k)) {
                count++;
            }
        }
    }
    return count;
    }
}