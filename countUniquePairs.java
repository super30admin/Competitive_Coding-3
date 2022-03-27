// Time Complexity : O(n2) for hashset solution and O(n) for hashmap solution
// Space Complexity : O(n) for both the solutions

import java.util.*;

public class countUniquePairs {

    private static int countUniquePairs(int[] nums, int k){
        Set<List<Integer>>  uniqueSet = new HashSet<>();

        for(int i = 0;i < nums.length; i++ ){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] - nums[i] == k || nums[i] - nums[j] == k ){
                    List<Integer> pair = Arrays.asList(nums[i], nums[j]);
                    Collections.sort(pair);
                    uniqueSet.add(pair);
                }
            }
        }
        System.out.println("Set : " + uniqueSet.toString());
        return uniqueSet.size();
    }

    private static int uniquePairsCount(int[] nums, int k){
        int pairs  = 0;
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i = 0;i < nums.length; i++ ){
            if(numMap.containsKey(nums[i])){
                numMap.put(nums[i], numMap.get(nums[i]) + 1);
            }else{
                numMap.put(nums[i], 1);
            }
        }
        for(int key : numMap.keySet()){
            if(k>0){
                if(numMap.containsKey(key+k)) pairs++;
            }else{ // check if the key repeats in given nums array
                if(numMap.get(key) > 1) pairs++;
            }
        }
        return  pairs;
    }

    public static void main(String[] args) {
//        System.out.println("Unique pairs : " + uniquePairsCount(new int[]{1,1,1,1,2}, 0));
        System.out.println("Unique pairs : " + countUniquePairs(new int[]{3,1,4,1,5}, 2));
    }
}