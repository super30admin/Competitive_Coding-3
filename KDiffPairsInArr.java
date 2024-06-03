import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 *Using Hashmap
 1. Iterate over the array and store the element as key and its frequency as value
 2. Iterate over the keyset and check if (key-k) is present in hashmap, if it is present increment the count
 3. Special handling when k==0, then check if the freqCount>=2, then increment the count
 4. TC - O(n), SC- O(n)
 */
class KDiffPairsInArr {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;

        int count = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        for(int key : hm.keySet()) {
            if(k == 0) {
                if(hm.get(key) >= 2)
                    count++;
            }

            else {
                if(hm.containsKey(key - k))
                    count++;
            }

        }

        return count;

    }
}

/***
 *Using 2 pointers approach
 1. Sort the array and keep 2 point - left=0, right=1
 2. Compare element at left and right, if the difference=k, increment the count and left pointer, keep incrementing the left pointer till element at left and left-1 are equal, This is to avoid duplicate pairs
 3. If the difference >k, reduce the range, increment left pointer and keep incrementing it till element at left and left-1 are equal
 4. If the difference <k, increase the range, increment right pointer. Also, check if left==right, then keep incrementing right pointer
 5. TC - O(nlogn), SC- O(1)
 */
class KDiffPairsInArr1 {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;

        int count = 0;

        int left = 0;
        int right = 1;

        Arrays.sort(nums);

        while(left < nums.length && right < nums.length) {

            if(left == right || nums[right] - nums[left] < k) {
                right++;
            }

            else if(nums[right] - nums[left] > k) {
                left++;
                while(left < nums.length && nums[left] == nums[left-1])
                    left++;
            }

            else {
                count++;
                left++;
                while(left < nums.length && nums[left] == nums[left-1])
                    left++;
            }

        }

        return count;

    }
}