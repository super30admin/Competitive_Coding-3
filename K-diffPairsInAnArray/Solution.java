// Time Complexity : O(n log(n) + n) --> O(n log(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Yes

/**
 * Sort the array in increasing order. Use two pointers: low at the start, high next to low. Calculate the difference between
 * elements at low and high pointer, if the difference is > k, increment high. If difference is < k, increment low. If low and
 * high are at same position, then increment high. If difference is = k, increment count. If next element is same as current,
 * skip until next element is different.
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);      //O(n log(n))
        int low=0, high=1;
        int n = nums.length, count = 0;
        while(low < n && high < n) {      //O(n)
            if(low == high || nums[high]-nums[low] < k)
                high++;
            else if(nums[high]-nums[low] > k)
                low++;
            else {
                count++;
                low++;
                while(low < n && nums[low] == nums[low-1])
                    low++;
            }
        }

        return count;
    }
}


/*

// Time Complexity : O(n log(n) + n) --> O(n log(n))
// Space Complexity : O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);     //O(n log(n))
        HashSet<Integer> set = new HashSet<>();  //O(n)
        int count = 0;
        int n = nums.length;
        for(int i=n-1; i>=0; i--) {     //O(n)
            if(set.contains(nums[i]+k)) {
                count++;
                while(i-1 >= 0 && nums[i] == nums[i-1])
                    i--;
            }

            set.add(nums[i]);
        }

        return count;
    }
}*/
