import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
// take a map and store the key value pair, of nums[i] and corresponding index
// then in the loop, check if the complement exists 
// there are two complements num[i] - k and nums[i] + k
// we check for complement and make sure that the complement's index is not the current element's index
// insert in the hashset and return the result size

//Time Complexity: O(n) since lookup time is O(1)
//Space complexity: O(n) storing the values and index


public class KDiff {

    public static void main(String[] args)
    {
        int nums[] = {3,1,4,1,5};
        int k = 2;
        int result = findPairs(nums,k);
        System.out.println("Result is  " + result);
    }
    
    public static int findPairs(int[] nums, int k) {
        if(k<0)
        {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        HashSet<List<Integer>> result=new HashSet<>();

        for(int i=0; i< nums.length; i++)
        {
            map.put(nums[i], i);
        }

        for(int i=0; i < nums.length; i++)
        {
            int complement1 = nums[i] - k;
            int complement2 = nums[i] + k;

            if(map.containsKey(complement1))

            {

                List<Integer> temp= new ArrayList<>();

                temp.add(nums[i]);

                temp.add(complement1);

                Collections.sort(temp);

                if(!result.contains(temp) && map.get(complement1)!=i)

                {

                    result.add(temp);

                }

            }

            if(map.containsKey(complement2))

            {

                List<Integer> temp= new ArrayList<>();

                temp.add(nums[i]);

                temp.add(complement2);

                Collections.sort(temp);

                if(!result.contains(temp) && map.get(complement2)!=i)

                {

                    result.add(temp);

                }

            }
        }

        return result.size();

    }

}
