/*
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    sort array.
    returning distince pairs so can only happens when slow and fast are at new
    values.
    create three conditions:
    1.if fast and slow are same  or if diff between two number is < k
      increase gap by fast++;
    2.if number at slow already seen or diff between two number is > k
      reduce gap by slow++
    3. diff between two number is = k
      increment cnt slow and fast.
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int slow = 0;
        int fast = 0;
        int cnt = 0;
        while(fast < nums.length){
            if(slow == fast || nums[fast] - nums[slow] < k )
                fast++;
            else if( (slow > 0 && nums[slow] == nums[slow-1]) ||
                    nums[fast] - nums[slow] > k)
                slow++;
            else if(nums[fast] - nums[slow] == k){
                cnt++;fast++; slow++;
            }
        }
        return cnt;
    }
}
