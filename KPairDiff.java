// Time Complexity : O(NLogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int findPairs(int[] nums, int k) {
        int N = nums.length;
        int count = 0;
        Arrays.sort(nums);
        int slow = 0;
        int fast = 1;
        while(fast<N) {
            //avoid duplicates on slow pointer
            while(slow>0 && slow < N && nums[slow] == nums[slow-1]) {
                slow++;
            }
            //avoid duplicates on fast pointer
            while(fast>slow+1 && fast < N && nums[fast] == nums[fast-1]) {
                fast++;
            }
            //when we updated the slow due to duplication, we should increment the fast, so the we can compare ahead
            if(slow == fast) fast++;
            //when reached max due to duplicate - incrementation
            if(slow >= N || fast >= N) break;
            if(nums[fast] - nums[slow] == k) {
                count++;
                slow++;
                fast++;
            } else if(nums[fast] -nums[slow] < k) {
                fast++;
            } else {
                slow++;
            }
        }
        return count;
    }
}


// brute force O(N^2) time
class Solution {
    public int findPairs(int[] nums, int k) {
        int N = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<N-1;i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<N;j++) {
                if(j> i+1 && nums[j] == nums[j-1]) continue;
                if(nums[j]-nums[i] == k) count++;

            }
        }
        return count;
    }
}