import java.util.*;
public class CompetitiveCoding {
    // Time Complexity : N^2
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
    //https://leetcode.com/problems/pascals-triangle/
    //118. Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0;j<=i;j++){
                if(j==0 || j==i) row.add(1);
                else{
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            result.add(row);
        }
        return result;  

    }
// Time Complexity :NLogN
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
    //https://leetcode.com/problems/k-diff-pairs-in-an-array/
    //532. K-diff Pairs in an Array
    public int findPairs(int[] nums, int k) {
        if(nums.length==1) return 0;
     Arrays.sort(nums);
     int count =0;
     int j=0;
     int i =0;
     while(j<nums.length && i<nums.length){
         
         if(i==j || Math.abs(nums[j]-nums[i])<k){
            j++; 
         }else if(Math.abs(nums[j]-nums[i])>k){
            
            i++;
            
         }else{
             j++;
             count++;
             i++;
             while(j<nums.length &&  j >0 && nums[j]==nums[j-1]){
                j++;
            }
         }
         
     }
     return count;

    }
    // Time Complexity : N
// Space Complexity :N
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

    public int findPairs2(int[] nums, int k) {
        if (k < 0) { return 0; }

        Set<Integer> starters = new HashSet<Integer>();
        Set<Integer> uniqs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqs.contains(nums[i] - k)) starters.add(nums[i] - k);
            if (uniqs.contains(nums[i] + k)) starters.add(nums[i]);
            uniqs.add(nums[i]);
        }

        return starters.size();


    }
}
