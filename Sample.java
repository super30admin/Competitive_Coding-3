Competetive coding 2 solutons:

Problem 1: k-diff-pairs-in-an-array
https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int slow=0;
        int fast=0;
        while(slow<nums.length && fast<nums.length){
        if(slow==fast || nums[fast]-nums[slow] < k) fast++;
        else if(nums[fast]-nums[slow] > k) slow++;
        else{
            c++; slow++;fast++;
            while(fast<nums.length && nums[fast]==nums[fast-1]) fast++;
        }
        }
    return c;
    }
}



Problem 2: Pascal Triangle
https://leetcode.com/problems/pascals-triangle/
// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) r.add(1);
                else{
                    int first = lst.get(i-1).get(j-1);
                    int second = lst.get(i-1).get(j);
                    r.add(first+second);
                }
            }
            lst.add(r);
        }
        return lst;
    }
}