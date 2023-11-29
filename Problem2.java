import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Time Complexity : O(N*Log(N))
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Sort array in ascending order. Pick each element an check in the remaining array. If
//it is present store it inside a set. Return the size of the array

class Problem2 {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> arr = new HashSet<Integer>();

        for(int i=0; i<nums.length-1;i++){
            int target = nums[i]+k;
            if(binarySearch(nums,i+1,nums.length-1,target) > 0){
                arr.add(nums[i]);
            }
        }
        return arr.size();
    }

    private int binarySearch(int[] nums, int i, int n, int target){

        int low = i;
        int high = n;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return 1;
            } else if(target>nums[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return -1;
    }
}