/**
nums = [3,1,4,1,5], k = 2

1,1,3,4,5 
    i   j
    
    2
 
nums[i]-nums[j] == 0 < 2
== 2 we found the pair. increment the result counter.

1 1 3 4 5 k = 0

**/

class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int left = 0;
        int right = 1;
        
        int numberOfUniquePairs = 0;
        
        while(left< nums.length && right < nums.length)
        {
            int pairDiff = nums[right] - nums[left];
            
            if (pairDiff < k)
            {
                right++;
            }
            else if (pairDiff > k)
            {
                left++;
            }
            else
            {
                numberOfUniquePairs++;
                left++;
                while (left < nums.length && nums[left] == nums[left - 1])
                {
                    left++;
                }
            }
        }
        
        return numberOfUniquePairs;
    }
}