package s30.arrays.interview;

import java.util.*;

public class findPairs {
    // Time Complexity O(nlogn) :::: as we are sorting the array
    // space complexity O(1)
    public static int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

        int slow = 0;
        int fast =1;
        int count=0;

        while(slow < nums.length && fast < nums.length){


            if(fast != slow && nums[fast] - nums[slow] == k) count++;

            if(nums[fast]- nums[slow] < k) fast++;
            else slow++;

            while(fast < nums.length && nums[fast]== nums[fast-1]) fast++;

            while(slow !=0 && slow < fast && nums[slow] == nums[slow-1]) slow++;



        }

        return count;


        // Time Complexity: O(n)
        // Space complexit: O(n)

//        Map<Integer, Integer> numToCount = new HashMap<>();

//         Set<Integer> store = new HashSet();

//       for(int index=0; index < nums.length; index++){
//           int count = numToCount.getOrDefault( nums[index], 0);

//           count++;

//           numToCount.put(nums[index], count);
//       }

//         int res=0;

//         for(int i =0; i < nums.length; i++){
//            if(!store.contains(nums[i])){
//                 if(k==0){
//                     if(numToCount.get(nums[i])> 1) res++;
//                 }
//                 else if(numToCount.containsKey(nums[i]+k)) res++;
//             }
//             store.add(nums[i]);
//         }

//         return res;

    }
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{1,3,1,5,4},0));
    }
}
