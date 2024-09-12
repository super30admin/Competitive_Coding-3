//Time Complexity - O(nlogn)
//Space complexity - O(1)
//Ran successfully on leetcode
/*3 point algo is as follows - 
	1. We sort the array first and then start two pointers slow and fast from the beginning
	2. Then we compare the difference of slow and fast pointers. If its greater than k, then we move the slow pointer. Else, we move the fast pointer.
	3. If the difference is equal to k, then we increase count and move both pointers. 
	4. Then we interate the fast pointer if the previous element is the same, in order to avoid duplicates.*/

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(nums.empty())
            return 0;
        sort(nums.begin(),nums.end());
        int slow=0,fast=1,count=0;
        while(fast<nums.size())
        {
            if(slow==fast || nums[fast]-nums[slow]<k)
                fast++;
            else if(nums[fast]-nums[slow]>k)
                slow++;
            else
            {
                count++;
                slow++;
                fast++;
                while(fast<nums.size() && nums[fast]==nums[fast-1])
                    fast++;
            }
        }
        return count;
    }
};