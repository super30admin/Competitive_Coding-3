// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//K different pairs in a array
//time o(nlogn)
//space o(1)
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if(nums == null || nums.length == 0)
            return 0;
        int fastPtr = 0, slowPtr = 0;
        Arrays.sort(nums);
        
        while(fastPtr < nums.length) {
            if(fastPtr == slowPtr)
                fastPtr++;
            else if(nums[fastPtr]-nums[slowPtr] == k) {
                count++;
                slowPtr++;
                fastPtr++;
                while(fastPtr < nums.length && (nums[fastPtr] == nums[fastPtr-1])) {
                    fastPtr++;
                }
            }
            else if(nums[fastPtr]-nums[slowPtr] > k) {
                slowPtr++;
            }
            else{
                fastPtr++;
            }
        }
        return count;
    }
}

//time o(n pow 2)
//space o(n pow 2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<numRows;i++) {
            List<Integer> row = new ArrayList<>();
            if(i == 0)
                row.add(1);
            else {
                for(int j=0;j<=i;j++) {
                    if(j == 0 || j == i){
                        row.add(1);
                    }
                    else {
                        int left = res.get(i-1).get(j-1);
                        int right = res.get(i-1).get(j);
                        row.add(left + right);
                    }
                }
            }
            res.add(row);
        }
        return res;
    }
}