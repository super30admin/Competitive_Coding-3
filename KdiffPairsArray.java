import java.util.Arrays;
// Solution: Two Pointers
// Time Complexity: O(n log n)
// Space Complexity: O(1)
public class KdiffPairsArray {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 1;
        int cnt = 0;
        Arrays.sort(nums);

        while(l < r && r < n) {

            if(l < r &&  r < n && nums[r] - nums[l] > k) {
                l++;
            } else if (l < r &&  r < n && nums[r] - nums[l] < k) {
                r++;
            } else if(l < r &&  r < n && nums[r] - nums[l] == k) {
                l++;
                r++;
                cnt++;
                while(l < n && nums[l]== nums[l-1]){
                    l++;
                }
                while(r < n && nums[r] == nums[r-1]){
                    r++;
                }
            }
            if(l==r){
                r++;
            }

        }

        return cnt++;

    }
}


import java.util.*;

// Solution: Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;

        HashMap<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            elements.put(nums[i], i);
        }

        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complement1 = nums[i] - k;
            Integer complement2 = nums[i] + k;

            if (elements.containsKey(complement1)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complement1);
                Collections.sort(temp);

                if (!result.contains(temp) && elements.get(complement1) != i) {
                    result.add(temp);
                }
            }

            if (elements.containsKey(complement2)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complement2);
                Collections.sort(temp);

                if (!result.contains(temp) && elements.get(complement2) != i) {
                    result.add(temp);
                }
            }
        }

        return result.size();
    }
}

