// Time Complexity : O(n ^ 2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didnt face any problem while coding this


// Your code here along with comments explaining your approach

// https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==i || j==0){
                    list.add(1);
                }else{
                    int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    list.add(sum);
                }
            }
            result.add(list);
        }
        return result;
    }
}
// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didnt face any problem while coding this

// https://leetcode.com/problems/k-diff-pairs-in-an-array/

import java.util.Arrays;

public class Solution {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0, right = 1;
        int result = 0;

        while (left < nums.length && right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;      
            } else if (nums[right] - nums[left] > k) {
                left++;       
            } else {
                left++;
                result++;
                while (left < nums.length && nums[left] == nums[left - 1])
                    left++;
            }
        }
        return result;
    }
}
