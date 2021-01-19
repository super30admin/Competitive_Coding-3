class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Pair<Integer, Integer>> pairs = new HashSet<>();
        
        if(k < 0)
            return 0;
        
        for(int num: nums){
            if(set.contains(num+k)){
                Pair<Integer, Integer> pair = new Pair<>(Math.min(num, num+k), Math.max(num, num+k));
                pairs.add(pair);
            }
            if(set.contains(num-k)){
                Pair<Integer, Integer> pair = new Pair<>(Math.min(num, num-k), Math.max(num, num-k));
                pairs.add(pair);
            }
            set.add(num);
        }
        
        return pairs.size();
        
    }
}