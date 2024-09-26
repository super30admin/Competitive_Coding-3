public class KpairsArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        
        for(int i=0; i<nums.length; i++){
            if(k==0){
                if(!hm.containsKey(nums[i])){
                    hm.put(nums[i], 1);
                }
                else{
                    int val = hm.get(nums[i]);
                    if(val == 1){
                        ans++;
                    }
                    hm.put(nums[i], val+1);
                }
                continue;
            }
            if(!hm.containsKey(nums[i])){
                int dif = nums[i]+k;
                if(hm.containsKey(dif)){
                    ans++;
                }
                dif = nums[i] - k;
                if(hm.containsKey(dif)){
                    ans++;
                }
                hm.put(nums[i], 0);
            }
        }
        return ans;
    }
}
