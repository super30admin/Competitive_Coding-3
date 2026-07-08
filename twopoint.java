// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : no. ran it on programiz.com and it worked fine.
// Any problem you faced while coding this : the iteration was a bit tricky to come up with the approach of using two pointers to remove duplicates from the sorted array. 

// Your code here along with comments explaining your approach: use two pointers, one for iterating through the array and another for keeping track of the position of the next unique element. We start with the second pointer at index 2, and for each element in the array, we check if it is different from the element at the position of the first pointer minus 2. If it is different, we copy that element to the position of the first pointer and increment both pointers. This way, we can remove duplicates in place without using extra space.
import java.util.Arrays;
class Main {
    public static int removedups(int[]nums){
        if(nums==null) return 0;
        if(nums.length<=2) return nums.length;
        int i=2;
        for(int j=2;j<nums.length;j++)
        {
            if(nums[j]!=nums[i-2])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int [] nums={1,1,1,2,2,3};
        int len= removedups(nums);
        System.out.println("length="+len);
    }
}