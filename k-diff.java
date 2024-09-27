// Time Complexity : O(nlogn) where n is size of input Array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Use 2 pointers starting i at index 0 and j at index 1, increment j  when  diff < k else increment i and j both
class Solution {
    public int findPairs(int[] nums, int k) {

        // holds the freq
        /*Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }*/

        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int counter = 0;

        while(i < nums.length-1 && j < nums.length) {
            int diff = nums[j]  - nums[i];
            if (diff < k) {
                 do {
                    j++;
                } while (j < nums.length && nums[j] == nums[j-1]);
                continue;
            } else if (diff == k) {

                counter++;
            }
            do {
                i++;
            } while (i < nums.length - 1 && nums[i] == nums[i-1]);

            j=Math.max(i+1,j);

        }

        return counter;
    }
}
