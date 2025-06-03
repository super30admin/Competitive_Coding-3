import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class FindPairs {
    /*
    Approach :
    We iterate through the input array and check if we find element + k ,element -k. at the end of each iteration we add element in hashset.
    Since we so not want to count duplicate pairs we keep a hashset result and add the sorted pairs to it.
    We just return the size of the result hashset as output.
    TC: O(n)
    SC: O(n)
    */
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i] + k)) {
                List<Integer> pair = buildSortedPair(nums[i],nums[i] + k);
                result.add(pair);
            }
            if (set.contains(nums[i] - k)) {
                List<Integer> pair = buildSortedPair(nums[i],nums[i] - k);
                result.add(pair);
            }
            set.add(nums[i]);
        }
        return result.size();
    }

    List<Integer> buildSortedPair(int num1, int num2) {
        List<Integer> pair = new ArrayList<>();
        if (num1 > num2) {
            pair.add(num2);
            pair.add(num1);
        } else {
            pair.add(num1);
            pair.add(num2);
        }
        return pair;
    }
}