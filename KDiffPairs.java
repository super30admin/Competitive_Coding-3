import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// add all numbers to hmap and their frequency. Iterate over all keys in hmap to check if complement of key is present
// and increment the count if complement is found

public class KDiffPairs {
        public int findPairs(int[] nums, int k) {
            if(nums == null || nums.length ==0 || k<0 ){
                return 0;
            }
            HashMap<Integer, Integer> hmap = new HashMap<>();
            int count =0;

            for(int i :nums){
                hmap.put(i,hmap.getOrDefault(i,0)+1);
            }

            for(int key : hmap.keySet()){
                System.out.println("key "+key);
                if(k == 0){
                    if(hmap.get(key) > 1){
                        count++;
                    }
                }else{
                    if(hmap.containsKey(key+k)){
                        count++;
                    }
                }

            }
            return count;
        }
}
