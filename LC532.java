// Time Complexity : O(n)
// Space Complexity : O(n)

import java.util.HashMap;

public class LC532 {
    public int findPairs(int[] nums, int k) {
        if(nums.length==1) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            int tar1 = nums[i]-k;
            int tar2 = nums[i]+k;
            if(!map.containsKey(nums[i])) continue;
            if(k==0){
                if(map.getOrDefault(tar1,0)>1){
                    ans++;
                }
            } else {
                if(map.containsKey(tar1)){
                    ans++;
                }
                if(map.containsKey(tar2)){
                    ans++;
                }
            }
            map.remove(nums[i]);
        }
        return ans;
    }
}
