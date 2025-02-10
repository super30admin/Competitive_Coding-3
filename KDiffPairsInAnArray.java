class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry <Integer,Integer> e: m.entrySet()) {
           int key = e.getKey();
            int v = e.getValue();
            //y+k=x
            if (k > 0 && m.containsKey(key + k)) {
                res++;
            //if it has all same elements
            } else if (k == 0 && v > 1) {
                res++;
            }


        }
        return res;
    }
}
//Time Complexity: O(n), where n is the length of the input array nums.
//Space Complexity: O(n), for the HashMap storing the frequencies of the elements in nums.