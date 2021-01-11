class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0) return 0;
        //k==0
        //Arrays.sort(nums);

        HashMap<Integer,Integer> hmap = new HashMap<>();
        //[3,1,4,1,5], k = 2
        int kPairs = 0;
        //[1,1,3,4,5]

        for (int i : nums) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    kPairs += 1;
                }
            } else {
                if (hmap.containsKey(entry.getKey() + k)) {
                    kPairs += 1;
                }
            }
        }
        return kPairs;
    }
}