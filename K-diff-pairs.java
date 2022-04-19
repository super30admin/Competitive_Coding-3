//time-O(n)
//space-O(n)
//(Mock interview 3)Problem link : https://leetcode.com/problems/k-diff-pairs-in-an-array/
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        if(k>0){
            for(int n : nums){
                int comp = n-k;
                if(map.containsKey(comp)){
                    map.remove(comp);
                    count++;
                }
            }
        }
        else{
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > 1) count++;
            }
        }

        return count;
    }
}