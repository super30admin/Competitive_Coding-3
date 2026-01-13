//Problem 2: K-diff Pairs in an Array
/*
    Approach:
    The goal is to find the number of unique pairs (nums[i], nums[j]) such that |nums[i] - nums[j]| = k.
    - We use a HashMap to store each number from the input array as a key and its last seen index as the value.
    - To handle unique pairs, we use a HashSet of Lists. Each pair is added to the set in a consistent order (e.g., smaller element first) to avoid duplicates.
    - For each element `nums[i]`, we check if `nums[i] - k` or `nums[i] + k` exists in the map.
    - If a target exists and its index is not the current index `i`, we found a pair.
    - Finally, the size of the HashSet gives the count of unique k-diff pairs.

    Time Complexity: O(n)
    - We iterate through the array once to populate the HashMap: O(n).
    - We iterate through the array again to check for potential pairs: O(n).
    - Map and Set operations (put, get, add) are O(1) on average.

    Space Complexity: O(n)
    - The HashMap stores up to `n` elements: O(n).
    - In the worst case, the HashSet could also store O(n) unique pairs.
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k< 0) return -1;

        // used hashmap because hashset was not suitable for this problem as it does not allow duplicate keys, which fails in scenario when k = 0
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        //put everything in map
        for (int i = 0; i < n; i++){
            map.put(nums[i], i);
        }
        HashSet<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < n ; i++ ){
            int element1 = nums[i] - k;
            int element2 = nums[i] + k;
            // adding smaller number to list first makes sure that no duplicate pairs are put in the set in reverse order and no need to sort the pairs
            if(map.containsKey(element1) && map.get(element1)!=i){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(element1);
                tempList.add(nums[i]);
                result.add(tempList);
            }
            if(map.containsKey(element2) && map.get(element2)!=i){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(nums[i]);
                tempList.add(element2);
                result.add(tempList);
            }
        }
        return result.size();
    }
}