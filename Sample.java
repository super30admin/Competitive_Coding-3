import java.util.*;
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Sample {
    public List<List<Integer>> generate(int numRows) {
        //o(n) time and o(1) space
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> temp = new ArrayList<>();
            if(i == 1){
                temp.add(1);
                res.add(temp);
            } else if( i == 2){
                temp.add(1);
                temp.add(1);
                res.add(temp);
            } else {
                List<Integer> prevList = res.get(i-2);
                temp.add(1);
                for(int j = 1; j <= prevList.size()-1; j++){
                    int toAdd = prevList.get(j) + prevList.get(j-1);
                    temp.add(toAdd);
                }
                temp.add(1);
                res.add(temp);
            }
        }
        return res;
        
    }
}

class Solution {
    public int findPairs(int[] nums, int k) {
        //o(n) logn and o(1)space
        Arrays.sort(nums);
        int count = 0;
        int low = 0; int high = 0; int n = nums.length;
        while(low < n && high < n){
             if (low == high || nums[high] - nums[low] < k){
                high++;
            } else if (nums[high] - nums[low] > k){
                low++;
            } else {
                count++;
                low++;
                high++;
                while(high < n && nums[high] == nums[high- 1]) high++;
            
             }
            
        }
        return count;
        
        
    }
    public int findPairs2(int[] nums, int k) {
        //o(n) time nd o(n)space
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);   
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(k > 0 && map.containsKey(key+ k)){
                count++;
            } else if(k == 0 && val > 1){
                count++;
            }
        }
        return count;
        
        
    }

}