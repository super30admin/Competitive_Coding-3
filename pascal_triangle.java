
// Time Complexity : O(n2)
// Space Complexity : O(n)
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> temp = new ArrayList();
         List<List<Integer>> res = new ArrayList();
        if(numRows==0)
            return res;
        temp.add(1);
        res.add(temp);
        int size = temp.size();
        int n=1;
        while(n<numRows){
            List<Integer> temp1 = new ArrayList();
            temp1.add(1);
            for(int i=0;i<size-1;i++){
                temp1.add(temp.get(i) + temp.get(i+1));
            }
            temp1.add(1);
            res.add(temp1);
            size = temp1.size();
            temp=temp1;
            n++;
        }
        return res;
    }
}
