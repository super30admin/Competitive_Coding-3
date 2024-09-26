// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :NO


// In this I took the hashMap and all the elements of the array are inserted into it.
//Then in the second pass we search the element.


class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(nums[i])) {
				hash.put(nums[i], hash.get(nums[i]) + 1);
			} else {
				hash.put(nums[i], 1);
			}
		}
		int target = 0;
		int count = 0;
		for (int keys : hash.keySet()) {
			target = keys + k;
			if (hash.containsKey(target)) {
//				System.out.println(keys+","+target);
				if (keys == target && hash.get(keys) == 1) {
					continue;
				}
				count++;
			}
		}
		return count;
    }
}