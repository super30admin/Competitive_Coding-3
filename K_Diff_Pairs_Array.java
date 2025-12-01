// Time Complexity : O(N) + O(N) = O(2N) = O(N) -> O(N) iterations to fill the map and O(N) to iterate through the map keys
// Space Complexity : O(N) -> To store 'N' elements in a map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        // Base condition
        if(nums == null ||nums.length == 0 || k < 0){
            return 0;
        }

        // 1. Initialize the counter to keep track of unique pairs
        int pairs = 0;

        // 2. Create a HashMap to store frequenxy of each element in an array
        HashMap<Integer, Integer> counter = new HashMap<>();

        // 3. 1st pass: Traverse array and fill the Map
        for(int n : nums){
            counter.put(n, counter.getOrDefault(n, 0) + 1); // key: value, value = prev value count(0 or n) + 1 
        }

        // 4. 2nd pass: Iterate over key-value pairs in the map using entrySet()
        for(Map.Entry<Integer, Integer> entry: counter.entrySet()){
            int numKey = entry.getKey(); // Get the key
            int val = entry.getValue(); // Get the value
            // If pair has distinct numbers and compliment of numKey is presen tin HashMap, increment pairs count. (numKey + k) to find compliment helps avoiding duplicate pairs ((1,4) and (4,1))
            if(k > 0 && counter.containsKey(numKey + k)){
                pairs++;
            // If pair has same number i.e k=0 then their is more than one occurence of that number(val > 1)
            }else if(k == 0 && val > 1){
                pairs++;
            }
        }
        return pairs;     
    }
}