// URL - https://leetcode.com/problems/k-diff-pairs-in-an-array/

// TC - O(n)
// SC - O(n)

import java.util.*;

class PairsWithKDifference {
    public static int findPairs(int[] nums, int k) {
        if (k<0) return 0;
        HashMap<Integer,Integer> elements = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            elements.put(nums[i],i);
        }
        HashSet<List<Integer>> result = new HashSet<>();
        for (int j=0;j <nums.length; j++){
            Integer complement1 = nums[j]-k;
            Integer complement2 = nums[j]+k;
            if(elements.containsKey(complement1)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[j]);
                temp.add(complement1);
                Collections.sort(temp);
                if(!result.contains(temp) && elements.get(complement1)!=j){
                    result.add(temp);
                }
            }
            if(elements.containsKey(complement2)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[j]);
                temp.add(complement2);
                Collections.sort(temp);
                if(!result.contains(temp) && elements.get(complement2)!=j){
                    result.add(temp);
                }
            }
        }
        return result.size();
    }

    public static void main(String[] args){
        int[] inputArr = new int[]{3,1,4,1,5};
        int k=2;
        System.out.println( "Input : " + Arrays.toString(inputArr) + " , k : " + k );
        System.out.println( "Output : " + findPairs(inputArr,k));
    }
}