// Time Complexity : O(nlogn)
// Space Complexity : O(n1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach
// Used the pointers approach
// Sorted the array first
// took left as 0 and right as 1 and incremented the values of left and right based on difference

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return 0;
        int count = 0;
        int left = 0, right = 1;
        Arrays.sort(nums);

        while (left < nums.length && right < nums.length) {
            if (left == right || nums[right] - nums[left] < k)
                right++;
            else if (nums[right] - nums[left] > k)
                left++;
            else {
                left++;
                count++;
                while (left < nums.length && nums[left] == nums[left - 1])
                    left++;
            }

        }

        return count;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach
// Used Hashmap for this
// At first added the elements and their frequency to the map
// then in another loop for each element calculated the sum with k and checked
// if it was present in the map
// if yes added to the count
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            System.out.println(x + " " + val);
            if (k > 0 && map.containsKey(x + k))
                count++;
            else if (k == 0 && val > 1)
                count++;
        }
        return count;

    }
}