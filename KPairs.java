//Time complexity - O(N)
//Space complexity - O(N)


class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;

        // hashmap initialize counter to put numbers with their respective no of count times
        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }


        // iterate over the hasmap
        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();

            //if the complement pair is in the hashmap increment result
            if (k > 0 && counter.containsKey(x + k)) {
                result++;
            }
            // if k is 0 and value is more then 1 only return 1 pair
            else if (k == 0 && val > 1) {
                result++;
            }
        }
        return result;
    }
}