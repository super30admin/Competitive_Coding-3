// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<Integer>> generate(int numRows) {
      if(numRows == 0) {
          return new ArrayList();
      }
        
        List<List<Integer>> result = new ArrayList();
        
        result.add(new ArrayList());
        result.get(0).add(1);
        
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList();
            List<Integer> prev = result.get(i-1);
            list.add(1);
            for(int j = 1; j < i; j++) {
                list.add(prev.get(j-1) + prev.get(j));
            }
            list.add(1);
            result.add(list);
        }
        return result;

    }
}

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        
       if(k < 0) {
           return 0;
       }
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap();
        
        for(Integer i : nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        
        for(Integer i:map.keySet()) {
            if(k == 0) {
                if(map.get(i) > 1) {
                    count++;
                }
            } else {
                if(map.containsKey(i + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
