//The approach here is to put all the numbers as keys along with it's frequency in a hashmap
//Now, we iterate through keys and if for any key, there is any other key exists with difference of both k, then we increase the count of unique pairs.
//If k is 0, then we see if it occured more than once, if it did, then we increase the count of the unique pairs
//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int x:map.keySet()){
            if(k>0 && map.containsKey(x+k) || k==0 && map.get(x) > 1){
                count++;
            }
        }
        return count;
    }
}
