// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class KDiffPairs {
    class Solution {
        public int findPairs(int[] nums, int k) {
            int n = nums.length;
            int count = 0;

            Arrays.sort(nums);

            for(int i = 0; i < n; i++){

                if(i > 0 && nums[i] == nums[i - 1]){
                    continue;
                }

                int target = nums[i] + k;
                int l = i + 1, r = n - 1;
                while(l <= r){
                    int mid = l + (r - l)/2;
                    if(nums[mid] == target){
                        count++;
                        break;
                    }
                    else if(nums[mid] > target){
                        r = mid - 1;
                    }
                    else{
                        l = mid + 1;
                    }
                }
            }

            return count;
        }
    }
}
