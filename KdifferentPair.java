//Time complexity is : O(nlogn)
//Sorting the array is logn and traversing the array is n


class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length -1;
        int ptr1 = 0;
        int ptr2 = 1;
        int count = 0;
        Arrays.sort(nums);
        while(ptr1 <= n && ptr2 <= n){
            if(ptr1== ptr2 || (nums[ptr2]- nums[ptr1])< k){
                ptr2++;
            }else if(nums[ptr2] - nums[ptr1] >k){
                ptr1++;
            }else{
                ptr1++;
                count++;
                while (ptr1 <= n  && nums[ptr1] == nums[ptr1 - 1])
                    ptr1++;
            }
        }
        
         return count;                                     
    }
}