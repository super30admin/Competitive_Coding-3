package CompetitiveCoding3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class question44_kDifferentPairsInArray {

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        if(k == 0) {
            for(int i = 0 ; i < nums.length ; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                if(entry.getValue() > 1) count++;
            }
            return count;
        }

        HashSet<Integer> set = new HashSet<>();
        // to remove the duplicates
        for(int i = 0 ; i < nums.length ; i++) {
            set.add(nums[i]);
        }

        // access the hash set to check for the compliments
        for(int s: set) {
            int temp = s - k;
            if(set.contains(temp))  count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
