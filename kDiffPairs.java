// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Usage of keySet().


// Your code here along with comments explaining your approach

class Solution {
	public int findPairs(int[] nums, int k) {
		 if (nums == null || nums.length == 0) return 0;
		 
		 HashMap<Integer, Integer> map = new HashMap<>();
		 
		 for(int i : nums) {
			  map.put(i, map.getOrDefault(i, 0) + 1);
		 }
		 
		 int res = 0;
		 for(int i : map.keySet()) {
			  if(k == 0) {
					if (map.get(i) >= 2)
						 res++;
			  } else {
					if(map.containsKey(i + k)) {
						 res++;
					}
			  }
		 }
		 return res;
	}
}