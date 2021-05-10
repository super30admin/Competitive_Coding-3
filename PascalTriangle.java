// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We form the pascal triangle top-down, layer by layer.
    We foorm the layer by using the previous layer as the base..
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> latest = new ArrayList<>();
        latest.add(1);
        result.add(latest);
        
        for (int i=1; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            int j=-1;
            int k=0;
            for (; k<=latest.size();){
                int sum = 0;
                if (j>=0 && j<latest.size())
                    sum += latest.get(j);
                if (k>=0 && k<latest.size())
                    sum += latest.get(k);
                temp.add(sum);
                j++;
                k++;
            }
            result.add(temp);
            latest = temp;
        }
        return result;
    }
}