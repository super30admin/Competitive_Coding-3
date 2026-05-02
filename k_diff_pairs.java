class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int compl =0;
        HashSet<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            compl = nums[i]-k;
            if(map.containsKey(compl)&& map.get(compl)!=i){
                Integer[] temp = {nums[i],compl};
                Arrays.sort(temp);
                res.add(Arrays.asList(temp));
            }
            compl = nums[i]+k;
            if(map.containsKey(compl)&& map.get(compl)!=i){
                Integer[] temp = {nums[i],compl};
                Arrays.sort(temp);
                res.add(Arrays.asList(temp));
            }
        }
        return res.size();

    }
}