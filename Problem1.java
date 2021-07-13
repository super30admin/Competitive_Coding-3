// Time Complexity :o(N*2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    //TC:O(N*2)
    //SC:O(1)
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList<>();
        List<List<Integer>> output =new ArrayList<>();
        int count=1;
        while(count<=numRows){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<count;i++){
                if(i==0||i==count-1)temp.add(1);
                else temp.add(output.get(count-2).get(i-1)+output.get(count-2).get(i));
            }
            output.add(temp);
            count++;
        }
        return output;

    }
}