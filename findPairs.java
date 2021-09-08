// Time Complexity: O(n) Iterated through array once to put in map. Worst case if all elements are unique, iterated through map to get count of pairs.
// Space Complexity: O(n) Used an auxilliary HashMap of max size upto length of array
// Did you complete it on leet code: Yes
// Any problems faced: initially didnt considered edge case of k=0

// Write your approach here
// Idea here is to first make the elements unique as we should not return 2 pairs of same elements, to do that we have used map
// as edge case would define that if we have k=0 and two ones, that would count as a pair
// now ones we have put all the items in map, we can iterate through map
// if difference is 0 then we need to check if element has count more than 2 then, it is a pair
// otherwise we can check if difference of target and element exists in map and increase count along with putting the element in map
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int key: map.keySet()) {
            if(k==0) {
                if(map.get(key)>=2) {
                    count++;
                } 
            }
            else {
                if(map.containsKey(key-k)) {
                    count++;
                }
            }
        }
        return count;
    }
}