time complexity: O(n)
space complexity: O(n)

class Solution {
  public int findPairs(int[] nums, int k) {
  Map<Integer, Integer> map = new HashMap<>(); // creating a hash map 
  for (int i =0; i<nums.length; i++) //iterating through the array and storing all the counts
  {
      if (map.containsKey(nums[i])){
          map.put(nums[i], map.get(nums[i])+1);
      }
      else
      map.put(nums[i],1);
    }
  int numPair = 0;
  for (int val : map.keySet()) {
    // two cases: if k == 0, then we have take into account of the counts that more than or equal to 2
    int count = map.get(val);
    if (k == 0) {
      if (count >= 2)
      ++numPair; //for handling duplicates
    } else { // k != 0
      if (map.containsKey(val + k))
      ++numPair;
    }
  }
  return numPair;
    }
}