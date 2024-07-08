// Time Complexity : O(n*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        ans.add(l1);
        for (int i=1;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if (j==0 || i==j){
                    l.add(1);
                }   
                else
                {
                    if (i>0 && j>0){
                        int temp = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                        l.add(temp);
                    }
                }
            }
            ans.add(l);
        }
        return ans;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : no
// Any problem you faced while coding this : yes


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        int temp, ans = 0, temp2;
        HashSet<Integer> mp = new HashSet<>();

        for (int i=0;i<nums.length;i++){
             mp.add(nums[i]);
        }

        for (int i=0;i<nums.length;i++){
            // temp = nums[i] - k;
            temp2 = nums[i] + k;
            if (mp.contains(temp2)){
                ans++;
                mp.remove(temp2);
            }
           
        }
        return ans;
    }
}


class Solution {
    public int findPairs(int[] nums, int k) {
        int temp, ans = 0, temp2;
        HashSet<Integer> mp = new HashSet<>();

        
        for (int i=0;i<nums.length;i++){
            temp = nums[i] - k;
            temp2 = nums[i] + k;
            if (mp.contains(temp) || mp.contains(temp2)){
                ans++;
            }
            mp.add(nums[i]);
        }
        return ans;
    }
}