// Time Complexity : 0(N*N)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> target=new ArrayList<>();
        target.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer> element=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    element.add(1);
                }else{
                    element.add(target.get(i-1).get(j)+target.get(i-1).get(j-1));
                }
            }
            target.add(element);
        }
        return target;
    }
}

// Time Complexity : 0(N*N)
// Space Complexity : 0(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}
