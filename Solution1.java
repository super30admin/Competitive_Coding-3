// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N


// Your code here along with comments explaining your approach
-> add numbers to hashmap, find difference & update count

class Solution {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int count = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int diff = num - k;

            if(map.containsKey(diff)){
                if(k==0 && map.get(diff)>1)
                    count++;
                else if(k!=0)
                    count++;
            }
        }

        return count;
    }
}