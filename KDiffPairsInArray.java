import java.util.HashMap;

public class S30_M_532_KDiffPairsInArray {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 0;
        findPairs(nums, k);
    }

    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();  // S.C - O(N)

        for(int i=0; i<nums.length; i++){  // T.C - O(N)
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        int count = 0;
        for(int n: map.keySet()){
            int rem = n + k;
            if(k==0 && map.get(rem)>1 || k>0 && map.containsKey(rem))
                count++;
        }

        return count;
    }
}

