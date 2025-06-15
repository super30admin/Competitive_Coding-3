/*
 * Time Complexity: O(2*n) => O(n)
 * Space Complexity: O(2*n) => O(n)
 */

class PairsWithKDifference {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
                myMap.put(nums[i], i);
        }
        Set<List<Integer>> mySet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(myMap.containsKey(nums[i]+k) && myMap.get(nums[i]+k) != i){
                mySet.add(Arrays.asList(nums[i], k+nums[i]));
            }
            if(myMap.containsKey(nums[i] - k) && myMap.get(nums[i]-k) != i){
                mySet.add(Arrays.asList(nums[i]-k, nums[i]));
            }
        }
        return mySet.size();
    }
}