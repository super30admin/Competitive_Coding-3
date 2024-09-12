// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//K different pair in an array 

class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
            for(int i : nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        
        
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(k==0 && entry.getValue() > 1)
                count++;
            
                else if(k > 0 && map.containsKey(entry.getKey() + k))
                count++;
        }
        return count;
        
    }
}

/*Time Complexity : O(n)
 * Space Comp : O(n) using a hashmap
 */

// PASCAL's TRIANGLE
//TC : O(n)
//SC : O(N)

class Solution {
    public List<List<Integer>> generate(int rowIndex) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(rowIndex == 0)
            return result;
        
        List<Integer> prev_list = new ArrayList<>();
        prev_list.add(1);
        result.add(prev_list);
        
        for(int i=1; i<rowIndex; i++){
            List<Integer> curr_list = new ArrayList<>();
            curr_list.add(1);
            for(int j=1; j<i;j++){
            curr_list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            curr_list.add(1);
            result.add(curr_list);
        }
        return result;
    }
}