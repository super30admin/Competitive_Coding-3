// brute force   
public class FindPairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int n = nums.length;
        if(nums==null || n<0) return 0;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                if(Math.abs(nums[j]-nums[i])==k){
                    result++;
                }
            }
        }
        return result;
    }
}

// TC - O(n2)
// SC - O(n)

public class FindPairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(k>0 && map.containsKey(key+k)){
                result++;
            }
            if(k==0&&map.get(key)>1){
                 result++;
            }
        }
        return result;
    }
}

// TC - O(n)
// SC - O(n)