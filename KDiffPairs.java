import java.util.*;
class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //3,1,4,1,5
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2)
                    count++;
            } else {
                if (map.containsKey(entry.getKey() + k))
                    count++;
            }
        }
        return count;
    }
    public static  void main(String[] args){
        KDiffPairs j = new KDiffPairs();
        int k =2;
        int [] nums = {3,1,4,1,5,7,9,11};
        System.out.print(j.findPairs(nums,k));

    }
}