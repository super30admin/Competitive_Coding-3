//TimeComplexity: O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
               map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
       int findcount=0;
        for(int i : map.keySet()) {
            if(map.containsKey(i-k) && k>0) {
                findcount++;
            } else if(map.get(i)>1 && k ==0) {
                findcount++;
            }
          
            }
            return findcount;
        }
}
        
    
