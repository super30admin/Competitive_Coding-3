//time complexity: O(nlogn)
//space: O(1)

import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);      //11345
        int count=0;
        for(int i=0; i < nums.length; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int left=i+1;
           int right=nums.length-1;
            
            while(right<nums.length-1 && nums[right]==nums[right+1])
                right--;
             
            int target = k+nums[i];
            while(left<=right)
            {
                int mid = left+(right-left)/2;
                if(nums[mid]==target)
                   { count++;
                   break;}
                else if(nums[mid]<target)
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return count;
    }
}