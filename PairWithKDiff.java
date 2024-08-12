//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.Arrays;

public class PairWithKDiff {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int high=1;
        int n = nums.length-1;
        int count = 0;

        while(low<high && low <=n && high <= n){
            if(nums[high]-nums[low]==k){
                count++;
                low++;
                high++;
                while(low<n && nums[low]==nums[low-1]){
                    low++;
                }
                while(high<n && nums[high]==nums[high-1]){
                    high++;
                }

            }
            else if(nums[high]-nums[low]>k){
                low++;
            }
            else{
                high++;
            }
            if(low == high){
                high++;
            }
        }

        return count;

    }
}
