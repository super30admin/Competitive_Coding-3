/*
* abs|nums[i] - nums[j]| = k -> nums[i] - nums[j] = +k/-k
nums[i] = k + nums[j] or nums[i] = -k + nums[j]
so I will have a set to store visited elements and one set to maintain the pair as we want unique pairs
we iterate through the elements and see if we have already encountered k + nums[j] or -k + nums[j] in the set, if so we add the sorted pair in the unique set that way we only have unique pairs and at the end return the size of the set   
*/

// Time Complexity : O(N) - iterating over the array
// Space Complexity : O(N) - using set for storing the visited and unique pairs which can store at most N elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> visited = new HashSet<>();
        HashSet<List<Integer>> unique_pair = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int diff = k + nums[i];
            if(visited.contains(diff)){
                int[] arr = {nums[i], diff};
                Arrays.sort(arr);
                unique_pair.add(Arrays.asList(arr[0], arr[1]));
            }

            diff = -k + nums[i];
            if(visited.contains(diff)){
                int[] arr = {nums[i], diff};
                Arrays.sort(arr);
                unique_pair.add(Arrays.asList(arr[0], arr[1]));
            }
            visited.add(nums[i]);
        }
        return unique_pair.size();
    }
}