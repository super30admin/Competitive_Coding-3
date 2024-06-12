// https://leetcode.com/problems/k-diff-pairs-in-an-array/
import java.util.Arrays;
import java.util.HashSet;

// Time Complexity :O(nˆ2)
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes
//
// Your code here along with comments explaining your approach
public class KDiffPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.print(kDiffPairs2(nums,k));
    }
    // Time Complexity :O(nˆ2)
    // Space Complexity :1
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Yes
    //
    // Your code here along with comments explaining your approach
    //  BRUTE FORCE METHOD
    // 1. Sort the array.
    // 2. For each element from index 0 , find difference between next element and current element . If its equal to k
    //  increase count and change current element index .If its > 2 then break loop and change current element index to next element.If its < 2 then continue
    // 3. If current element is equal to previous element then move on to next element.
    private static int kDiffPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j = i+1;j<nums.length;j++){
                int sum = nums[j]-nums[i];
                if(sum==k ){
                    count++;
                    break;
                }
                else if(sum>k){
                    break;
                }
            }
        }
        return count;
    }
    // Time Complexity :O(n)
    // Space Complexity :O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    //
    // Your code here along with comments explaining your approach
    //  Using two hashsets
    // 1. For each element chek if(element+k) and (element-k) are present and increase count.
    //  let element be x then x-y = k or y-x = k ,so y = k+x || y = x-k
    // 2.if an element occurs twice and k == 0 then add the element to second set and increment count.
    // 3.if an element occurs multiple times and k!=0 then add element only once.
    private static int kDiffPairs2(int[] nums,int k){
        if(nums.length==0 || k<0) return 0;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dupe = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.add(nums[i])){
                if(k == 0) continue;
                if(set.contains(nums[i]+k)) count++;
                if(set.contains(nums[i]-k)) count++;

            }
            if( k == 0 && dupe.add(nums[i]))
                count++;

        }
        return count;
    }
    // Time Complexity :O(n log n)
    // Space Complexity :O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    //
    // Your code here along with comments explaining your approach
    // 1. Have two pointers low and high starting from 0 .
    // 2 . check the difference b/w element at high pointer and at low pointer and if high and low are different. If difference equals k,then increase count
    //    and increment low and high pointers.To remove duplicates increment high till element at high not equals element at high-1.
    // 3. If difference less than k or low == high then increase high. else increase low pointer.
    private static int kDiffPairs3(int[] nums,int k){
        int count = 0,low =0,high =0;
        Arrays.sort(nums);
        int n = nums.length;
        while(low<n && high<n){
            if(high!=low && nums[high]-nums[low]==k){
                count++;
                low++;
                high++;
                while(high<n && nums[high]==nums[high-1]) high++;
            }
            else if(low==high || nums[high]-nums[low]<k){
                high++;
            }
            else
                low++;
        }
        return count;
    }
}
