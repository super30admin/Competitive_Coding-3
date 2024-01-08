// SOLUTION 1
// Binary Search

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int target = nums[i] + k;

            // binary search for target
            int lo = i+1;
            int hi = nums.length-1;
            int mid = lo + (hi - lo)/2;

            while(lo <= hi){
                if(nums[mid] == target){
                    count++;
                    System.out.println(nums[i] + " : " + nums[mid]);
                    break;
                } else if(nums[mid] > target){
                    hi = mid-1;
                } else lo = mid+1;
                mid = lo + (hi - lo)/2;
            }

        }
        return count;
    }
}

// SOLUTION 2
// HashSet

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int count  = 0;

        if(k == 0){
            Set<Integer> seenAgain = new HashSet<>();
            for(int n : nums){
                if(seen.contains(n)) seenAgain.add(n);
                seen.add(n);
            }

            return seenAgain.size();
        }

        for(int n : nums){
            if(seen.contains(n)) continue;
            if(seen.contains(n-k)) count++;
            if(seen.contains(n+k)) count++;
            seen.add(n);
        }

        return count;
    }
}
