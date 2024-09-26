import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class kDiffPairHash {

        public int findPairs(int[] nums, int k) {

            int n = nums.length;

            HashMap<Integer, Integer> map = new HashMap<>();

            // map of nums and indices
            for(int i = 0; i < n; i++){ //O(n)

                map.put(nums[i], i);
            }

            HashSet<List<Integer>> set = new HashSet<>();
            //
            for(int i = 0; i < n; i++){ //O(n)

                int complement1 = nums[i] - k;
                int complement2 = nums[i] + k;

                if(map.containsKey(complement1)){

                    List<Integer> li = new ArrayList<>();

                    li.add(nums[i]);
                    li.add(complement1);

                    Collections.sort(li);

                    if(!set.contains(li) && map.get(complement1) != i){

                        set.add(li);
                    }
                }

                if(map.containsKey(complement2)){

                    List<Integer> li = new ArrayList<>();

                    li.add(nums[i]);
                    li.add(complement2);

                    Collections.sort(li);

                    if(! set.contains(li) && map.get(complement2) != i){

                        set.add(li);
                    }
                }

            }
            return set.size();

        }

        /*
        Time Complexity = O(n)
        Space Complexity = O(n)
        */

        public static void main(String[] args){

            kDiffPairHash object = new kDiffPairHash();

            int[] arr = {5,2,9,3,5,7};

            int kDiff = 4;

            int answer = object.findPairs(arr, kDiff);

            System.out.println("Number of unique pairs in the array with k-difference is " + answer);
        }
}

/*
class Solution {

    public int findPairs(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        int n=nums.length;

        for(int i = 0; i < n; i++){

            for(int j = i+1; j < n; j++){

                int diff = Math.abs(nums[i]-nums[j]);

                if(diff==k){

                    int min = Math.min(nums[i],nums[j]);
                    int max = Math.max(nums[i],nums[j]);

                    map.put(min,max);
                }
            }
        }
        return map.size();
    }
}
 */