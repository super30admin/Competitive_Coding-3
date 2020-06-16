class Solution {
    public int findPairs(int[] nums, int k) {
       Arrays.sort(nums); // trick sort first to not get negatives 
      
       int n = nums.length; 
       int slow = 0;
       int fast = 0;
       int count = 0;
       while(slow < n && fast < n){
          
           //case1: First check slow and fast same or not 
           if( slow == fast ||  nums[fast] - nums[slow] < k )  fast++; //bring slow closer to fast pointer
           
           //case2:
           else if(nums[fast]- nums[slow] > k) slow++;  
           
           //case3
           else{
               count++;
               slow++;
               fast++;   // no need to take another ds like list and count them because we dont want pairs we only want count
           
               while(fast < n &&  nums[fast] == nums[fast -1]) fast++; //also dont forget to check if prev and current val same increment fast
           }    
       }
        return count;
    } 
}

/*
TimeComplexity: O(nlogn)(sort) + O(n)(traverse each element) = O(nlogn)
SpaceComplexity: O(1) as used same nums array for computation
*/