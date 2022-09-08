// Time Complexity : O(n) is the length of input array nums
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Your code here along with comments explaining your approach

//Method 3 - HashMap Approach
//TC: O(n)  and SC: O(n)
class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        int result = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int x = entry.getKey();
            int val = entry.getValue();

            if(k > 0 && map.containsKey(x+k))
                result++;

            else if(k ==0 && val >1)
                result++;
        }
        return result;
    }
}


/*
//Method 2 - Two Pointers Approach
//TC: O(n) + O(n log n) ~= O(n log n) and SC: O(n)
class Solution {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int result = 0;

        while(left < nums.length && right <nums.length){
            if(left == right || nums[right] - nums[left] < k){
                right++;
            }
            else if(nums[right] - nums[left] > k){
                left++;
            }
            else{
                left++;
                result++;

                while(left < nums.length && nums[left] == nums[left-1])
                    left++;
            }
        }
        return result;
    }
}
*/

/* Method 1 - Brute Force Method
TC: O(n^2) + O(n log n) ~= O(n^2)
SC: O(n)
public class KDiffPairs {
        public int findPairs(int[] nums, int k) {

            Arrays.sort(nums);

            int result = 0;

            for(int i = 0 ; i < nums.length ; i++){
                if(i > 0 && nums[i] == nums[i-1])
                    continue;
                for(int j= i+1 ; j < nums.length ; j++){
                    if(j > i+1 && nums[j] == nums[j-1])
                        continue;
                    if(Math.abs(nums[j]- nums[i]) == k)
                        result++;
                }
            }
            return result;
        }
}

 */
