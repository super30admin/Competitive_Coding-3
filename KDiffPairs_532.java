/*
Time complexity: O(N) where N is size of the array
Space complexity: O(N) auxilliary space for set in appoach-1 and for map in approach-2

*/

// ================================== Using 2 sets ======================================
/*
Algorithm:
=========
1. Iterate through array and add them to set. 
2. To handle duplicates, check if it is already present in set. If so, add it to second set. 
3. If an element has its n+k value in set, increment count of k-diff pairs. If not, continue.
4. So, if k == 0, return duplicates.size() and if not, return count variable
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0;
        Set<Integer> set = new HashSet<>();             //unique values
        Set<Integer> duplicates = new HashSet<>();      //keep track of duplicates for k = 0
        int pairs = 0;      //count of k-diff pairs
        
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {				// add to set if not present
                set.add(nums[i]); 
            }
            else {
                duplicates.add(nums[i]);				// if found, add to duplicates set
            }
        }
        
        for(int n: set) {
            if(set.contains(n+k)) pairs++;			   // count number of pairs
        }
        return k == 0? duplicates.size():pairs;        // return pairs/ duplicates.size() based on k value
    }
}

// ================================== Using map (2-pass) ======================================

/*
Algorithm:
=========
1. Use map to keep track of count of each element
2. If k == 0, if value > 2 , increment count
3. If k != 0, check if map has key+k in the map and increment if found
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        //edge
        if( k < 0) return 0;
        //logic
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;
        
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);        // add elements to map
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(k == 0) {
                if(entry.getValue() > 1) pairs++;    // if duplicates found and k == 0, increment count of pairs
            } 
            else {
                if(map.containsKey(entry.getKey()+k)) pairs++; // if value+k found in array, another pair found, increment count
            }
        }
        return pairs;
    }
}

// ========================================= Using map (1-pass) =========================

/*
Algorithm:
=========
1. Use map to keep track of count of each element
2. If k == 0, if value == 1 , increment count else ignore
3. If k != 0, check if map has key+k and key-k and increment if each one is found
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
        return 0;
        }
        int count=0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            
            if (map.containsKey(nums[i])){                     
                if(k==0 && map.get(nums[i])==1) {       // if k is 0 and number is already there, increment count    
                count++;
                map.put(nums[i],2);
                }
            } else {
                if (map.containsKey(nums[i] - k)) {     // check if nums[i] - k is found, if so increment
                     count++;
                 }
                if (map.containsKey(nums[i] + k)) {     // check if nums[i] + k is found, if so increment
                     count++;
                  }
                map.put(nums[i],1);             // add element to the map
            }

      }
      return count;
  }
}