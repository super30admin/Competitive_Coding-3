/** Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
* TC O(NlogN) - To sort and then do a one pass to find the pairs
* SC O(1)
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if (nums == null || nums.length == 0)
            return count;
        Arrays.sort(nums);
        int i = 0, j = 1;
        while(i< nums.length && j < nums.length) {
            if((Math.abs(nums[i]-nums[j]) < k) || (i == j)) {
                j++;
            }
            else if (Math.abs(nums[i]-nums[j]) > k) {
                i++;
            }
             else {
                 i++;
                 j++;
                 while(j < nums.length && nums[j] == nums[j-1]) {
                     j++;
                 }
                 count++;
             }
        }
        return count;
    }
}
