//Approach - HashMap
//Time Complexity - O(N) - one pass through the elemnts of nums in both for loops
//Space Complexity - O(N) -N - size of the hashmap to store the elements of nums and its duplicate counts


//The HashMap dict is populated with nums values as key and its duplicate counts as value
// In the second for loop
//      if the diff k == 0 then the duplicates count map value > 1 will be counted for result
//      else if k > 0 then the map (key + k) is checked if present in map keys list, if yes then the result will be incremented.

class Solution {
  public int findPairs(int[] nums, int k) {

    int result = 0;
    Map<Integer, Integer> dict = new HashMap<>();

    for(int i=0; i<nums.length; i++){
      dict.put(nums[i], dict.getOrDefault(nums[i],0)+1);
    }

    //System.out.println("dict: "+dict);

    for(Map.Entry<Integer, Integer> element: dict.entrySet()){
      if(k == 0){
        if(element.getValue() > 1){
          result++;
        }
      }else if(dict.containsKey(element.getKey()+k)){
        result++;
      }
    }

    return result;
  }
}