// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashSet;

class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        HashSet<Integer> uniqueNums = new HashSet<>();

        HashSet<Integer> diffNums = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(uniqueNums.contains(nums[i] - k))
            {
                diffNums.add(nums[i] - k);
                System.out.println("nums[i] - k: " + (nums[i] - k));
            }

            if(uniqueNums.contains(nums[i] + k))
            {
                diffNums.add(nums[i]);
                System.out.println("nums[i]: " + nums[i]);
            }

            uniqueNums.add(nums[i]);

        }

        System.out.println(uniqueNums);

        System.out.println(diffNums);

        return diffNums.size();

    }
}