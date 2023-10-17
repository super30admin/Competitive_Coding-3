import java.util.HashMap;
import java.util.Map;

//TC will be O(N)
//SC will be O(N)
class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        if (k < 0) {
            return 0; // If k is negative, there can be no valid pairs.
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        int uniquePairs = 0;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (k == 0) {
                if (countMap.get(num) >= 2) {
                    uniquePairs++;
                }
            } else {
                if (countMap.containsKey(num + k)) {
                    uniquePairs++;
                }
            }
        }

        return uniquePairs;
    }

    public static void main(String[] args){
        KDiffPairs obj = new KDiffPairs();
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(obj.findPairs(nums,k));
    }
}
