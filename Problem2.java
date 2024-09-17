//O(NlogN) time
//O(1) space

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        if(nums.length==1)
            return 0;

        int slow =0;
        int fast =1;

        while(fast<nums.length){
            if(fast == slow)
                fast++;
            else if(nums[fast] - nums[slow] == k){
                result++;
                do{
                    fast++;
                    if(fast == nums.length)
                        return result;
                }while(nums[fast] == nums[fast-1]);
            }
            else if(nums[fast] - nums[slow] > k)
                slow++;
            else
                fast++;
        }
        return result;
    }
}