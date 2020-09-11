// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Approach was not intuitive for me, Had to watch Jaspinder's video.

// Your code here along with comments explaining your approach
// Keep track of both slow and fast pointers and compare their difference to the value 'k'
import java.util.*;

public class kdiff {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int slow = 0;
        int fast = 0;

        while (slow < n && fast < n) {
            if (slow == fast || nums[fast] - nums[slow] < k)
                fast++;
            else if (nums[fast] - nums[slow] > k)
                slow++;
            else {
                count++;
                slow++;
                fast++;

                while (fast < n && nums[fast] == nums[fast - 1])
                    fast++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        kdiff obj = new kdiff();
        int num[] = { 3, 1, 4, 1, 5 };
        int k = 2;

        System.out.println(obj.findPairs(num, k));
    }
}
