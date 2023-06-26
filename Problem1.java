// Time Complexity : O(n)
// Space Complexity : O(n)
    // n is the length of the given array.

// Your code here along with comments explaining your approach
    //We 2 sets, one for keeping the numbers in the array while we traverse the array. Another set is for storing different pairs, to avoid duplicate pairs.
    //While iterating over the array, we look for "number-k" and "number+k" in the set, we they are present, we have pairs. We make lists of {number-k, number} and {number, number+k} and add them to the set.
    //If there are duplicate pairs, they get discarded when they are added into the set. After the traversal, we have our answer as the size of the set of pairs.
    
class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Set<List<Integer>> distinctPairs = new HashSet<>();
        for (int x : nums)
        {
            if (set.contains(x-k))
            {
                List<Integer> pair = new ArrayList<>();
                pair.add(x-k);
                pair.add(x);
                distinctPairs.add(pair);
            }
            if (set.contains(x+k))
            {
                List<Integer> pair = new ArrayList<>();
                pair.add(x);
                pair.add(x+k);
                distinctPairs.add(pair);
            }
            set.add(x);
        }
        return distinctPairs.size();
    }
}