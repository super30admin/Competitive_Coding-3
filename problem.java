public class problem {
    public int c(int[] nums, int target){
        if(nums == null || nums.length ==0) return 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 0);
            }
        }
        for(int i=0;i<nums.length;i++){
            int a = nums[i] - target;
            if(map.containsKey(a) && map.get(a) < 2){
                res++;
            }
        }
        return res;
    }
}

//time complexity O(n)
//space complexity O(n)