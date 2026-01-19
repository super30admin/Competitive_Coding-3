import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int right=1;
        int left=0;
        int count=0;
        //int arr= new int[n];

        while(left<n && right<n){
            if(left==right || nums[right]-nums[left]<k){
                right++;
            }

            else if(nums[right]-nums[left]>k){
                left++;
            }
            else{
                count++;
                left++;
                right++;
                // Skip duplicates
                while (right < n && nums[right] == nums[right - 1]) right++;
                while (left < right && nums[left] == nums[left - 1]) left++;
            }
        }
        return count;
    }
}


