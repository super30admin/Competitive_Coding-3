import java.util.HashSet;
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
This approach efficiently finds unique k-diff pairs in an array using two hash sets.
The vis set keeps track of numbers seen so far, while the ans set stores the smaller number
of valid pairs to avoid duplicates. When iterating through nums, if x - k or x + k exists in vis,
a valid pair is found, and we store the smaller number in ans.
Storing x - k ensures that we consistently add the lower value from each pair,
preventing duplicates from being counted twice. By the end, the size of ans gives the count of
unique k-diff pairs.

*/
class KDiffPairs {
    public int findPairs(int[] nums, int k) {


        HashSet<Integer> seen=new HashSet<>();

        HashSet<Integer> unique=new HashSet<>();

        for(int num:nums)
        {
            if(seen.contains(num - k))
            {
                unique.add(num-k);
            }
            if(seen.contains(num + k))
            {
                unique.add(num);
            }
            seen.add(num);
        }



        return unique.size();


    }
}