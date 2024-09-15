// Time Complexity : O(nlongn) for two pointers, O(n) with HashMap
// Space Complexity : O(n) for hashmap, O(1) for two pointers
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//In two pointers method, the array is first sorted, then took 2 pointers which started at 0
//to eliminate duplicates, skip the index while checking if value at i and i+1 is same
//if the difference between two pointers is less than target, then r++
//else if difference is greater than target, then l++
//increment count if the diff is equal to target.

//In hashmap method, build a map with array elements and their indexes
//if k=0, increment the count whenever the value of key is >=2
//else count whenever if yu find key with value target-element
//return count

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class KdiffPairs{
    public static void main(String[] args){
        System.out.println(Kdiff(new int[]{3,1,4,1,5,2},1));
    }

    public static int Kdiff(int[] nums, int k){
	//two pointers
       /* Arrays.sort(nums);
        int l=0,r=0,count=0;
        while(l<nums.length &&r<nums.length){
            while(l<nums.length-1 && nums[l]==nums[l+1]){
                l++;
            }
            if(nums[r]-nums[l]==k){
                count++;
                l++;
                r++;
            }
            else if(nums[r]-nums[l]<k){
                r++;
            }
            else{
                l++;
            }
        }
        return count;*/

        Map<Integer,Integer> res=new HashMap<>();
        if(k<0) return 0;
        for(int i=0;i<nums.length;i++){
            
                res.put(nums[i],res.getOrDefault(nums[i],0)+1);

            }
            int count=0;
            if(k==0){
                for(Integer i:res.keySet()){
                    if(res.get(i)>=2) count++;
                }
            }
            else{
                for(Integer j:res.keySet()){
                    if(res.containsKey(j-k)){
                        count++;
                    }
                }
            }
            return count;
        }
    }
