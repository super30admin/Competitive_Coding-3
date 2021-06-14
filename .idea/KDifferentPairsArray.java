import java.util.Arrays;

public class KDifferentPairsArray {
    public static int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        int count =0;
        int slow =0;
        int fast =0;
        Arrays.sort(nums);
        while(slow<nums.length && fast<nums.length)
        {
            if(slow==fast || nums[fast] - nums[slow] < k)
                fast++;
            else if((nums[fast] - nums[slow]) == k)
            {
                count++;
                slow++;
                fast++;
                while(fast < nums.length && nums[fast] == nums[fast-1])
                    fast++;
            }
            else
                slow++;
        }
        return count;
    }
    public static void main(String args[])
    {
        int nums[] = {3,1,4,1,5};
        int k=2;
        System.out.println(findPairs(nums,k));
    }
}

// Time complexity is nlogn
//space complexity is O(1)