// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class Main {
    public static void main(String[] args) {
        
        int[] nums = new int[]{1, 3, 5, 8, 17};
        int l=0, h=nums.length-1;
        int LS=nums[l], RS=nums[h];
        while(l<h)
        {
           if(LS==RS){
               l++;
               h--;
           }
            else if(LS<RS){
                l++;
                LS=LS+nums[l];
            }
            else {
                h--;
                RS=RS+nums[h];
            }
        }
        if(LS==RS)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}