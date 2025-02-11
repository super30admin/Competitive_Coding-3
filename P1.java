//Question - Pairs with K difference

// Time Complexity : O(nlogn) because of sorting 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);  //sort the array
        int i = 0;  //first ptr
        int j = 1;  //2nd ptr
        int n = nums.length;
        int sum = Integer.MIN_VALUE;    //initialise sum 
        int count = 0;     //initialise counter

        while (j < n && i < n - 1) {    
            if (nums[j] - nums[i] == k && (nums[i] + nums[j]) != sum) { // to find the target and to check for duplicate values
                sum = nums[i] + nums[j];    // sum calc
                i ++; j ++; count ++;
            } else if ((nums[j] - nums[i]) < k) {   // if the value is less than target move j 
                j ++;
            } else {    //else move i 
                i ++;
            }
            if (i == j) j ++;   //if the same element move j 
        }
        return count;
    }
}

// Time Complexity :    O(n)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution2 {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int m : map.keySet()) {
            if (k == 0 && map.get(m) > 1) {
                cnt ++;
            } else if (k > 0 && map.containsKey(m + k)) {
                cnt ++;
            }
        }
        return cnt;
    }
}