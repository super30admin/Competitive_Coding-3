// Time Complexity : O(N)
// Space Complexity : O(N), extra hashmap used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// Since we need unique pair, we dont want any value to be considered multiple times, causing duplicate pairs.
// Need to handle edge case if k=0, then that occurs 2 or more times should be considered a pair.
// We will keep a frequency map, go over each key, try to find if there exists key-K value in the map, if yes, increase
// the result count.
import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

    public int findPairs(int[] nums, int k) {
        // Frequency map makes sure a value is not part of multiple pairs
        Map<Integer, Integer> temp = new HashMap<>();
        int count = 0;
        for(int num: nums){
            if(temp.containsKey(num)){
                temp.put(num, temp.get(num)+1);
            }else {
                temp.put(num, 1);
            }
           // temp.merge(num, 1, Integer::sum);
        }

        for(int key: temp.keySet()){
            if(k==0){
                // If no difference, then the same value can create a pair if it has occurred 2 or more times.
                if(temp.get(key) > 1){
                    count++;
                }
            }else if(temp.containsKey(key-k)){
                count++;
            }
        }

        return count;
    }
}
