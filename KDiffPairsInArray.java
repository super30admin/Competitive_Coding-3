class KDiffPairsInArray {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int findPairs(int[] nums, int k) {
        // Edge Case Checking
        if(nums == null || nums.length == 0 || k < 0)
            return 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // Creating a frequency map
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        
        for(int i : map.keySet()){
            // Edge Case - when k = 0 we need the element to be present two or more times to form a pair
            if(k == 0){
                if(map.get(i) >= 2)
                    result++;
            }else{
                // If the map contains the (num + k) value then we increment the result count
                if(map.containsKey(i + k))
                    result++;
            }
        }
        return result;
    }
}