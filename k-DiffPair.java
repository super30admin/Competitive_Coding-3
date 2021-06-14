//time complexity: O(nlogn)
//space complexity:O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int slow=0; int fast=0;
        int n=nums.length;
        int count=0;
        while(fast<n && slow<n)
        {
            if(slow==fast || nums[fast]-nums[slow]<k)
            {
                fast++;//initially increment the fast pointer 
                //and if the diff is less than k increment fast 
                //as we need greater diff 
            }
            else if(nums[fast]-nums[slow]==k)
            {    count++;
                slow++;// if the diff is equal to k then increment both pointers
                fast++;
                while(fast<n&&nums[fast]==nums[fast-1])
                    fast++;//this is to avoid duplicate pairs
            }
             else
             {
                slow++;//if k is greater increment slow to get the desired k
                
             }
        }
        return count;
    }
}
