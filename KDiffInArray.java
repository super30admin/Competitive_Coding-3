//Time complexity:O(n)
//Space ComplexityO(1)
/*Approach
-Taking two pointers and moving it till the end of the array after sorting the array
- if diff is less than our target obviously we need to move the fast pointer
-if diff is greater we need to move slow pointerto reach near to k
-if we find the diff we need to increment our count and we need to increase slow and fast both
and also we need to avoid duplicate pairs so we need to increment fast till it becomes different

 */

import java.util.Arrays;

public class KDiffInArray {
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = 0;
        int count = 0;
        while(slow < nums.length && fast < nums.length){
            int diff = nums[fast]-nums[slow];
            if(slow == fast || diff < k) fast++;
            else if(diff > k) slow++;
            else {
                count++;
                slow++;
                fast++;
                while(fast < nums.length && nums[fast-1] == nums[fast])fast++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println(findPairs(new int[]{4,5,6,2,1,3,7,6,4}, 2));
    }

}