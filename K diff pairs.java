// Time Complexity : O(nlog) time for sorting is more
// Space Complexity : O(1);

import java.util.*;
class Kdifference {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0, end=0;
        int count = 0;
//         for(int i=0;i<nums.length;i++){

//         }
        while(start!=nums.length-1 && end<nums.length){
            //System.out.println(start);
            //System.out.println(end);
            if(start==end){
                end++;
            }
            else if(start<end){
                int diff = nums[end]-nums[start];
                if(diff==k){
                    count++;
                    start++;
                    end++;
                    while(end<nums.length && nums[end]==nums[end-1]){
                        end++;
                    }

                }
                else if(diff<k){
                    end++;
                }
                else{
                    start++;
                }
            }
        }
        return count;
    }

    public static void main(String [] args){
        int [] nums = new int[]{3,1,4,1,5};
        Kdifference k = new Kdifference();
        System.out.println(k.findPairs(nums, 2));
    }
}