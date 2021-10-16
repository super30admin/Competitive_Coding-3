import java.util.HashMap;
import java.util.Map;

//Time Complexity - O(N)
// Space Complexity - O(N)

public class Problem1 {

    public static int findPairs(int[] nums, int k) {
        if(nums == null || nums.length <= 1) return -1;

        HashMap<Integer, Integer> occurence = new HashMap<>();

        for (int num : nums)
            occurence.put(num, occurence.getOrDefault(num, 0) + 1);

        int pairs = 0;
        for(Map.Entry<Integer, Integer> entrySet : occurence.entrySet()){
            if(k == 0 && entrySet.getValue() > 1) ++pairs;
            else if(k > 0 && occurence.containsKey(k + entrySet.getKey())) ++pairs;
        }

        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{1,2,4,4,3,3,0,9,2,3}, 3));
    }

}
