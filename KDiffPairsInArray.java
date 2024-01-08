class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> mapSol = new HashMap();
        HashSet<List<Integer>> set = new HashSet();
        int n = nums.length;
        int cnt = 0;
        for(int i=0; i<n;i++){
            int nums1 = nums[i] - k;
            int nums2 = nums[i] + k;
            if(mapSol.containsKey(nums1) && i != mapSol.get(nums1)) {
                if(nums1>nums[i]){
                    set.add(Arrays.asList(nums[i],nums1));
                } else {
                    set.add(Arrays.asList(nums1, nums[i]));
                }
            }
            if(mapSol.containsKey(nums2) && i != mapSol.get(nums2)) {
                if(nums2>nums[i]){
                    set.add(Arrays.asList(nums[i],nums2));
                } else {
                    set.add(Arrays.asList(nums2, nums[i]));
                }
            }
            mapSol.put(nums[i],i);
        }
        return set.size();
    }
}
