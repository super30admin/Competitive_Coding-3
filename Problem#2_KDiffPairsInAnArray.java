/* 
Time complexity: O(N) Traversing array once
Space complexity: O(N) Storing the array elements in hash map
*/
public class Solution {
    public int findPairs(int[] nums, int k) {
        //Inititalise values for map and return count
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //Store the given numbers in map for faster access
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1) ;  
        }
        //Now look for the difference element
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int counter = entry.getValue();
            if(map.containsKey(key-k) && k>0){
               count++; 
            }else if(k==0 && counter>1){
                count++;
            }
        }
        return count;

    }
}