//T.C: O(n) n: length of nums[]
//S.c: O(1) no extra space used.

/*Approach: I will be having two pointer starting right next to each other on index 0.
at each iteration i would calculate diff between the nums[i] and nums[j], if the diff matches k
then i would check for the duplicate pairs using the sum of both the numbers. 
if it passes both the conditions then i would update my count and both the pointer.
also if no match found then with ref to diff i will update the pointer inorder to achieve the diff.
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        int i = 0, j = 1;
        int count =0 ;
        int sum = Integer.MIN_VALUE;
        Arrays.sort(nums);

        while(j < nums.length && i<nums.length-1){
            int diff = nums[j] - nums[i];

            if(diff == k && sum != nums[i] + nums[j]){
              sum = nums[i]+nums[j];
              count++;
              i++;
              j++;
            }
            else if(diff < k) j++;
            else i++;

            if(i == j) j++;
        }
    return count;
    }
}