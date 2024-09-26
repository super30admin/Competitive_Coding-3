// Time Complexity : O(n) because iterating over all elements 
// Space Complexity : O(n) because auxilary data structure used HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        //null case 
        if( nums.length == 0 || nums == null ) return 0;
        //declaring map for processing
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for( int i : nums ) { //iterating over nums
            map.put( i, map.getOrDefault(i, 0) + 1 ); //putting elements inside map
        } //will put frequency in front of the element
    
        //running over each map entry from map.entrySet
        for( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
            if( k == 0 ) {
                //elements that occured more than 2 times
                if( entry.getValue() >= 2 ) {
                    count++;
                }
            }
            else {
                if( map.containsKey(entry.getKey() + k )) {
                    //to find the pair to currrent entry
                    count++;
                }
            }
            
            
        }
        return count;
    }
    
}